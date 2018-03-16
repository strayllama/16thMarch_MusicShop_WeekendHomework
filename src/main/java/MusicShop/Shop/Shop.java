package MusicShop.Shop;

import Behaviors.ISell;

import java.util.ArrayList;

public class Shop {
    private String name;
    private ArrayList<ISell> stock;

    public Shop(String name){
        this.name = name;
        stock = new ArrayList();
    }

    public String getName() {
        return this.name;
    }

    public String[] getStock() {
        String[] stockList = {"","",""}; // I KNOW THIS IS TERRIBLE, but only for my text output for testing.
        for (int i=0; i < countStock(); i++) {
            String aLine = ("Stock Item ID " + this.stock.get(i).getId() + ", MAKE: " + this.stock.get(i).getMake() + ", MODEL: " + this.stock.get(i).getModel() );
            System.out.println("Stock Item ID " + this.stock.get(i).getId() + ", MAKE: " + this.stock.get(i).getMake() + ", MODEL: " + this.stock.get(i).getModel() );
            stockList[i] = aLine;
        }
        return stockList;
    }

    public int getStockProfitMargin(){
        int profitMargin = 0;
        for (int i=0; i < countStock(); i++) {
            profitMargin += stock.get(i).calculateMarkup();
        }
        return profitMargin;
    }

    public int countStock() {
        return stock.size();
    }

    public void addStock(ISell aStock) {
        this.stock.add(aStock);
    }

    public void removeStock(int id) {
        for (int i = 0; 1 < countStock(); i++ ){
            if (this.stock.get(i).getId() == id){
                this.stock.remove(i);
            }
        }
    }
}
