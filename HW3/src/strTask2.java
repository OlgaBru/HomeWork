import java.util.Scanner;

public class strTask2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String str = sc.nextLine();
        System.out.println(str);

        while (str.isEmpty()) {
            System.out.print("Введите строку еще раз: ");
            str = sc.nextLine();
            System.out.println(str);
        }

        System.out.print("Введите символ a: ");
        /*String strChar = sc.nextLine();*/
        char a = sc.next().charAt(0);
        System.out.println(a);

        System.out.print("Введите символ b: ");
        /*String strChar = sc.nextLine();*/
        char b = sc.next().charAt(0);
        System.out.println(b);

        char[] array = str.toCharArray();

        int index;
        for (int i = 0; i < array.length; i++) { // for (char с : array){
            if (array[i] == a) {                 // if (с = a){ //ищем символ а в массиве
                index = i;
                /*System.out.println("Символ " + a + " находится под индексом " + index);*/

                for (int k = 0; k < array.length; k++) {
                    array[index] = b;
                    if (i == array.length-1) { //если все эл-ты массива перебрали,
                                               // при этом условии в консоль вывод. итог, а не пошаговая замена
                        System.out.print(array[k]);
                    }
                }
            }
        }
    }
}
