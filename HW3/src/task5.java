import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        int[] array = {12, 6, 8, 55, 61, 23, 2, 0, 1, 89, 31, 91, 5, 21, 75, 63, 4, 25, 11, 15};

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число N: ");
        int N = sc.nextInt();

        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == N) {
              index = i;

                System.out.println("Число " + N + " находится под индексом " + index);

                break; //для остановки, когда элемент с нужным значением найден
            }

        }
    }
}
