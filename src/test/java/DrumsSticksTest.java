import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumsSticksTest {

    DrumSticks drumsSticks;

    @Before
    public void before(){
        drumsSticks = new DrumSticks(10, 15);
    }

    @Test
    public void hasCostPrice() {
        assertEquals(10, drumsSticks.getCostPrice(), 0.1);
    }

    @Test
    public void hasSellPrice() {
        assertEquals(15, drumsSticks.getSellPrice(), 0.1);
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(5, drumsSticks.calculateMarkup(), 0.1);
    }
}
