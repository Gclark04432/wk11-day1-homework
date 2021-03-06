import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class WaterBottleTest {
    private WaterBottle bottle;

    @Before
    public void before(){
        bottle = new WaterBottle(100);
    }

    @Test
    public void checkVolumeStartsAt100(){
        assertEquals(100, bottle.checkCurrentVolume());
    }

    @Test
    public void checkVolumeDecreasesBy10WhenDrinkIsCalled(){
        bottle.drink();
        assertEquals(90, bottle.checkCurrentVolume());
    }

    @Test
    public void checkEmptyFunctionReducesVolumeToZero(){
        bottle.empty();
        assertEquals(0, bottle.checkCurrentVolume());
    }

    @Test
    public void checkFillFunctionChangesVolumeTo100Again(){
        bottle.empty();
        bottle.fill();
        assertEquals(100, bottle.checkCurrentVolume());
    }


}
