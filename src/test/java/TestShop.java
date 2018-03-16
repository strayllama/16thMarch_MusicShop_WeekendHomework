import MusicShop.Shop.Shop;
import MusicShop.Accessories.Strings;
import MusicShop.Instruments.InstrumentType;
import MusicShop.Instruments.Keyboard;
import MusicShop.Instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

public class TestShop {
    private Shop myShop;
    private Strings guitarStrings;
    private Piano aPiano;
    private Keyboard aKeyboard;



    @Before
    public void before() {
        guitarStrings = new Strings(5,8, "Martin", "Accoustic");
        aPiano = new Piano(2500,4000,"Yamaha", "Stage Master", InstrumentType.KEYS, 105, "Grand");
        aKeyboard = new Keyboard(350,500,"Yamaha", "P500", InstrumentType.KEYS, 105,false);
        myShop = new Shop("Scales");
    }

    @Test
    public void canAddStock() {
        assertEquals(0, myShop.countStock());
        myShop.addStock(aPiano);
        assertEquals(1, myShop.countStock());
    }

    @Test
    public void canListStock() {
        myShop.addStock(guitarStrings);
        myShop.addStock(aPiano);
        myShop.addStock(aKeyboard);
        String[] list = {"Stock Item ID 1, MAKE: Martin, MODEL: Accoustic","Stock Item ID 2, MAKE: Yamaha, MODEL: Stage Master","Stock Item ID 3, MAKE: Yamaha, MODEL: P500"};
        assertEquals(list, myShop.getStock());
        // WHY IS THIS DEPRICATED?
    }

    @Test
    public void canRemoveStock() {
        myShop.addStock(guitarStrings);
        myShop.addStock(aPiano);
        myShop.removeStock(2);
        String[] list2 = {"Stock Item ID 1, MAKE: Martin, MODEL: Accoustic","", ""};
        assertEquals(list2, myShop.getStock());  // I HATE THIS getStock OUTPUT.
    }

    @Test
    public void getStockProfitMargin() {
        myShop.addStock(guitarStrings);
        myShop.addStock(aPiano);
        myShop.addStock(aKeyboard);
        assertEquals(1653, myShop.getStockProfitMargin());
    }
}
