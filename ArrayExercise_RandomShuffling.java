package be.vdab.Arrays;

import java.util.Arrays;

public class ArrayExercise_RandomShuffling {
    public static void main(String args[]) {

        double[] myList = new double[10];
        int l = myList.length;

        myList[0] = 0.0;
        myList[1] = 1.0;
        myList[2] = 2.0;
        myList[3] = 3.0;
        myList[4] = 4.0;
        myList[5] = 5.0;
        myList[6] = 6.0;
        myList[7] = 7.0;
        myList[8] = 8.0;
        myList[9] = 9.0;

        // Print out the original array (before the insertion loop)
        System.out.println("Original list : " +Arrays.toString(myList));

        for (int i = 0; i < l-1; i++) {
            // Generate an index j randomly
            int j = (int) (Math.random() * 7);

            // Swap myList[i] with myList[j]
            double temp = myList[i];
            myList[i] = myList[j];
            myList[j] = temp;
            System.out.print("Random index j: " +j);
        }
        // Print out the modified array (after the insertion loop)
        System.out.println("New list :      " +Arrays.toString(myList));

    }
}
