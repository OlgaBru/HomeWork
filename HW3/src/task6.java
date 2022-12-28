import java.util.Scanner;

public class task6 {
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
            System.out.print(array[i] + " ");
        }
        System.out.println(); //чтобы инвертир. массив выводился на другую строку
        for (int i = 0; i < array.length/2; i++) {//проходим массив до половины
            int temp = array [i];
            array[i] = array[array.length-i-1];
            array[array.length-i-1]=temp;
        }

        for (int i : array) {      /* или for (int j = 0; j < array.length; j++) {System.out.print(array[j] + " ");*/
            System.out.print(i + " ");

        }
    }
}
