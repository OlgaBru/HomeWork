public class task6 {
    public static void main (String[] args){
        int i = 367;

        if (i%2==0 && i>0 && i<10) {
            System.out.println("This is an even single digit number");

        }else if (i%2!=0 && i>0 && i<10) {
            System.out.println("This is an odd single digit number");

        }else if (i%2==0 && i>9 && i<100) {
            System.out.println("This is an even two digit number");

        }else if (i%2!=0 && i>9 && i<100) {
            System.out.println("This is an odd two digit number");

        }else if (i%2==0 && i>99 && i<=999) {
            System.out.println("This is an even three digit number");

        }else{
            System.out.println("This is an odd three digit number");
        }
    }
}
