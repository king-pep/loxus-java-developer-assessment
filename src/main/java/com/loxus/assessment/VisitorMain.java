package com.loxus.assessment;

import com.loxus.assessment.core.calculator.VisitorBasedCalculator;
import com.loxus.assessment.infrastructure.driver.Repl;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class VisitorMain {
    public static void main(String[] args) throws IOException {
        Repl repl = new Repl(
                new InputStreamReader(System.in),
                new VisitorBasedCalculator(),
                new PrintWriter(System.out)
        );

        repl.start();
    }
}
