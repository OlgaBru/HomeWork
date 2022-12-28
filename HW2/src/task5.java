public class task5 {
    public static void main(String[] args) {
        int A = 17;
        int B = 6;

        while ((A-B)>=B){
            B+=B;
            System.out.println("Длина незанятой части отрезка А: " + (A-B));
        }
    }
}

