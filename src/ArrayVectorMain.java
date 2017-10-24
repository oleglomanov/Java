package src;

public class ArrayVectorMain {


    public static void main(String[] args)  {


        ArrayVector vector1 = new ArrayVector(6);
        ArrayVector vector2 = new ArrayVector(10);

        for (int i = 0; i < vector1.getVectorSize(); i++) {
            double r = Math.random()*100;
            int b = (int)r;
            vector1.setElement(i, b);
            {
                System.out.println( " Все элементы по вектору 1 " + vector1.getElement(i));
            }
        }

        System.out.println(" Элемент по заданному индексу для вектора 1 : " + vector1.getElement(3));
        System.out.println(" Заданный элемент для вектора 1 : "+ vector1.setElement(1,17));
        System.out.println(" Длинна массива : "+ vector1.getVectorSize() + " элементов");
        System.out.println(" Минимальный элемент : "+ vector1.getMin());
        System.out.println(" Максимальный элемент : "+ vector1.getMax());
        System.out.println(" Поиск индекса элемена : " + vector1.find(17));
        System.out.println(" Среднее арифметическое  : " + vector1.getAverage());
        System.out.println("Евклидова норма  : " + vector1.getNorm());
        System.out.println("умножения вектора на число : "); ArrayVector.mult(vector1,5) ;
        System.out.println("сортировки вектора : ");vector1.sort();


    }
}



/**   можно удалить будет потом если хоть  заработает другой вариант

 vector_vector.printElement1WithIndex();
 vector_vector.printElement2WithIndex();
 vector_vector.changeElement1WithIndex();
 vector_vector.changeElement2WithIndex();
 vector_vector.printlightelement();
 vector_vector.printlightelement2();

 vector_vector.maxAndMin();
 vector_vector.find ();
 vector_vector.getAverage();
 vector_vector.getNorm();
 vector_vector.sort();
 vector_vector.mult();
 vector_vector.sumV1OnV2();
 */





