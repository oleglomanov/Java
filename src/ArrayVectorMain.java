package src;

public class ArrayVectorMain {


    public static void main(String[] args)  {


        ArrayVector vector1 = new ArrayVector(4);
        ArrayVector vector2 = new ArrayVector(4);

        /**
         *
         *  Заполняю первый элемент
         */

        for (int i = 0; i < vector1.getVectorSize(); i++) {
            double r = Math.random()*100;
            int b = (int)r;
            vector1.setElement(i, b);
                System.out.println( " Все элементы по вектору 1 " + vector1.getElement(i));
            
        }

        /**
         *
         * Заполняю второй элемент
         *
         */


        for (int i = 0; i < vector2.getVectorSize(); i++) {
            double r = Math.random()*100;
            int b = (int)r;
            vector2.setElement(i, b);
                System.out.println(" Все элементы вектора 2 : " + vector2.getElement(i));
          
        }

        System.out.println(" Элемент по заданному индексу для вектора 1 : " + vector1.getElement(3));
        System.out.println(" Заданный элемент для вектора 1 : "+ vector1.setElement(1,17));
        System.out.println(" Длинна массива : "+ vector1.getVectorSize() + " элементов");
        System.out.println(" Минимальный элемент : "+ vector1.getMin());
        System.out.println(" Максимальный элемент : "+ vector1.getMax());
        System.out.println(" Поиск индекса элемена : " + vector1.find(17));
        System.out.println(" Среднее арифметическое  : " + vector1.getAverage());
        System.out.println(" Евклидова норма  : " + vector1.getNorm());
        System.out.println(" умножения вектора на число : "); ArrayVector.mult(vector1,5) ;
        System.out.println(" Cортировки вектора : ");vector1.sort();
        System.out.println("\n"+ "Результат сложения векторов  :");ArrayVector.sum(vector1,vector2);
        System.out.println("\n"+ "Результат скалярного произведения двух векторов:");ArrayVector.scalarvector(vector1,vector2);

    }
<<<<<<< HEAD
}
=======
}







>>>>>>> 7a3f80739a1255ed2b3a0398534dbfa0090b2b3d
