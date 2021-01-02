// Generated from E:/Workspace/idea/系统分析验证/CTLFormula/src/main/java\CTLFormula.g4 by ANTLR 4.9
package CTLFormula;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

/**
 * This class provides an empty implementation of {@link CTLFormulaVisitor},
 * which can be extended to create a visitor which only needs to handle a subset
 * of the available methods.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public class CTLFormulaBaseVisitor<T> extends AbstractParseTreeVisitor<T> implements CTLFormulaVisitor<T> {
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitParse(CTLFormulaParser.ParseContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitFormula(CTLFormulaParser.FormulaContext ctx) { return visitChildren(ctx); }
}