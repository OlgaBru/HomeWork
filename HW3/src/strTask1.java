import java.util.Scanner;

public class strTask1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String str = sc.nextLine();
        System.out.println(str);

        System.out.print("Введите символ: ");
        /*String strChar = sc.nextLine();*/ char strChar = sc.next ().charAt (0); //чтобы сравнивать символы после
                                                                                  // возвращ. строки в виде массива
        System.out.println(strChar);

        char[] array = str.toCharArray();
        /*for (char i : array)
        System.out.print(i + " ");*/

        int count = 0;
        for (char i : array) {
            if (strChar == i) {
            count++;
            }
        }
        System.out.println("Символ " + strChar + " встречается в строке " + count + " раз(-а)");
    }
}
