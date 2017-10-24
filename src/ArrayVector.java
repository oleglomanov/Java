package src;

public class ArrayVector {

    // int elementforinput = 5;   // элемент земены
    // int indexelementforchange = 1; // Индекс элемента для замены
    // int indexelement1 = 2;   // номер элемента для вывода вектора1
    // int indexelement2 = 1;   // номер элемента для вывода вектора2
    // int v1[] = new int[]{20, 1, 4}; // Вектор 1
    // int v2[] = new int[]{6, 16,10};   // Вектор 2
    //
    //
    // int counter = 0; // Счётчик для поиска числа в масиве
    // int item = 4;  // Число для поиска в массиве
    // double avarage = 0; // Среднее
    // int number = 0;
    // int multvector = 0;


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



// вывод значений вектора 1
// public void getVectorNumber () {


//      for (int i : v1)
//      {
//          System.out.println("Значения вектора 1: " + i);}
//  }


//  // вывод значений вектора 2
//  public void getVectorNumber2 () {
//
//  for (int i : v2)
//  {
//      System.out.println("Значения вектора 2: " + i); }
//  }


// Принт эелементов вектора1  c их индексами

//      public void printElementWithIndex () {
//              for (int i = 0; i < v1.length; i++) {
//                  System.out.println(i + " : " + v1[i]); }
//      }

// Принт эелементов вектора1  c их индексами

// public void printElementWithIndex2 () {
//     for (int i = 0; i < v1.length; i++) {
//         System.out.println(i + " : " + v2[i]); }
//  }
/**
 // Принт эелемента по индексу для вектора 1
 public void printElement1WithIndex() {
 System.out.println("\n" + "Значение вектора 1 с индексом " + indexelement1 + " равно значению: " + v1[indexelement1]);
 return  ;
 }


 // Принт эелемента по индексу для вектора 2
 public void printElement2WithIndex() {
 System.out.println("\n" + "Значение вектора 2 с индексом " + indexelement2 + " равно значению: " + v2[indexelement2]);

 }

 public void changeElement1WithIndex() {
 v1[indexelementforchange] = elementforinput;
 System.out.println("\n" + "Значения вектора 1 были измененены,новые значения:");
 for (int i : v1) {
 System.out.print(" ");
 System.out.print(i);
 }
 }


 public void changeElement2WithIndex() {
 v1[indexelementforchange] = elementforinput;
 System.out.println("\n" + "Значения вектора 2 были измененены,новые значения: ");
 for (int i : v2) {
 System.out.print(" ");
 System.out.print(i);
 }
 }


 public void printlightelement() {
 System.out.println("\n" + "Количество элементов вектора 1: " + v1.length);
 }

 public void printlightelement2() {
 System.out.println("\n" + "Количество элементов вектора 2: " + v2.length);
 }





 public void find() {

 for (counter = 0; counter < v1.length; counter++) {
 if (v1[counter] == item) {
 System.out.println(item + " является " + (counter + 1) + " по счету в массиве");
 // Число найдено, следовательно прекращаем поиск
 // вызовом оператора break
 break;
 }
 }
 if (counter == v1.length) {
 System.out.println("Число " + item + " не найдено в массиве");
 }

 }

 public void getAverage() {
 for (int i = 0; i < v1.length; i++) {
 avarage += v1[i];
 }
 System.out.println(avarage / v1.length);
 }

 public void getNorm() {
 for (int inum : v1) {
 number = inum;
 int s = 1;
 for (int i = 0; i < 2; ++i) //
 {
 s = s * number;

 // System.out.println("типа среднее " + avarage);
 }
 avarage += s;
 // System.out.println("Результат возведниея в степень чисел первого вектора:  " + s);
 }
 System.out.println("Евклидова норма первого вектора:" + Math.sqrt(avarage));
 }

 // Сортировка от большего к меньшему
 public void sort() {

 for (int i = 0; i < v1.length; i++) {
 for (int j = i; j < v1.length; j++) {
 if (v1[i] > v1[j]) {
 int tmp = v1[i];
 v1[i] = v1[j];
 v1[j] = tmp;
 }
 }
 System.out.println(v1[i]);
 }
 }

 // перемножение первого вектора на число mult
 public void mult() {
 for (int inum : v1) {
 number = inum;
 int mult = 2;
 int s = 0;
 for (int i = 0; i < 2; ++i) //
 {
 s = mult * number;
 }
 System.out.println(s);

 }
 }

 // Сложение первого вектора на второй

 public void sumV1OnV2() {
 if (v1.length == v2.length) {

 for (int i = 0; i < v1.length; i++) {

 multvector = v1[i] + v2[i];
 System.out.println("Результат сложения элеменетов: "  + multvector);
 }
 }
 else{
 System.out.println("Вектора не равны");
 }
 }
 }

 */



