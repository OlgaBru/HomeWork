public class task5 {
    public static void main (String[] args){
        int numberOfAction = 2; //1-add, 2-subtr., 3-multipl, 4-divis.
        double a = 2.5;
        double b = 4.1;

        switch (numberOfAction){
            case 1:
                System.out.println("Result is " + "= " + (a+b));
                break;
            case 2:
                System.out.println("Result is " + "= " + (a-b));
                break;
            case 3:
                System.out.println("Result is " + "= " + (a*b));
                break;
            case 4:
                System.out.println("Result is " + "= " + (a/b));
                break;
            default:
                break;
        }
    }
}
