import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите дату: ");
        String date = sc.nextLine();

        Pattern pattern = Pattern.compile ("^0[1-9]|[12][0-9]|30[\\/\\.-]0[1-9]|1[012][\\/\\.-]1|2[0-9]{3}\\s[0-2][0-4][\\.:][0-5][0-9]$");
        Matcher matcher = pattern.matcher(date);
        System.out.println(matcher.matches());
    }
}
