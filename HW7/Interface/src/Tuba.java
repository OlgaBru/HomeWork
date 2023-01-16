public class Tuba implements Instrument{
    private int diameterTuba;
    Tuba (int diameterTuba) {
        this.diameterTuba = diameterTuba;
    }

    int getDiameterTuba() {
        return diameterTuba;
    }

    @Override
    public void play() {
        System.out.println("Играет туба диаметром " + diameterTuba + " см");
    }
}
