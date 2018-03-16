package MusicShop.Instruments;

public class Piano extends Keys {
    private String style;
    public Piano(int buyPrice, int sellPrice, String make, String model, InstrumentType type, int numberOfKeys, String style) {
        super(buyPrice, sellPrice, make, model, type, numberOfKeys);
        this.style = style;
    }

    // Getter
    public String getStyle() {
        return this.style;
    }

}
