// Generated from com.loxus.assessment.core.parser/Calculator.g4 by ANTLR 4.7.1
package com.loxus.assessment.core.parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import com.loxus.assessment.core.parser.CalculatorParser;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CalculatorParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CalculatorVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CalculatorParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(CalculatorParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Number}
	 * labeled alternative in {@link CalculatorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(CalculatorParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AdditionOrSubtraction}
	 * labeled alternative in {@link CalculatorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditionOrSubtraction(CalculatorParser.AdditionOrSubtractionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MultiplicationOrDivision}
	 * labeled alternative in {@link CalculatorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicationOrDivision(CalculatorParser.MultiplicationOrDivisionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Parentheses}
	 * labeled alternative in {@link CalculatorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParentheses(CalculatorParser.ParenthesesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Power}
	 * labeled alternative in {@link CalculatorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPower(CalculatorParser.PowerContext ctx);
}