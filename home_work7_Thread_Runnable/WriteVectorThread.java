package home_work7_Thread_Runnable;

import java.util.Iterator;

public class WriteVectorThread  extends Thread implements Ivector {

    Ivector vector;


    @Override
    public double getElement(int i) {
        return vector.getElement(i);
    }

    @Override
    public int getVectorSize() {
        return vector.getVectorSize();
    }

    @Override
    public double getNorm() throws VectorIndexOutOfBoundsException {
        return vector.getNorm();
    }

    @Override
    public Iterator iterator() {
        return vector.iterator();
    }

    @Override
    public void setElement(int index, double element) {
        vector.setElement(index, element);

    }

    @Override
    public void run() {
        for (int i = 0; i < this.getVectorSize(); i++) {
            double element = Math.random() * 100;
            this.setElement(i, element);
            System.out.println(this.getName() + "Write: " + element + " to position " + i + ".");
        }

    }
}