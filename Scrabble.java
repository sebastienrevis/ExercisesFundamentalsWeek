package be.vdab.ScannerExercise;

import java.util.Scanner;  // Import the Scanner class

class Scrabble {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter letter");

        String letter = myObj.nextLine();  // Read user input
        switch (letter) {
            case "a":
            case "e":
            case "l":
            case "n":
            case "o":
            case "r":
            case "s":
            case "t":
            case "u":
                System.out.println("The value of " + letter + " is 1");
                break;
            case "d":
            case "g":
            case "h":
            case "i":
                System.out.println("The value of " + letter + " is 2");
                break;
            case "b":
            case "c":
            case "m":
            case "p":
                System.out.println("The value of " + letter + " is 3");
                break;
            case "f":
            case "v":
            case "w":
            case "y":
                System.out.println("The value of " + letter + " is 4");
                break;
            case "k":
                System.out.println("The value of " + letter + " is 5");
                break;
            case "j":
            case "x":
                System.out.println("The value of " + letter + " is 8");
                break;
            case "q":
            case "z":
                System.out.println("The value of " + letter + " is 10");
                break;
            default:
                System.out.println("No value");
        }
    }
}