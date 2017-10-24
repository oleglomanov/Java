package src;

public class ArrayVector {

    int vectorSize;

    int vector[];


    // vectorSize - Длинна масива
    // elements - Элементы массива
    ArrayVector(int _vectorSize) {
        this.vectorSize = _vectorSize;
        vector = new int[vectorSize];


        // i - индекс элемента
        // return - эелемент по индексу
    }

    public int getElement(int i) {
        return vector[i];
    }

    public String setElement(int index, int value) {
        if (index < vector.length) {
            vector[index] = value;
            return value + " установлен " + " на позицию " + (index + 1);
        } else {
            return "Значение индекса превышенно";
        }
    }

    public int getVectorSize() {
        return vectorSize;
    }

    public int getMin() {
        int min = vector[0];
        for (int z = 0; z < vector.length; z++) {
            if (min > vector[z])
                min = vector[z];
        }
        return min;
    }


    public int getMax() {
        int max = vector[0];
        for (int z = 0; z < vector.length; z++) {
            if (max < vector[z])
                max = vector[z];
        }
        return max;
    }


    public int find(int element) {
        for (int i = 0; i < vector.length; i++) {
            if (element == vector[i]) {
                return i;
            }
        }
        return -100500;
    }


    public int getAverage() {
        int sum = 0;
        for (int i : vector) {
            sum += i;
        }
        return sum / vector.length;
    }

    public double getNorm() {
        int norm = 0;
        for (int i : vector) {
            norm += i * i;
        }
        return Math.sqrt(norm);
    }


    public static void mult(ArrayVector vector1, int mult) {
        for (int i = 0; i < vector1.vector.length; i++) {
            vector1.vector[i] = vector1.vector[i] * mult;
            System.out.print(vector1.vector[i] + " ");
        }
        System.out.println();
    }


    public void sort() {
        for (int i = vector.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (vector[j] > vector[j + 1]) {
                    int tmp = vector[j];
                    vector[j] = vector[j + 1];
                    vector[j + 1] = tmp;
                }
            }
        }
        for (int element : vector) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}



