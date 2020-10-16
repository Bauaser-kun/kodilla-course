package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;

import java.util.LinkedList;
import java.util.List;

public class CollectionTestSuite {

    @BeforeEach
    public void before() {
        System.out.println("Test remove odd numbers: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test remove odd numbers: end");
    }

    @DisplayName(
            "When empty list is given message " +
            "'There were no even numbers in provided list.' is produced"
    )

    @Test
    void testOddNumbersExterminatorEmptyList(){
        //Given
        List<Integer> numbers = new LinkedList<>();
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        //When
        List<Integer> result = exterminator.exterminate(numbers);
        List<Integer> expected = new LinkedList<>();
        //Then
        Assertions.assertEquals(expected, result);
    }

    @DisplayName(
            "When list with numbers is given only even numbers are printed"
    )

    @Test
    void testOddNumbersExterminatorNormalList(){
        //Given
        List<Integer> numbers = new LinkedList<>();
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        for (int i = 0; i<9; i++) {
            numbers.add(i+50);
        }
        //When
        List<Integer> result = exterminator.exterminate(numbers);
        List<Integer> expected = new LinkedList<>();
        expected.add(50);
        expected.add(52);
        expected.add(54);
        expected.add(56);
        expected.add(58);
        //Then
        Assertions.assertEquals(expected,result);
    }
}
