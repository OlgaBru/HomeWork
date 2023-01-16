public class Guiter implements Instrument{
    private int numberStrings;
    Guiter (int numberStrings) {
        this.numberStrings = numberStrings;
    }

    int getNumberStrings() {
        return numberStrings;
    }

    @Override
    public void play() {
        System.out.println("Играет гитара с количеством струн " + numberStrings);
    }
}
