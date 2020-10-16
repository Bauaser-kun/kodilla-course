package com.kodilla.testing.collection;

import java.util.LinkedList;
import java.util.List;

public class OddNumbersExterminator {
    public List<Integer> exterminate(List<Integer> numbers) {
        List<Integer> evenNumbersList = new LinkedList<Integer>();

        for (Integer number : numbers) {
            if (number % 2 == 0) {
                evenNumbersList.add(number);
            }
        }
        if (evenNumbersList.size() == 0) {
            System.out.println("There were no even numbers in provided list.");
        } else {
            System.out.println("Even numbers from provided list are:");
            for (Integer even : evenNumbersList) {
                System.out.println(even);
            }
        }
        return evenNumbersList;
    }
}