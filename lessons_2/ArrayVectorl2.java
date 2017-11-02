package lessons_2;

public class ArrayVectorl2 implements Ivector {


   int vectorSize;

    private int[] vector ;


    /**
     * @param _vectorSize - Количество элементов вектора
     *                    vector      - массив вектора 1
     */


    ArrayVectorl2(int _vectorSize) {
        this.vectorSize = _vectorSize;
        vector = new int[vectorSize];

        for (int i = 0; i < this.getVectorSize(); i++) {
            double r = Math.random()*100;
            int b = (int)r;
            this.setElement(i, b);
            System.out.println( " Все элементы по вектору 1 " + this.getElement(i));

        }

    }

    //

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
     * @return Евклидова Норма
     */

    public double getNorm() {
        int norm = 0;
        for (int i : vector) {
            norm += i * i;
        }
        return Math.sqrt(norm);
    }
}





