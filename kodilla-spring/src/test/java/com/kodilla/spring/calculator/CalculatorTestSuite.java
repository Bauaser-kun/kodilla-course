package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CalculatorTestSuite {
    @Autowired
    Calculator calculator;

    @Test
    void testCalculations() {
        //Given
        //When
        calculator.addAToB(2, 2);
        calculator.substractBFromA(3, 1);
        calculator.multipleATimesB(2,2);
        calculator.divideATimesB(2,2);
        //Then
        //Expect 4.0    2.0    4.0  and 1.0
    }
}
