package com.kodilla.exception.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExceptionHandlingTestSuite {

    @Test
    void probablyIWillThrowAnExceptionTestWhenXGreaterThan2() {
        //Given
        SecondChallenge secondChallenge = new SecondChallenge();
        //When
        double x = 3;
        double y = 1.1;
        //Then
        Assertions.assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(x, y));
    }

    @Test
    void probablyIWillThrowAnExceptionTestWhenXEquals2() {
        //Given
        SecondChallenge secondChallenge = new SecondChallenge();
        //When
        double x = 2;
        double y = 1.1;
        //Then
        Assertions.assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(x, y));
    }

    @Test
    void probablyIWillThrowAnExceptionTestWhenYEquals1AndHalf() {
        //Given
        SecondChallenge secondChallenge = new SecondChallenge();
        //When
        double x = 1.9;
        double y = 1.5;
        //Then
        Assertions.assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(x, y));
    }

    @Test
    void probablyIWillThrowAnExceptionTestWhenXLowerThan1() {
        //Given
        SecondChallenge secondChallenge = new SecondChallenge();
        //When
        double x = 0.9;
        double y = 1.1;
        //Then
        Assertions.assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(x, y));
    }

    @Test
    void probablyIWillThrowAnExceptionTestWhenXAndYAreInProperRange() {
        //Given
        SecondChallenge secondChallenge = new SecondChallenge();
        //When
        double x = 1.9;
        double y = 1.1;
        //Then
        Assertions.assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(x, y));
    }
}
