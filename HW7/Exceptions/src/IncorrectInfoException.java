public class IncorrectInfoException extends Exception {
    private String name;
    private static boolean enterName;
    private int age;

    public IncorrectInfoException() {
    }
    public String getName() {return name;}

    public boolean getEnterName() {return enterName;}

    public int getAge() {return age;}

    public IncorrectInfoException (String message, boolean enterName) {
        super(message);

        this.enterName = enterName;
        this.age = age;
    }

    public IncorrectInfoException (String message, int age) {
        super(message);
        this.age = age;
    }

        public static boolean getEnterInfoName (boolean enterName) throws IncorrectInfoException {
        if (enterName = false) {
                throw new IncorrectInfoException("Введенные ФИО некорректны", enterName);
            }
            return false;
        }

        public static int  getEnterInfoAge (int age) throws IncorrectInfoException {
            if (age > 100 || age < 0) {
                throw new IncorrectInfoException("Возраст некорректен", age);
            }
            return age;
        }
}
