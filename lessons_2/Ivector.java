package lessons_2;

public interface Ivector {

    int getElement (int i ) throws VectorIndexOutOfBoundsException;
    int getVectorSize ( );
    double getNorm () throws VectorIndexOutOfBoundsException;

}
