package MusicShop.Shop;

import Behaviors.ISell;

public abstract class StockItem implements ISell {
    public static int count = 0;
    private int id;
    private String make;
    private String model;
    private int buyPrice;
    private int sellPrice;

    public StockItem(int buyPrice, int sellPrice, String make, String model){
        this.count += 1;
        this.id = count;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
        this.make = make;
        this.model = model;
    }

    // GETTERS
    public int getId() {
        return this.id;
    }


    public String getMake() {
        return this.make;
    }

    public String getModel() {
        return this.model;
    }

    // Other Methods

    @Override
    public int calculateMarkup() {
        return ( sellPrice - buyPrice );
    }

    public int getBuyPrice() {
        return this.buyPrice;
    }

    public int getSellPrice() {
        return this.sellPrice;
    }
}
