public class IncorrectInfoException extends Exception {
    private String name;
    private int age;
    private boolean nameFalse;

    public IncorrectInfoException() {
    }
    public String getName() {return name;}
    public int getAge() {return age;}
    public boolean getNameFalse() {return nameFalse;}

    public IncorrectInfoException (String message, boolean nameFalse) {
        super(message);
        this.nameFalse = nameFalse;
        this.age = age;
    }

    public IncorrectInfoException (String message, int age) {
        super(message);
        this.age = age;
    }

        public static boolean getEnterInfoName (boolean nameFalse) throws IncorrectInfoException {
        if (nameFalse==false) {
                throw new IncorrectInfoException("Введенные ФИО некорректны", nameFalse);
            }
            return nameFalse;
        }

        public static int  getEnterInfoAge (int age) throws IncorrectInfoException {
            if (age > 100 || age < 0) {
                throw new IncorrectInfoException("Возраст некорректен", age);
            }
            return age;
        }
        public void printStackTrace(boolean enterName) {System.out.println(enterName);}
        public void printStackTrace (int age) {System.out.println(age);}
}
