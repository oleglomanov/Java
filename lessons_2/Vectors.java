package lessons_2;

public class Vectors   {



    public static void mult(ArrayVectorl2 vector1, int mult) {
        int multiply[] = new int[vector1.getVectorSize()];

        for (int i = 0; i < vector1.getVectorSize(); i++) {
            multiply[i] = vector1.getElement(i) * mult;
        }
        for (int i1 : multiply) {
            System.out.print(i1 + " ");
        }
    }

  public static void sum (ArrayVectorl2 vector1 , ArrayVectorl2 vector2) {
      int sumVector[] = new int[vector1.getVectorSize()];

      for (int i = 0; i < vector1.getVectorSize(); i++) {
          sumVector[i] = vector1.getElement(i) + vector2.getElement(i);
      }
      for (int i1 : sumVector) {
          System.out.print(i1 + " ");
      }
  }


    public static void scalar  (ArrayVectorl2 vector1 , ArrayVectorl2 vector2) {
        int scalarnum[] = new int[vector1.getVectorSize()];

        for (int i = 0; i < vector1.getVectorSize(); i++) {
            scalarnum[i] = vector1.getElement(i) * vector2.getElement(i);
        }
        for (int i1 : scalarnum) {
            System.out.print(i1 + " ");
        }
    }

}