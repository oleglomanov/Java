package lessons_2;

import java.io.*;


public class Vectors {


    public static void main(String[] args) throws VectorIndexOutOfBoundsException, IOException {

        LinkedListVector linkedListVector = new LinkedListVector(5); // Create object Linkedlist
        ArrayVector arrayVector = new ArrayVector(5);                // Create object ArrayVector


        ArrayVector.ArrayVectorFactory vectorFactory = new ArrayVector.ArrayVectorFactory();      // Create arrayVectorFactory
        Ivector arrayVectorTypeIvecor = vectorFactory.createInstance(3);                     // Create arrayVector type Ivecor (Interface)
        ArrayVector arrayVectorFromClassArrayVector = vectorFactory.createInstance(4);       // Create arrayVector from class array vector

        System.out.println(arrayVectorFromClassArrayVector  +"  My new ArrayVector ");             // Print all elemets from arrayVector

        ArrayVector.ArrayVectorIterator arrayVectorIterator = new ArrayVector.ArrayVectorIterator(arrayVectorFromClassArrayVector);  // Create interator ArrayVector
        System.out.println(arrayVectorIterator.next()+ " Check method next") ;    //Check method next from  arrayVector
        System.out.println(arrayVectorIterator.next()+ " Check method next") ;    //Check method next from  arrayVector
        System.out.println(arrayVectorIterator.next()+ " Check method next") ;    //Check method next from  arrayVector
        System.out.println(arrayVectorIterator.hasNext()+ " Check method hasNext") ;    //Check method hasnext from  arrayVector
        System.out.println(arrayVectorIterator.hasNext()+ " Check method hasNext") ;    //Check method hasnext from  arrayVector
 //     arrayVectorIterator.remove();     //Check method  Remove, print exception



        LinkedListVector.LinkedListVectorFactory linkedListVectorFactory = new LinkedListVector.LinkedListVectorFactory();   // Create arrayVectorFactory
        Ivector linkedlist = linkedListVectorFactory.createInstance(3);                                                 // Create arrayVector type Ivecor (Interface)

        LinkedListVector linkedListVectorFromClassLinkedList = linkedListVectorFactory.createInstance(3);               // Create LinkedListVector from class Linked list
        linkedListVectorFromClassLinkedList.printElements();                                     // Print all elemets from LinkedList
        System.out.println();
        LinkedListVector.LinkedListVectorIterator linkedListVectorIterator = new LinkedListVector.LinkedListVectorIterator(linkedListVectorFromClassLinkedList);   // Create interator LinkedlistVector
        System.out.println(linkedListVectorIterator.next() + "  Check method next from  LinkedListVector  ");
        System.out.println(linkedListVectorIterator.next() + "  Check method next from  LinkedListVector  ");  //Check method next from  LinkedListVector
        System.out.println(linkedListVectorIterator.next() + "  Check method next from  LinkedListVector  ");  //Check method next from  LinkedListVector
        System.out.println(linkedListVectorIterator.hasNext() + " Check method hasnext from  LinkedListVector ");
        System.out.println(linkedListVectorIterator.hasNext() + " Check method hasnext from  LinkedListVector ");




//      linkedListVectorIterator.remove();   //Check method  Remove, print exception







        /**       old home work
        System.out.println("Печать всех элементов Linkedlist: ");
        linkedListVector.printElements();   // печать всех элементов

       System.out.println("\n" + "Удаляю элемент по индексу 3: ");
       linkedListVector.deleteElement(2);

        linkedListVector.printElements();   // печать всех элементов

        System.out.println("\n" + "Элемент по индексу 2: ");
        System.out.println(linkedListVector.getElement(1));       // печать элемента по индексу

        System.out.println(" Количество элементов ");
        System.out.println(linkedListVector.getVectorSize());   // Количество элементов

        System.out.println("Евклидова норма: ");
        System.out.println(linkedListVector.getNorm());
**/

    }

}











