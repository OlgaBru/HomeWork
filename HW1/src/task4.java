public class task4 {
    public static void main (String[] args){
        int numberOfYear = 2020;

        if (numberOfYear%4==0 || numberOfYear%400==0 && numberOfYear%100!=0){
            System.out.println("There are 366 days this year");

        }else{
            System.out.println("There are 365 days this year");
        }
    }
}
