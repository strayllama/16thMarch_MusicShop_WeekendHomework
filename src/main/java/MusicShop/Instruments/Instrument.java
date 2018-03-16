package MusicShop.Instruments;

import Behaviors.IPlay;
import MusicShop.Shop.StockItem;

public abstract class Instrument extends StockItem implements IPlay {
    private InstrumentType type;

    public Instrument(int buyPrice, int sellPrice,String make, String model, InstrumentType type ){
        super(buyPrice, sellPrice, make, model);
        this.type = type;
    }

    // GETTERS
    public InstrumentType getType() {
        return this.type;
    }

    @Override
    public String play() {
        return type.getNoise();
    }

}
