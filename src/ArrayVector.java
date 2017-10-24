package src;

public class ArrayVector {


    int vectorSize;

    int[] vector;

    int vector2[]; // для сравнения


    /**
     * @param _vectorSize - Количество элементов вектора
     *  vector      - массив вектора 1
     */


    ArrayVector(int _vectorSize) {
        this.vectorSize = _vectorSize;

        vector  = new int[vectorSize];

    }


    /**
     * @param i -  индекс элемента
     * @return - элемент по индексу
     */
    public int getElement(int i) {
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

    public int getMin() {
        int min = vector[0];
        for (int z = 0; z < vector.length; z++) {
            if (min > vector[z])
                min = vector[z];
        }
        return min;
    }

    /**
     * @return Максимальное значение вектора 1
     */

    public int getMax() {
        int max = vector[0];
        for (int z = 0; z < vector.length; z++) {
            if (max < vector[z])
                max = vector[z];
        }
        return max;
    }


    /**
     * @param element - Элемент массива
     * @return индекс масива и вслучаем его отсутсивя -100500
     */


    public int find(int element) {
        for (int i = 0; i < vector.length; i++) {
            if (element == vector[i]) {
                return i;
            }
        }
        return -100500;
    }


    /**
     * @return Среднее значение масива
     */

    public int getAverage() {
        int sum = 0;
        for (int i : vector) {
            sum += i;
        }
        return sum / vector.length;
    }

    /**
     * @return Евклидова Норма
     */

    public double getNorm() {
        int norm = 0;
        for (int i : vector) {
            norm += i * i;
        }
        return Math.sqrt(norm);
    }


    /**
     * @param vector1
     * @param mult
     */

    public static void mult(ArrayVector vector1, int mult) {
        for (int i = 0; i < vector1.vector.length; i++) {
            vector1.vector[i] = vector1.vector[i] * mult;
            System.out.print(vector1.vector[i] + " ");
        }
        System.out.println();
    }

    /**
     * Сортировка, взял от сюда - https://ru.wikibooks.org/wiki/%D0%A0%D0%B5%D0%B0%D0%BB%D0%B8%D0%B7%D0%B0%D1%86%D0%B8%D0%B8_%D0%B0%D0%BB%D0%B3%D0%BE%D1%80%D0%B8%D1%82%D0%BC%D0%BE%D0%B2/%D0%A1%D0%BE%D1%80%D1%82%D0%B8%D1%80%D0%BE%D0%B2%D0%BA%D0%B0/%D0%9F%D1%83%D0%B7%D1%8B%D1%80%D1%8C%D0%BA%D0%BE%D0%BC
     */


    public void sort() {
        for (int i = vector.length - 1; i > 0; i--) {

            for (int v = 0; v < i; v++) {

                if (vector[v] > vector[v + 1]) {
                    int tmp = vector[v];
                    vector[v] = vector[v + 1];
                    vector[v + 1] = tmp;

                }
            }
        }
        for (int element : vector) {
            System.out.print(element + " ");
        }
    }

    /**
     *
     *
     * @param vector1 - Массиа вектора 1
     * @param vector2 - Массив вектора 2
     */


    public static void sum (ArrayVector vector1, ArrayVector vector2) {
        int sumvector [] = new int[vector1.getVectorSize()];
        for (int i = 0; i <vector1.getVectorSize(); i++) {
            sumvector[i]= vector1.vector[i] + vector2.vector[i];
            }
        for (int i1 : sumvector) {
            System.out.print(i1 + " ");
        }
    }

    /**
     *
     *
     * @param vector1 - Массиа вектора 1
     * @param vector2 - Массиа вектора 2
     */

    public static void  scalarvector  (ArrayVector vector1, ArrayVector vector2) {
        int scalarvector [] = new int[vector1.getVectorSize()];
        for (int i = 0; i <vector1.getVectorSize(); i++) {
            scalarvector[i]= vector1.vector[i] * vector2.vector[i];
        }
        for (int i1 : scalarvector) {
            System.out.print(i1 + " ");
        }
    }
}



