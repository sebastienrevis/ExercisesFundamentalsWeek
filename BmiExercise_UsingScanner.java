package be.vdab.ScannerExercise;

import java.util.Scanner;

public class BmiExercise_UsingScanner {

    public static void BmiCalculator() {
        Scanner s = new Scanner(System.in);
        System.out.print("Gewicht in kilogram: ");
        double gewicht = s.nextDouble();
        System.out.print("Lengte in centimeters: ");
        double lengte = s.nextDouble();
        double BMI = (gewicht / ((lengte / 100) * (lengte / 100)));
        System.out.println("Uw BMI is: " + BMI);
        if (BMI > 25)
            System.out.println("U moet afvallen :)");
        if (BMI < 18.5)
            System.out.println("U moet meer eten :)");
        if (BMI >= 18.5 && BMI <= 25)
            System.out.println("U hoeft niets te doen :)");
    }

    public static void main(String[] args) {
        BmiCalculator();
        System.out.println();
        BmiCalculator();
        System.out.println();
        BmiCalculator();
        System.out.println();
    }
}
