package com.loxus.assessment.core.calculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class ListenerBasedCalculatorTest {
    @DisplayName("evaluate simple mathematical expressions")
    @ParameterizedTest
  @MethodSource("com.loxus.assessment.core.calculator.MathExamples#mathExamples")
    void evaluateMathExpressions(String expression, Double expectedResult) {
        Calculator calculator = new ListenerBasedCalculator();
        Double result = calculator.calculate(expression);
        assertEquals(expectedResult, result);
    }
}