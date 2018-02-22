package home_work7_Thread_Runnable;

import java.util.Iterator;

public class ArrayVector implements Ivector,Cloneable {

    int vectorSize;
    private double[] vector;


    /**
     * @param _vectorSize - Количество элементов вектора
     *                    vector      - массив вектора 1
     */


    ArrayVector(int _vectorSize) {
        this.vectorSize = _vectorSize;
        vector = new double[vectorSize];

        for (int i = 0; i < this.getVectorSize(); i++) {
            double r = Math.random() * 100;
            int b = (int) r;
            this.setElement(i, b);
            //   System.out.println( " Все элементы по вектору 1 " + this.getElement(i));

        }
    }

    /**
     * @param i -  индекс элемента
     * @return - элемент по индексу
     */
    public double getElement(int i) {
        return vector[i];
    }

    /**
     * @param i     -  Индекс элемента
     * @param value -  Значение для подстановки
     * @return новое значение
     */

    public String setElement(int i, int value) {
        if (i < vector.length) {
            vector[i] = value;
            return value + " установлен " + " на позицию " + (i + 1);
        } else {
            return "Индекс отсутствует";
        }
    }

    /**
     * @return Количество элементов
     */

    public int getVectorSize() {
        return vectorSize;
    }

    /**
     * @return Минимальное значение вектора 1
     */

    public double getMin() {
        double min = vector[0];
        for (int z = 0; z < vector.length; z++) {
            if (min > vector[z])
                min = vector[z];
        }
        return min;
    }


    /**
     * @return Евклидова Норма
     */

    public double getNorm() {
        int norm = 0;
        for (double i : vector) {
            norm += i * i;
        }
        return Math.sqrt(norm);
    }

    /**
     * @Override public String toString() {
     * return "ArrayVector{" +
     * "vectorSize=" + vectorSize +
     * ", vector=" + Arrays.toString(vector) +
     * '}';
     * }
     */

    public Iterator iterator() {
        return new ArrayVectorIterator(this);
    }

    @Override
    public void setElement(int index, double element) {

    }


    public static class ArrayVectorIterator implements Iterator {
        private ArrayVector aggregate = null;
        private int current = -1;
        private int length;

        public ArrayVectorIterator(ArrayVector v) {
            aggregate = v;
            length = v.getVectorSize();
        }

        public boolean hasNext() {
            current++;
            return current < length;
        }

        public Object next() {
            current++;
            return aggregate.getElement(current);
        }

        public void remove() {

            throw new UnsupportedOperationException();
        }
    }

    public static class ArrayVectorFactory implements VectorFactory {

        public ArrayVector createInstance(int size) {
            return new ArrayVector(size);
        }
    }

    public String toString() {
        int current = 0;
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < this.getVectorSize(); i++) {
            sb.append(vector[i]).append(" ");
        }
        return sb.toString();
    }

    public boolean equals(Ivector obj , Ivector obj1) {

        if (obj instanceof ArrayVector & obj.hashCode()==obj1.hashCode()   ) {
                 return true;
        }
        else {
            return false;
        }
    }





    public int hashCode(){
            int result = 0;
            long t;
            for (int i = 0; i<vector.length;i++){
                t=Double.doubleToLongBits(vector[i]);
                result^=(((int)(t>>32))^(int)(t&0x00000000FFFFFFFF));
            }
            return result;
        }
public Object clone() throws CloneNotSupportedException {
        return super.clone();
}


}






