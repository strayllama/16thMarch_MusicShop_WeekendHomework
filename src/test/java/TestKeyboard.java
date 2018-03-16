import MusicShop.Instruments.InstrumentType;
import MusicShop.Instruments.Keyboard;
import MusicShop.Shop.StockItem;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestKeyboard {
    private Keyboard aKeyboard;

    @Before
    public void before() {
        aKeyboard = new Keyboard(350,500,"Yamaha", "P500", InstrumentType.KEYS, 105,false);
    }

    @Test
    public void keyboardHasBuyPrice() {
        assertEquals(350, aKeyboard.getBuyPrice());
    }

    @Test
    public void keyboardHasSellPrice() {
        assertEquals(500, aKeyboard.getSellPrice());
    }

    @Test
    public void keyboardHasMake() {
        assertEquals("Yamaha", aKeyboard.getMake());
    }

    @Test
    public void keyboardHasModel() {
        assertEquals("P500", aKeyboard.getModel());
    }

    @Test
    public void keyboardHasNoise() {
        assertEquals("Plinky Plonky", aKeyboard.getType().getNoise());
    }

    @Test
    public void keyboardHasNumberOfKeys() {
        assertEquals(105, aKeyboard.getNumberOfKeys());
    }


    @Test
    public void keyboardHasBlueTooth() {
        assertEquals(false, aKeyboard.getBlueTooth());
    }

    @Test
    public void keyboardCalcMarkup() {
        assertEquals(150, aKeyboard.calculateMarkup());
    }

    @Test
    public void keyboardHasID() {
        assertEquals(1 , aKeyboard.getId());
    }

    @Test
    public void StockItemHasCount() {
        assertEquals(1, StockItem.count);
    }
}
