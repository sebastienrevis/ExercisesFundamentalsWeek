package be.vdab.ExceptionHandling;

import java.util.Scanner;

public class ExceptionHandlingExample3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Enter a value: ");
            int value = input.nextInt();
            if (value < 40)
                throw new Exception("value is too small");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("Continue after the catch block");
    }
}

