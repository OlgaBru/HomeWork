import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int N = sc.nextInt();

        System.out.print("Введите значение A: ");
        int A = sc.nextInt();

        System.out.print("Введите значение B: ");
        int B = sc.nextInt();

        int[] array = new int[N];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (B - A) + A);//заполнить знач. эл-тов массива случайными числами
            System.out.print(array[i] + " ");
                    }
        System.out.println();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) { //если левый элемент больше чем правый
                    int temp = array[j]; //врем. перем., чтобы поменять местами элементы (в ней хранится значение временно)
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}

