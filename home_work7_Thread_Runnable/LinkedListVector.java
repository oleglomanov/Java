package home_work7_Thread_Runnable;


import java.util.Iterator;

public class LinkedListVector implements Ivector, Cloneable {


    int vectorSize;
    private int[] vector;


    LinkedListVector(int _vectorSize) {
        {
            this.vectorSize = _vectorSize;
            try {
                vector = new int[vectorSize];
                for (int i = 0; i < vectorSize; i++) {
                    double r = Math.random() * 100;
                    int b = (int) r;
                    this.addVector(b);
                }
            } catch (NegativeArraySizeException e) {

                System.out.println("Отрицательное значение элементов");

            }
        }
        //  catch (ArrayIndexOutOfBoundsException e) {
        //           System.out.println("Ошибка: " + e.toString());
    }

    //Вспомогательный внутренний класс, реализует элемент связного списка.

    private class Node {
        //Значение, которое хранит элемент связного списка.
        double value = Double.NaN;
        //Ссылка на предыдущий элемент связного списка.
        Node prev = null;
        //Ссылка на следующий элемент связного списка.
        Node next = null;

    }


    //Ссылка на голову связного списка.
    private Node head = new Node();

    /*блок инициализации, зацикливающий ссылки головы списка в момент создания объекта.*/ {
        head.prev = head;
        head.next = head;
    }

    //Текущая длина связного списка.
    private int size = 0;
    //Ссылка на последний использовавшийся элемент связного списка.
    /**
     * Вот тут не понятно V, current - это новая нода, мы её создали и сразу присвоили ссылку на Head ?
     */
    private Node current = head;
    /*Номер последнего использовавшиегося элемента связного списка. Значение "-1" соответствует голове.*/
    public int currentIndex = -1;
        /*Вспомогательный метод доступа к элементу списка.
           Должен использоваться для доступа из всех остальных методов, т.к. реализует механизм "памяти". index - номер требующегося элемента*/


    public void addVector(double element) {
        size++;
        currentIndex++;
        Node newElement = new Node(); // Создал елемент
        newElement.value = element;  // Инициализировал данные элемента и присвоил
        newElement.prev = current;  // Содаём ссылку с нового элемента на предыдущий элемент
        newElement.next = head;     // Создаём ссылку на следеующией элемент  -  current ?
        current.next = newElement;  // Присваиваем ссылку на след элемент
        head.prev = newElement;
        current = newElement;  // передвигаем current на новый элемент

    }


    public void deleteElement(int element) throws VectorIndexOutOfBoundsException {
        try {
            Node delete = this.gotoNumber(element);
            delete.next.prev = delete.prev;
            delete.prev.next = delete.next;

        } catch (VectorIndexOutOfBoundsException e) {
            System.out.println("Элеменет отсутствует"); //e.printStackTrace();
        }
        size--;
        currentIndex--;
        //currentIndex = -1;
    }


    public void setElement(int index, double element) {

        try {
            Node node = gotoNumber(index);
            node.value = element;
        } catch (VectorIndexOutOfBoundsException e) {
            System.out.println("Error of index");
        }
    }


    void printElements() throws VectorIndexOutOfBoundsException {
        try {
            for (int i = 0; i < size; i++) {
                System.out.print(this.gotoNumber(i).value + " ");
            }
        } catch (VectorIndexOutOfBoundsException e) {
            System.out.println("Элемент отсутствует"); //e.printStackTrace();
        }
    }

    public double getElement(int i) {


        try {
            return this.gotoNumber(i).value;
        } catch (VectorIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
        return 12;
    }


    public double getNorm() throws VectorIndexOutOfBoundsException {
        int norm = 0;
        for (int i = 0; i < size; i++) {
            norm += this.gotoNumber(i).value * this.gotoNumber(i).value;
        }
        return Math.sqrt(norm);
    }


    Node gotoNumber(int index) throws VectorIndexOutOfBoundsException {
        if ((index >= 0) && (index < size)) {     // проверка индекса

            if (index < currentIndex) {  //  меньше последнего значения


                if (index < currentIndex - index) {  //
                    current = head;

                    for (int i = -1; i < index; i++)
                        current = current.next;                //


                } else {
                    for (int i = currentIndex; i > index; i--)
                        current = current.prev;
                }


            } else {
                if (index - currentIndex < size - index) {
                    for (int i = currentIndex; i < index; i++)
                        current = current.next;
                } else {
                    current = head;
                    for (int i = size; i > index; i--)

                        current = current.prev;
                }
            }
            currentIndex = index;
            return current;
        } else
            throw new VectorIndexOutOfBoundsException();
    }


    public int getVectorSize() {

        //System.out.println(this.size);
        return size;
    }

    Node getHead() {
        return head;
    }

    public Iterator iterator() {
        return new LinkedListVectorIterator(this);
    }


    public static class LinkedListVectorIterator implements Iterator {
        private LinkedListVector.Node current;
        private LinkedListVector.Node head;


        public LinkedListVectorIterator(LinkedListVector v) {
            head = v.getHead();
            current = head;
        }

        @Override
        public boolean hasNext() {
            current = current.next;
            return current.next != head;
        }

        @Override
        public Object next() {
            if (hasNext()) {
                current = current.next;
            }
            return current.value;
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();

        }
    }

    public static class LinkedListVectorFactory implements VectorFactory {

        public LinkedListVector createInstance(int size) {
            return new LinkedListVector(size);
        }
    }

    public String toString() {
        String result = "";
        StringBuffer sb = new StringBuffer();
        current = head;
        while (current.next != head) {
            current = current.next;
            sb.append(current.value);
            sb.append(" ");
        }

        return sb.toString();
    }


    public boolean equals(Object obj) {
        if (!(this == obj)) return false;
        LinkedListVector myObj = (LinkedListVector) obj;
        if (getVectorSize() != myObj.getVectorSize()) {
            return false;
        }
        for (int i = 0; i < this.getVectorSize(); i++) {
            if (this.getElement(i) != myObj.getElement(i)) {
                 return  false;
            }
        }
        return true;
    }


    public int hashCode() {
        int result = 0;
        long t;
        Node current = head.next;
        while (current != head) {
            t = Double.doubleToLongBits(current.value);
            result ^= (((int) (t >> 32)) ^ (int) (t & 0x00000000FFFFFFFF));
            current = current.next;
        }
        return result;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }


}