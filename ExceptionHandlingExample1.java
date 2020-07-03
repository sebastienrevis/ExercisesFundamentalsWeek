package be.vdab.ExceptionHandling;

import java.util.Scanner;

public class ExceptionHandlingExample1 {

    public static double quotient(int number1, int number2) {
        if (number2 == 0)
            throw new ArithmeticException("Denominator cannot be zero");

        double result = (((double) number1) / ((double) number2));
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter two integers
        System.out.println("Let's test a division operation with integers: ");
        System.out.print("Enter the nominator: ");
        int number1 = input.nextInt();
        System.out.print("Enter the denominator: ");
        int number2 = input.nextInt();

        try {
            double result = quotient(number1, number2);
            System.out.println(number1 + " / " + number2 + " is " + result);
            }
        catch (ArithmeticException ex) {
            System.out.println("Exception: an integer " + "cannot be divided by zero ");

            }

        System.out.println("Execution continues ...");
    }
}

