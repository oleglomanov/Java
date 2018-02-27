package home_work7_Thread_Runnable;

import java.util.Iterator;

public class ReadVectorThread   extends Thread implements Ivector {

    Ivector vector;

    public ReadVectorThread(Ivector vector) {
        this.vector = vector;
    }

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
        vector.setElement(index,element);
    }

    public void  run () {
        for (int i =0; i<this.vector.getVectorSize();i++) {
            System.out.println(this.getName()+"read: " + this.vector.getElement(i)+" from position " +i);
        }
    }
}

