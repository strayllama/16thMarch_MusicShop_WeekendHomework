package MusicShop.Accessories;

import MusicShop.StockItem;

public abstract class Accessory extends StockItem {

    public Accessory(int buyPrice, int sellPrice ,String make, String model) {
        super(buyPrice, sellPrice, make, model);
    }

}
