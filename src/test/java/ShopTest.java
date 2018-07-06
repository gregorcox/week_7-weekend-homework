import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    Guitar guitar;
    DrumSticks drumSticks;
    ArrayList<ISell> stock;

    @Before
    public void before(){
        stock = new ArrayList<>();
        shop = new Shop(stock);
        guitar = new Guitar("wood", "brown", InstrumentType.STRING, 80, 100, 6);
        drumSticks = new DrumSticks(10, 15);
    }

    @Test
    public void hasStock(){
        assertEquals(0, shop.getStockSize());
    }

    @Test
    public void canAddToStock(){
        shop.addToStock(guitar);
        shop.addToStock(drumSticks);
        assertEquals(2, shop.getStockSize());
    }

    @Test
    public void canRemoveFromStock(){
        shop.addToStock(guitar);
        shop.addToStock(drumSticks);
        shop.removeFromStock(guitar);
        assertEquals(1, shop.getStockSize());
    }

    @Test
    public void canCalculateTotalValue(){
        shop.addToStock(guitar);
        shop.addToStock(drumSticks);
        assertEquals(25, shop.calculateStockValue(), 0.1);
    }
}
