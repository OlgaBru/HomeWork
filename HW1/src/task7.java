public class task7 {
    public static void main(String[] args) {
        byte birthday = 29;
        byte monthOfBirth = 2;

        if ((monthOfBirth == 1 && birthday >= 1 && birthday <= 19) || (monthOfBirth == 12 && birthday > 23 && birthday <= 31)) {
            System.out.println("Козерог");

        } else if ((monthOfBirth == 2 && birthday >= 1 && birthday <= 18) || (monthOfBirth == 1 && birthday >= 20 && birthday <= 31)) {
            System.out.println("Водолей");

        } else if ((monthOfBirth == 3 && birthday >= 1 && birthday <= 20) || (monthOfBirth == 2 && birthday >= 19 && (birthday <= 28 || birthday <= 29))) {
            System.out.println("Рыбы");

        } else if ((monthOfBirth == 4 && birthday >= 1 && birthday <= 19) || (monthOfBirth == 3 && birthday >= 21 && birthday <= 31)) {
            System.out.println("Овен");

        } else if ((monthOfBirth == 5 && birthday >= 1 && birthday <= 20) || (monthOfBirth == 4 && birthday >= 20 && birthday <= 30)) {
            System.out.println("Телец");

        } else if ((monthOfBirth == 6 && birthday >= 1 && birthday <= 21) || (monthOfBirth == 5 && birthday >= 21 && birthday <= 31)) {
            System.out.println("Близнецы");

        } else if ((monthOfBirth == 7 && birthday >= 1 && birthday <= 22) || (monthOfBirth == 6 && birthday >= 22 && birthday <= 30)) {
            System.out.println("Рак");

        } else if ((monthOfBirth == 8 && birthday >= 1 && birthday <= 22) || (monthOfBirth == 7 && birthday >= 23 && birthday <= 31)) {
            System.out.println("Лев");

        } else if ((monthOfBirth == 9 && birthday >= 1 && birthday <= 22) || (monthOfBirth == 8 && birthday >= 23 && birthday <= 31)) {
            System.out.println("Дева");

        } else if ((monthOfBirth == 10 && birthday >= 1 && birthday <= 22) || (monthOfBirth == 9 && birthday >= 23 && birthday <= 30)) {
            System.out.println("Весы");

        } else if ((monthOfBirth == 11 && birthday >= 1 && birthday <= 22) || (monthOfBirth == 10 && birthday >= 23 && birthday <= 31)) {
            System.out.println("Скорпион");

        } else {
            System.out.println("Стрелец");
        }
    }
}

