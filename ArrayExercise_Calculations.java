package be.vdab.Arrays;

public class ArrayExercise_Calculations {

        public static void main(String args[]){
            int[] array = {1, 2, 3, 4, 5, 7, 8, 9, 10};
            int sum = 0;
            int arrayLength = array.length;

            for (int num : array) {
                sum = sum+num;
            }

            System.out.println("The number of elements in the array is: "+arrayLength);
            System.out.println("The sum of the array elements is: "+sum);
            System.out.println("Average of array elements is: "+sum/arrayLength);
        }
}

