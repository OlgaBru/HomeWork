public class Main {
    public static void main(String[] args) {

        Cat cats = new Cat("Туч", 3);
        Dog dogs = new Dog ("Чейз", 8);
        Rat rats = new Rat ("Лора", 1);

        Animal[] array = new Animal[3];
        array[0] = cats;
        array[1] = dogs;
        array[2] = rats;

        for (Animal a : array) {
            a.makeNoise();
            }
    }
}