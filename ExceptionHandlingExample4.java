package be.vdab.ExceptionHandling;

import java.util.Scanner;

public class ExceptionHandlingExample4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a value: ");
        int testType = (int) input.nextInt();

        switch (testType) {
            case 1:
                for (int i = 0; i < 2; i++) {
                    System.out.print(i + " ");
                    try {
                        System.out.println(1 / 0);
                    } catch (Exception ex) {
                    }
                }
            case 2:
                try {
                    for (int i = 0; i < 2; i++) {
                        System.out.print(i + " ");
                        System.out.println(1 / 0);
                    }
                } catch (Exception ex) {
                }
        }
    }
}
