package MusicShop.Instruments;

public abstract class Keys extends Instrument {
    private int numberOfKeys;

    public Keys(int buyPrice, int sellPrice, String make, String model, InstrumentType type, int numberOfKeys) {
        super(buyPrice, sellPrice, make, model,type);
        this.numberOfKeys = numberOfKeys;
    }

    // GETTERS + SETTERS
    public int getNumberOfKeys() {
        return this.numberOfKeys;
    }


}
