package be.vdab.ArrayLists;

import java.util.ArrayList;
import java.util.Arrays;

public class UsefulMethodsForArrayLists {
    public static void main(String[] args) {
        // Often you need to create an array list from an array of objects or vice versa. You can write the
        // code using a loop to accomplish this, but an easy way is to use the methods in the Java API.
        // Here is an example to create an array list from an array:
        String[] array1 = {"red", "green", "blue"};
        ArrayList<String> list1 = new ArrayList<>(Arrays.asList(array1));

        // The static method asList in the Arrays class returns a list that is passed to the ArrayList
        // constructor for creating an ArrayList. Conversely, you can use the following code to create
        // an array of objects from an array list:
        String[] array2 = new String[list1.size()];
        list1.toArray(array1);
        System.out.println(list1);

        // nvoking list.toArray(array1) copies the contents from list to array1. If the elements
        // in a list are comparable, such as integers, double, or strings, you can use the static
        // sort method in the java.util.Collections class to sort the elements. Here are some
        // examples:
        Integer[] array3 = {3, 5, 95, 4, 15, 34, 3, 6, 5};
        ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(array3));
        java.util.Collections.sort(list3);
        System.out.println(list3);

        // You can use the static max and min in the java.util.Collections class to return the
        // maximum and minimal element in a list. Here are some examples:
        Integer[] array4 = {3, 5, 95, 4, 15, 34, 3, 6, 5};
        ArrayList<Integer> list4 = new ArrayList<>(Arrays.asList(array4));
        System.out.println(java.util.Collections.max(list4));
        System.out.println(java.util.Collections.min(list4));

        // You can use the static shuffle method in the java.util.Collections class to perform a
        // random shuffle for the elements in a list. Here are some examples:
        Integer[] array5 = {3, 5, 95, 4, 15, 34, 3, 6, 5};
        ArrayList<Integer> list5 = new ArrayList<>(Arrays.asList(array5));
        java.util.Collections.shuffle(list5);
        System.out.println(list5);
    }
}
