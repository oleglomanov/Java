package home_work7_Thread_Runnable;

import java.util.Iterator;

public interface Ivector {

    double getElement(int i);
    int getVectorSize();
    double getNorm() throws VectorIndexOutOfBoundsException;
    Iterator iterator();

}
