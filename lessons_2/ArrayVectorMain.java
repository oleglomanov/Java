package lessons_2;

public class ArrayVectorMain {


    public static void main(String[] args) throws VectorIndexOutOfBoundsException {


        LinkedListVector list = new LinkedListVector(22); // передаю сюда значение

        ArrayVectorl2 oldi = new ArrayVectorl2(15) ;

        System.out.println("Элемент по заданному индексу для вектора 1 : " + oldi.getElement(3));

        System.out.println("Печать всех элементов: "); list.printElements();   // печать всех элементов

        System.out.println("\n"+"Удаляю элемент по индексу 3: "); list.deleteElement(2);

        list.printElements();   // печать всех элементов

        System.out.println("\n"+" Элемент по индексу 2: "); list.getElement(1);       // печать элемента по индексу

        System.out.println(" Количество элементов ");  list.getVectorSize();   // Количество элементов

        System.out.println("Евклидова норма: "); System.out.println(list.getNorm());


    }
}








