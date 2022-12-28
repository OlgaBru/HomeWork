public class taste6 {
    public static void main(String[] args) {
        int A = 8;
        int B = 5;
        int C = 3;
        int vertK = 0; //кол. квадратов по стороне А
        int horK = 0; //кол. квадратов по стороне B
        while (A >= C) {
            A -= C; //5, 2
            horK++;//1, 2
        }
        while (B >= C) {
            B -= C;
            vertK++;
        }

        for (int i = vertK; i <= horK; i++) {
            if (i > 0) {
                i=horK;
            }
            System.out.println("Кол. кв. в прямоуг. = " + horK);
        }
    }
}









