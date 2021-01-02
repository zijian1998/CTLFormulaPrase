// Generated from E:/Workspace/idea/系统分析验证/CTLFormula/src/main/java\CTLFormula.g4 by ANTLR 4.9
package CTLFormula;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CTLFormulaParser}.
 */
public interface CTLFormulaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CTLFormulaParser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse(CTLFormulaParser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CTLFormulaParser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse(CTLFormulaParser.ParseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CTLFormulaParser#formula}.
	 * @param ctx the parse tree
	 */
	void enterFormula(CTLFormulaParser.FormulaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CTLFormulaParser#formula}.
	 * @param ctx the parse tree
	 */
	void exitFormula(CTLFormulaParser.FormulaContext ctx);
}