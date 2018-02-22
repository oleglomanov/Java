package home_work7_Thread_Runnable;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;


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
        System.out.println(linkedListVectorIterator.next() + "  Check method next from  LinkedListVector  ");  // Check method next from  LinkedListVector
        System.out.println(linkedListVectorIterator.next() + "  Check method next from  LinkedListVector  ");  // Check method next from  LinkedListVector
        System.out.println(linkedListVectorIterator.hasNext() + " Check method hasnext from  LinkedListVector ");
        System.out.println(linkedListVectorIterator.hasNext() + " Check method hasnext from  LinkedListVector ");
        System.out.println(arrayVectorFromClassArrayVector.toString());                                        // Array to string
        System.out.println(linkedListVectorFromClassLinkedList.toString());       // Linkedlist to string

        System.out.println(arrayVectorFromClassArrayVector.hashCode());




        LinkedListVector linkedListVector1 = null;
        try {
            linkedListVector1 = (LinkedListVector) linkedListVector.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        System.out.println(arrayVectorFromClassArrayVector.equals(arrayVectorFromClassArrayVector, linkedListVector1));
        System.out.println(linkedListVectorFromClassLinkedList.hashCode());
    }

//      linkedListVectorIterator.remove();   //Check method  Remove, print exception


        public static void writeVector(Ivector v, Writer out) {
            PrintWriter pw = new PrintWriter(out);
            pw.printf("%d ", v.getVectorSize());
            for (int i = 0; i < v.getVectorSize(); i++) {
                pw.printf("%g ", v.getElement(i));
            }
            pw.close();

        }
}













