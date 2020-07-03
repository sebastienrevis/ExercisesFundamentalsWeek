package be.vdab.Arrays;

public class ArrayExercise_MonthsInYear {
    public static void main(String args[]) {
        String[] months = {
                "January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"};

        int m = months.length;

        System.out.println("Months containing the letter 'a': ");
        for (int i=0; i<m; i++)
            if (months[i].contains("a")){
                System.out.print(months[i] + " ");
            }

        System.out.println();
        System.out.println();

        System.out.println("All the months in the list");
        for (String j: months) {
            System.out.print(j + " ");
        }

        System.out.println();
    }
}
