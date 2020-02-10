import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator(2, 10);
    }

@Test
    public void canAddTwoNumbers(){
        assertEquals(12, calculator.add());
}

}
