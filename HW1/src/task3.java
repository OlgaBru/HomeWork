public class task3 {
    public static void main (String[] args){
        int a = 7;
        int b = 2;
        int c = 12;

        if (a<b && a<c) {
            System.out.println(b + c);

        }else if (b<a && b<c) {
            System.out.println(a + c);

        }else{
            System.out.println(a + b);
        }
    }
}
