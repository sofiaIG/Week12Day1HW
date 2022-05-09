import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCalculator {

    Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator(6, 5);
    }

    @Test
    public void hasNum1(){
        assertEquals(6, calculator.getNum1());
    }

    @Test
    public void hasNum2(){
        assertEquals(5, calculator.getNum2());
    }

    @Test
    public void testAdd(){
        assertEquals(11, calculator.add());
    }

    @Test
    public void testSubtract(){
        assertEquals(1, calculator.subtract());
    }

    @Test

    public void testDivision(){
        assertEquals(0.5, calculator.divide(2.5, 5), 0.0);
    }

}
