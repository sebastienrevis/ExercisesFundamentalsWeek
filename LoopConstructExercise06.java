package be.vdab.LoopConstructs;

public class LoopConstructExercise06 {
     public static void main(String[] args) {
          for (int i = 0; i < 1000; i++){
              if ((i % 6 == 0) & (i % 28 == 0))
                   System.out.println(i);
          }
     }
}
