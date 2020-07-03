package be.vdab.Arrays;

import java.util.Arrays;

public class ArrayExercise_InsertingElements {
    public static void main(String args[]) {

            // Define an array and assign a variable that calculates the length of the array
            int[] arrayOriginal = {1, 2, 3, 4, 5, 6, 7, 8};
            int l = arrayOriginal.length;

            // Define a new element with value 'newValue' at the 'Index_position' of the array
            int newValue = 9;
            int indexNewValue = 3;

            // Print out the original array (this must be done before the insertion loop)
            System.out.println("Original Array : "+Arrays.toString(arrayOriginal));

            // Select all the elements above the new index value using a decreasing for loop that
            // runs from the last index value until but excluding the index value of the new element
            for(int i=l-1; i > indexNewValue; i--){
                arrayOriginal[i] = arrayOriginal[i-1];
            }

            // Insert the new element with its defined value and position in the array
            arrayOriginal[indexNewValue] = newValue;

            // Print out the new array (this must be done after the insertion loop)
            System.out.println("New Array:       "+Arrays.toString(arrayOriginal));
    }
}
