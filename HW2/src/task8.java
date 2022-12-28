public class task8 {
    public static void main(String[] args) {
        int startS = 1000; //стартовый капитал
        int P = 10; //процент от суммы на счету
        int K = 0; //количество месяцев для накопления
        int finS = 1100;

        while (startS < finS) {
            startS += startS * P / 100;
            K++;
            if (startS >= finS) {
                System.out.println("Через " + K + " мес. на счету будет " + startS + " руб.");
            }
        }
    }
}


