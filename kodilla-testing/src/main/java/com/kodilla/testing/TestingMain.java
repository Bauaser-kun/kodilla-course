package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        Calculator calculator = new Calculator();

        double checkCalculator = calculator.adding(10.5, 2.0);

        if (checkCalculator == 12.5) {
            System.out.println("Calculator add test OK");
        } else {
            System.out.println("Calculator add Error!");
        }

        checkCalculator = calculator.substracting(10.5, 2.0);

        if (checkCalculator == 8.5) {
            System.out.println("Calculator substract test OK");
        } else {
            System.out.println("Calculator substract Error!");
        }
    }
}
