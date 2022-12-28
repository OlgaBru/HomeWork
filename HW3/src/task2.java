import java.util.Scanner;

/*
Попросить пользователя ввести с клавиатуры сперва размер массива, потом нижний диапазон значений и верхний.
После чего создать массив размером, который ввел пользователь и заполнить его случайными числами из диапазона,
введенного пользователем. Если пользователь ввел неверные значения (отрицательный размер массива, нижняя граница
диапазона больше верхнего и т.д.) попросить его ввести значение ещё раз и перезаписать старое значение новым.
Вывести массив на экран (Для этого удобнее пользоваться не println, а print)
*/
public class task2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

            System.out.println();//для переноса с строки, в которой выводится массив

            System.out.print("Введите размер массива: ");
            int sizeArr = sc.nextInt(); //ввод с клавиатуры
                while (sizeArr < 0) {
                    System.out.print("Введите размер еще раз ");
                    sizeArr = sc.nextInt();
                }

            System.out.print("Введите минимальное значение: ");
            int min = sc.nextInt();

            System.out.print("Введите максимальное значение: ");
            int max = sc.nextInt();

                while (min > max) {
                    System.out.println("Введите значение еще раз ");
                    System.out.println();

                    System.out.print("Введите минимальное значение: ");
                    min = sc.nextInt();
                    System.out.print("Введите максимальное значение: ");
                    max = sc.nextInt();
                }

                    int[] array = new int[sizeArr];

                    for (int i = 0; i < sizeArr; i++) {
                    array[i] = (int) (Math.random() * (max - min) + min);//заполнить знач. эл-тов массива случайными числами
                    System.out.print(array[i] + " ");
                    }
    }
}

