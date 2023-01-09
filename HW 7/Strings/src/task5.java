import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите дату: ");
        String date = sc.nextLine();

        Pattern pattern = Pattern.compile("^(0[1-9]|[12][0-9]|30)[\\.\\/\\-](0[1-9]|1[012])[\\.\\/\\-]" +
                "((1[0-9]{1}[0-9]{1}[0-9]{1})|(20{1}[0-1]{1}[0-2]){1})\\s[0-2][0-4][\\.:][0-5][0-9]$");
        //формат dd-mm-yyyy h:min, разделители для даты ".", "/", "-"; для времени ".", ":"

        Matcher matcher = pattern.matcher(date);
        /*System.out.println(matcher.matches());*/
        if (matcher.matches()) {
            System.out.println(date + " - существует");
        }else{
            System.out.println(date + " - не существует");
        }
    }
}
