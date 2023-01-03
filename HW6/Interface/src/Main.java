public class Main {
    public static void main(String[] args) {

        Instrument[] array = new Instrument[3];
        array[0] = new Guiter(6);
        array[1] = new Drum(60);
        array[2] = new Tuba(70);

        for (Instrument i : array) {
            i.play();
        }
    }
}