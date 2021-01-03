import CTLFormula.CTLFormulaLexer;
import CTLFormula.CTLFormulaParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;

public class FormulaParse {

    public HashMap<Integer,ArrayList<Integer>> sf = new HashMap<>();
    public HashMap<Integer,String> subf = new HashMap<>();
    public HashMap<Integer,String> nf = new HashMap<>();
    public HashMap<Integer,String> nf2 = new HashMap<>();

    public int id=0;
    public ParseTree run(String expr) throws Exception{
        // 对每一个输入的字符串，构造一个 ANTLRStringStream 流 in
        ANTLRInputStream input = new ANTLRInputStream(expr);
        // 用 in 构造词法分析器 lexer，词法分析的作用是将字符聚集成单词或者符号
        CTLFormulaLexer lexer = new CTLFormulaLexer(input);
        // 用词法分析器 lexer 构造一个记号流 tokens
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        // 再使用 tokens 构造语法分析器 parser,至此已经完成词法分析和语法分析的准备工作
        CTLFormulaParser parser = new CTLFormulaParser(tokens);
        // 最终调用语法分析器的规则 r（这个是我们在Hello.g4里面定义的那个规则），完成对表达式的验证
        ParserRuleContext t = parser.parse();
        //t.inspect(parser);
        ParseTree pt = t.getChild(0);
        return pt;
        //System.out.println(pt.getChild(2).getChild(3).toStringTree());
        //System.out.println(pt.getChild(2).getText());
    }

    // 得到sf
    private int dfs(ParseTree pt) {
        id++;
        int f_id = id;
        String formula = pt.getText();//
        ArrayList<Integer> sons = new ArrayList<>();
        for (int i=0;i<pt.getChildCount();i++){
            ParseTree node = pt.getChild(i);
            if (node.getChildCount()>0) { // 有子节点
                int s_id = dfs(node);
                sons.add(s_id);
            }
        }
        subf.put(f_id,formula);
        sf.put(f_id,sons);
        return f_id;
    }

    public void main(String[] args) throws Exception{
        String[] testStr={
                //"A_G_(RcvMsg->A_[RcvMsg U_ (~RcvMsg & A_[~RcvMsg U_ SndMsg])])"
                //"A_[~X U_ Y|Z]"
                "A_G_(T1->A_F_ C1)"
        };
        for(String s : testStr){
            System.out.println("Input: " + s);
            ParseTree pt = run(s);

            dfs(pt);
            //id = 0;
            //dfs2(pt);

            parseFormula(subf);

            System.out.println(subf);

            outputToText();

        }
    }

    private void outputToText() throws IOException {
        File f=new File("parse.txt");//指定文件
        FileOutputStream fos=new FileOutputStream(f);//创建输出流fos并以f为参数
        OutputStreamWriter osw=new OutputStreamWriter(fos);//创建字符输出流对象osw并以fos为参数
        BufferedWriter bw=new BufferedWriter(osw);//创建一个带缓冲的输出流对象bw，并以osw为参数

        bw.write("nf");//使用bw写入一行文字，为字符串形式String
        bw.newLine();//换行

        for (int i = 1; i <= nf2.size(); i++) {
            bw.write(i+" "+nf2.get(i));//使用bw写入一行文字，为字符串形式String
            bw.newLine();//换行
        }

        bw.write("sf");//使用bw写入一行文字，为字符串形式String
        bw.newLine();
        for (int i = 1; i <= sf.size(); i++) {
            if (sf.get(i).isEmpty())
                bw.write(i+" nil");
            else
                bw.write(i+" "+sf.get(i).toString().replaceAll("\\[","").replaceAll("\\]","").replaceAll(" ",""));
            bw.newLine();
        }

        bw.close();//关闭并保存
    }

    private String delete(String s1,String s2){
        int len1 = s1.length();
        int len2 = s2.length();
        for (int i=0;i<len1-len2+1;i++){
            String temp = s1.substring(i,i+len2);
            if (temp.equals(s2)){
                s1 = s1.substring(0,i)+s1.substring(i+len2);
                break;
            }
        }
        return s1;
    }
    private void parseFormula(HashMap<Integer, String> subf) {
        for (int i = subf.size(); i >=1; i--) {
            //if (sf[i]==null)
            String op = subf.get(i);
            //System.out.println(sf.get(i));
            if (sf.get(i).isEmpty()){
                //System.out.println(op);
                nf.put(i,op);
                nf2.put(i,op);
            }else if (sf.get(i).size()==2){
                for (int j = 0;j<sf.get(i).size();j++){
                    int del = sf.get(i).get(j);
                    //System.out.println(subf.get(del));
                    op = delete(op,subf.get(del));
                }
                op = op.replaceAll("\\[","").replaceAll("\\]","").replaceAll("\\(","").replaceAll("\\)","");
                //System.out.println(op);
                String newop = null;
                if (op.equals("&"))
                    newop = "AND";
                else if (op.equals("|"))
                    newop = "OR";
                else if (op.equals("A_U_"))
                    newop = "AU";
                else if (op.equals("E_U_"))
                    newop = "EU";
                else if (op.equals("U_"))
                    newop = "U";
                else if (op.equals("->"))
                    newop = "IMP";
                else
                    System.out.println(op);
                nf2.put(i,newop);
                String f ="(" + newop+" "+nf.get(sf.get(i).get(0))+" "+nf.get(sf.get(i).get(1))+")";
                //System.out.println(f);
                nf.put(i,f);
            }else if (sf.get(i).size()==1){
                int del = sf.get(i).get(0);
                op = delete(op,subf.get(del));
                op = op.replaceAll("\\[","").replaceAll("\\]","").replaceAll("\\(","").replaceAll("\\)","");
                //System.out.println(op);
                String newop = null;
                if (op.equals("~"))
                    newop = "NOT";
                else if (op.equals("A_X_"))
                    newop = "AX";
                else if (op.equals("E_X_"))
                    newop = "EX";
                else if (op.equals("A_F_"))
                    newop = "AF";
                else if (op.equals("E_F_"))
                    newop = "EF";
                else if (op.equals("A_G_"))
                    newop = "AG";
                else if (op.equals("E_G_"))
                    newop = "EG";
                else
                    System.out.println(op);
                nf2.put(i,newop);
                String f = "(" + newop + " "+nf.get(sf.get(i).get(0))+")";
                //System.out.println(f);
                nf.put(i,f);
            }else
                System.out.println("Error!");
        }
    }
}