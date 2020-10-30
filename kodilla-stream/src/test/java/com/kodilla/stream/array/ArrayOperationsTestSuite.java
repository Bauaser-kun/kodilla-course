package com.kodilla.stream.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage(){
        //Given
        int[] numbers = new int[10];
        for (int i = 0; i < 10; i++) {
            numbers[i] = (int)Math.pow(i, 2);
        }
        //When
        double average = ArrayOperations.getAverage(numbers);
        //Then
        Assertions.assertEquals(28.5, average);
    }
}
