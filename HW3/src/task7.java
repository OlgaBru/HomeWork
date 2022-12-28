import java.util.Scanner;

public class task7 {
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
            array[i] = (int) (Math.random() * (B - A) + A);//заполнить знач. эл-тов массива и вывод на экран
            /*System.out.print(array[i] + " ");*/
        }
         for (int i = 0; i < array.length; i++) { //сортировка пузырьком
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        for (int i : array) {
            System.out.print(i + " "); //на консоль выводится отсортир. массив и в нем осущ. поиск элемета
        }
            System.out.println();
            System.out.print("Введите число k: ");
            int k = sc.nextInt();

            int countSteps1 = 0; //для подсчета шагов при линейном поиске
            int countSteps2 = 0; //для подсчета шагов при двоичном поиске

            int index = -1;
            for (int i = 0; i < array.length; i++) { //линейный поиск
                if (array[i] == k) {
                    index = i;
                    countSteps1 = array.length - i; //кол шагов равно разнице м-ду индексом посл. эл-та и первого
                    break;
                }
            }
            int lowIndex = 0;                     //двоичный поиск
            int highIndex = array.length - 1;
            while (lowIndex <= highIndex) {
                countSteps2++;
                int midIndex = (lowIndex + highIndex)/2;

                if (k == array[midIndex]) {
                    index = midIndex;
                    break;
                } else if (k < array[midIndex]) {
                    highIndex = midIndex - 1;

                } else if (k > array[midIndex]) {
                    lowIndex = midIndex + 1;
                }
            }
            System.out.println("Число " + k + " находится под индексом " + index);
            System.out.println("Линейный поиск: " + countSteps1 + " шаг(-а)(-ов)");
            System.out.println("Двоичный поиск: " + countSteps2 + " шаг(-а)(-ов)");
        }
    }




