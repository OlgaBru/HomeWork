public class task7 {
    public static void main(String[] args) {

        int N = 213;
        int S = 0; //сумма цифр числа
        int K = 0; //количество цифр в числе
        int M = 0; //число наоборот

        for (; N > 0; N = N/10) {
            if (N % 10 == 2) { //2/10 = остаток 2
                System.out.println("Цифра 2 в числе есть");
            }

            S += N % 10; //3+0=3, 1+3=4, 2+4=6
            K++;
            M = M * 10 + N % 10;//0+3=3, 3*10+1=31, 31*10+2=312
        }

        System.out.println("Сумма цифр числа =  " + S);
        System.out.println("Количество цифр в числе = " + K);
        System.out.println("Число справа налево = " + M);
    }
}
