package com.kodilla.exception.test;

public class FirstChallenge {

    public double divide (double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException();
        }
        return a / b;
    }

    /**
     * This main can throw ana ArithmeticException!!!
     * @param args
     */
    public static void main(String[] args) {
        FirstChallenge firstChallenge = new FirstChallenge();

        try {
        double result = firstChallenge.divide(3, 0);
        System.out.println(result);
    } catch (ArithmeticException e) {
            System.out.println("DIVIDING BY 0? SERIOUSLY? " +
                    "\nWell... you asked for this error:\n" + e);
        } finally {
            System.out.println("I hope thast you got what you wanted.");
        }
    }
}
