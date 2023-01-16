public class Main {
    public static void main(String[] args) {

        someMethod method = new someMethod();//с.10 през. на коллекции

        Integer[] array = {1, 2, 4, 4};

        System.out.println(method.<Integer>arrayToMap(array));
    }
}