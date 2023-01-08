import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Введите ФИО: ");
            String name = sc.nextLine();
            Pattern pattern = Pattern.compile("^[a-zA-Z, \\., \\s]{0,200}$");
            Matcher matcher = pattern.matcher(name);
            System.out.println(matcher.matches());
            boolean enterName = false;
            if (enterName == matcher.matches()) {
                IncorrectInfoException.getEnterInfoName(enterName);
            }

        } catch (IncorrectInfoException ex) {
            System.out.println(ex.getMessage());
            System.out.println(ex.getName());
            ex.printStackTrace();
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