package be.vdab.Arrays;

public class ArrayExercise_ShiftingElements {
    public static void main(String args[]) {

        double[] myList = new double[10];

        int l = myList.length;
        System.out.println("The list length is: " + l);

        myList[0] = 0.0;
        myList[1] = 4.5;
        myList[2] = 3.3;
        myList[3] = 13.2;
        myList[4] = 4.0;
        myList[5] = 34.33;
        myList[6] = 34.0;
        myList[7] = 45.45;
        myList[8] = 99.993;
        myList[9] = 9.0;

        // Store the value of the first element in the temp variable, otherwise it gets overwritten in
        // the loop and you cannot use it later on
        double temp = myList[0];

        for (int i = 1; i < myList.length; i++) {
            // Shift elements left
            myList[i - 1] = myList[i];
        }

        // Assign the first value of the list to last element by retrieving the temp value
        myList[myList.length-1] = temp;

        for (int j = 0; j < myList.length; j++) {
            System.out.println("Element " + (j) + " " + myList[j]);
        }
    }
}