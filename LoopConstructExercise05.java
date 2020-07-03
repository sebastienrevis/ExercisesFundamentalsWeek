package be.vdab.LoopConstructs;

public class LoopConstructExercise05 {
     public static void main(String[] args){
     int i, j, n=3;

          for(i=0; i<n; i++){

               for(j=0; j<=i; j++){
                    System.out.print("* ");
               }
               System.out.println();
          }
     }
}