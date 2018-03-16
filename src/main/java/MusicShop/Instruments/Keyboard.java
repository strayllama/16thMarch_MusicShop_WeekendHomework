package MusicShop.Instruments;

public class Keyboard extends Keys {
    private boolean blueTooth;
    public Keyboard(int buyPrice, int sellPrice, String make, String model, InstrumentType type, int numberOfKeys, boolean blueTooth) {
        super(buyPrice, sellPrice, make, model, type, numberOfKeys);
        this.blueTooth = blueTooth;
    }


    public boolean getBlueTooth() {
        return this.blueTooth;
    }
}
