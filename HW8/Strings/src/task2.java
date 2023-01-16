import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task2 {
    public static void main(String[] args) {

        String link = "\\w*\\.com";

        Scanner sc = new Scanner(System.in);

        System.out.print("Введите текст: ");
        String text = sc.nextLine();

        Pattern pattern = Pattern.compile(link);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}



