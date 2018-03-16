import MusicShop.Instruments.InstrumentType;
import MusicShop.Instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestPiano {
    private Piano aPiano;

    @Before
    public void before() {
     aPiano = new Piano(350,500,"Yamaha", "P500", InstrumentType.KEYS, 105, "Grand");
    }

    @Test
    public void pianoHasBuyPrice() {
        assertEquals(350, aPiano.getBuyPrice());
    }

    @Test
    public void pianoHasSellPrice() {
        assertEquals(500, aPiano.getSellPrice());
    }

    @Test
    public void pianoHasMake() {
        assertEquals("Yamaha", aPiano.getMake());
    }

    @Test
    public void pianoHasModel() {
        assertEquals("P500", aPiano.getModel());
    }

    @Test
    public void pianoHasNoise() {
        assertEquals("Plinky Plonky", aPiano.getType().getNoise());
    }

    @Test
    public void pianoHasNumberOfKeys() {
        assertEquals(105, aPiano.getNumberOfKeys());
    }


    @Test
    public void pianoHasStyle() {
        assertEquals("Grand", aPiano.getStyle());
    }

    @Test
    public void pianoCalcMarkup() {
        assertEquals(150, aPiano.calculateMarkup());
    }
}
