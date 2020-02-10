import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PrinterTest {
    private Printer printer;

    @Before
    public void before(){
        printer = new Printer(100);
    }

    @Test
    public void checkStartsWith100Paper(){
        assertEquals(100, printer.checkPaperLeft());
    }

    @Test
    public void checkCanTellIfHasMoreThanEnoughPaperToPrint(){
        assertEquals(true, printer.hasEnoughPaperToPrint(90));
    }

    @Test
    public void checkCanTellIfHasExactlyEnoughPaperToPrint(){
        assertEquals(true, printer.hasEnoughPaperToPrint(100));
    }

    @Test
    public void checkCanTellIfDoesNotHaveEnoughPaperToPrint(){
        assertEquals(false, printer.hasEnoughPaperToPrint(101));
    }
}
