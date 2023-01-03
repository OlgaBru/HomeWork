public class Drum implements Instrument{
    private int sizeDrum;
    Drum (int sizeDrum) {
        this.sizeDrum = sizeDrum;
    }

    int getSizeDrum() {
        return sizeDrum;
    }

    @Override
    public void play() {
        System.out.println("Играет барабан, размер " + sizeDrum + " см");
    }
}
