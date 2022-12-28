public class task8 {
    public static void main (String[] args){
        byte N = 8; //достоинство карт: 11-валет, 12-дама, 13-король, 14-туз
        byte M = 1; //масть карт: 1-пики, 2-трефы, 3-бубны, 4-червы

        switch (N){
            case 6:
                System.out.print("Шестерка");
                break;
            case 7:
                System.out.print("Семерка");
                break;
            case 8:
                System.out.print("Восьмерка");
                break;
            case 9:
                System.out.print("Девятка");
                break;
            case 10:
                System.out.print("Десятка");
                break;
            case 11:
                System.out.print("Валет");
                break;
            case 12:
                System.out.print("Дама");
                break;
            case 13:
                System.out.print("Король");
                break;
            case 14:
                System.out.print("Туз");
                break;
            default:
                break;
        }

        switch (M){
            case 1:
                System.out.println(" пик");
                break;
            case 2:
                System.out.println(" треф");
                break;
            case 3:
                System.out.println(" бубен");
                break;
            case 4:
                System.out.println(" червей");
                break;
            default:
                break;
        }
    }
}

