import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        IntArray a = new IntArray();

        Integer[] array = {2, 5, 89, 75, 23, 9, 0, -1, 38, 5, 7};

        /*a.setArray(array);
        System.out.println(a.getArray());*/

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите значение к: ");
        int k = sc.nextInt();

        a.bubbleSort(a.setArray(array), k);

    }
}











