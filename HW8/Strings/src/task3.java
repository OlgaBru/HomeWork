import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task3 {
    public static void main(String[] args) {
        String input = "ahb acb aeb aeeb adcb axeb";
        Pattern pattern = Pattern.compile/*("a.{1}b");*/ ("a[a-zA-Z0-9]{1}b"); // без {1} тоже работает
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
