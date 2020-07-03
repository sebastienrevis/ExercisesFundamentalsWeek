package be.vdab.Arrays;

public class ArrayExercise_Top3MinAndMax {
    public static void main(String args[]) {
        double[] myList = new double[10];

        int l = myList.length;

        myList[0] = 5.6;
        myList[1] = 4.5;
        myList[2] = 2.0;
        myList[3] = 13.2;
        myList[4] = 4.0;
        myList[5] = 34.33;
        myList[6] = 34.0;
        myList[7] = 45.45;
        myList[8] = 99.993;
        myList[9] = 11123;

        double max = myList[0];
        int indexOfMax = 0;
        for (int i = 1; i < l; i++) {
            if (myList[i] > max) {
                max = myList[i];
                indexOfMax = i;
            }
        }

        double min = myList[0];
        int indexOfMin = 0;
        for (int j = 1; j < l; j++) {
            if (myList[j] < min) {
                min = myList[j];
                indexOfMin = j;
            }
        }

        System.out.println("There are " + l + " elements in the list");
        System.out.println("Here's are the top three and the min and max values:");
        System.out.println();

        for (int k = 0; k < (l - 7); k++) {
            System.out.println("Element " + k + " is " + myList[k]);
        }
        System.out.println();
        System.out.println("The maximum is " + myList[indexOfMax] + " and the minimum is: " + myList[indexOfMin]);
    }
}
