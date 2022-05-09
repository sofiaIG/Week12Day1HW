import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestPrinter {
    Printer printer;

    @Before
    public void before(){
        printer = new Printer(100, 150);
    }

    @Test
    public void getnumberSheets(){
        assertEquals(100, printer.getNumberOfSheetsLeft());
    }

    @Test
    public void getTonerVolume(){
        assertEquals(150, printer.getTonerVolume());
    }

    @Test
    public void printNotEnoughVolOrPaper(){
        assertEquals("Not enough paper or toner to complete print", printer.print(30,4));
    }

    @Test
    public void printDisplayRemainingVolAndPaper(){
        assertEquals("Number of Sheets left 10. Toner volume left 60", printer.print(30,3));
    }



}
