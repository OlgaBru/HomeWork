public class task1 {
    public static void main(String[] args) {

        int num1 = 3;
        int num2 = 56;

        StringBuilder strBuilder = new StringBuilder();

        strBuilder.append(String.format("%d + %d = %d\n", num1, num2, num1 + num2));
        strBuilder.append(String.format("%d - %d = %d\n", num1, num2, num1 - num2));
        strBuilder.append(String.format("%d * %d = %d\n", num1, num2, num1 * num2));
        System.out.println(strBuilder.toString());

        System.out.println(strBuilder.toString().replaceAll(" = ", " равно "));
    }
}