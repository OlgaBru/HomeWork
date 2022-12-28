import java.util.Scanner;

public class task3 {
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

        int max = 0; //максимальное значение под индексом ноль
        for (int i=0; i< array.length; i++){
            if (array [i] > array [max]){ //поиск наибольшего значения в сравнении с предыдущим
                max=i; //индекс максимального значения после сравнения
            }
        }
        System.out.println();
        System.out.println("index: " + max + "; max value: " + array[max]);
    }
}
