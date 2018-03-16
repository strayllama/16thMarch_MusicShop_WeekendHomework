import MusicShop.Accessories.Strings;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestStrings {
    private Strings guitarStrings;

    @Before
    public void before() {
        guitarStrings = new Strings(5,8, "Martin", "Accoustic");
    }

    @Test
    public void stringsHaveBuyPrice() {
        assertEquals(5, guitarStrings.getBuyPrice());
    }

    @Test
    public void stringsHaveSellPrice() {
        assertEquals(8, guitarStrings.getSellPrice());
    }


    @Test
    public void stringsHaveMake() {
        assertEquals("Martin", guitarStrings.getMake());
    }


    @Test
    public void stringsHaveModel() {
        assertEquals("Accoustic", guitarStrings.getModel());
    }


    @Test
    public void stringsCalcMarkup() {
        assertEquals(3, guitarStrings.calculateMarkup());
    }


}
