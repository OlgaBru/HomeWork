/*Определить класс IntArray, который будет в себе содержать в качестве поля массив чисел.
Создать для такого класса конструкторы, в которые можно пердавать количество элементов массива, уже готовый массив.
Создать конструктор без параметров, который будет создавать массив из 10 элементов.
Добавить в класс метод сортировки sort (любой на выбор), который в себя принимает в каачестве параметра число, если
число положительное, то массив внутри объекта сортируется по возрастанию, если ноль или отрицательное, то по убыванию.
Добавить методы, с помощью которых можно будет работать с внутренним массивом без прямого обращения к нему (геттеры,
сеттеры и т.д.)*/

public class IntArray {

    private Integer[] array; //массив для хранения чисел
    private int nums; //число элементов в массиве
    public IntArray() { //массив по умолчанию на 10 элементов
    }

    public IntArray(Integer[] array) { //к-р с готовым массивом
        this.array = array;
    }

    public IntArray(int nums) { //к-р, в кот. передается кол-во эл-тов массива
        this.nums = nums;
        array = new Integer[nums];
    }
    public Integer[] setArray(Integer[]array) {
        this.array = array;
        return array;
    }
    public Integer[] getArray() {
        return array;
    }

    //сортировка пузырьком
    public static void bubbleSort(Integer[]array, int k) {
        for (int i = 0; i < array.length; i++) {
            if (k > 0) { //если число положительное, сортировка по возрастанию
                for (int j = 0; j < array.length - i - 1; j++) {
                    if (array[j] > array[j + 1]) { //если левый элемент больше чем правый
                        int temp = array[j]; //врем. перем., чтобы поменять местами элементы (в ней хранится значение временно)
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                    }
                }
            } else {  //если число 0 или отриц., сортир. по убыванию
                for (int j = 0; j < array.length - i - 1; j++) {
                    if (array[j] < array[j + 1]) {
                        int temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                    }
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}




