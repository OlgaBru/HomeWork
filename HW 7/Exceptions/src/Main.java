import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Введите ФИО: ");
            String name = sc.nextLine();
            System.out.println(name);
            Pattern pattern = Pattern.compile("^(\\W+\\s\\W+[\\.*\\s]\\W+\\.*){0,200}$");//ФИО кирилицей
            Matcher matcher = pattern.matcher(name);

            boolean nameFalse = matcher.matches();
            /*System.out.println(matcher.matches());*/
            IncorrectInfoException.getEnterInfoName(nameFalse);

        } catch (IncorrectInfoException ex) {
            System.out.println(ex.getMessage());
            /*System.out.println(ex.getName());*///введенные ФИО - выше, эта строка выводит null
            ex.printStackTrace();
            return;
            }

        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Введите возраст: ");
            int age = sc.nextInt();
            /*System.out.println(age);*/
            IncorrectInfoException.getEnterInfoAge(age);

        } catch (IncorrectInfoException ex) {
            System.out.println(ex.getMessage());
            System.out.println(ex.getAge());
            ex.printStackTrace();
        }
    }
}