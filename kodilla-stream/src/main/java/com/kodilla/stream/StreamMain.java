package com.kodilla.stream;

import com.kodilla.stream.beatifier.PoemBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain {
    public static void main(String[] args) {
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        System.out.println("Calculating expressions with lambdas");
        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);
        System.out.println("");

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);
        System.out.println("");

        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("This should be uppercased.", text -> text.toUpperCase());
        poemBeautifier.beautify("This should be in \"ABC\" braces.", text -> "ABC " + text + " ABC");
        poemBeautifier.beautify("While this should be underlined and yellow.", text ->"\033[4;33m" + text + "\033[0m");
        poemBeautifier.beautify("This should be simply written in red.", text -> "\033[0;31m" + text + "\033[0m");
        System.out.println("");

        System.out.println("Using Stream to generate even numbers from 1 to 20.");
        NumbersGenerator.generateEven(20);

    }
}
