package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main(String[] args) {
        SecondChallenge secondChallenge = new SecondChallenge();
        try {
            System.out.println("Lets try working code");
            System.out.println((secondChallenge.probablyIWillThrowException(1.9, 1.8)) + "\n");
            System.out.println("Lets try an error");
            System.out.println(secondChallenge.probablyIWillThrowException(2, 1));
        } catch (Exception e) {
            System.out.println("Try agaian! Error: " + e);
        } finally {
            System.out.println("Hope it worked how it should!");
        }
    }
}
