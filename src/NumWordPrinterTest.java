import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class NumWordPrinterTest {
    NumWordPrinter Printer = new NumWordPrinter();
    @Test
    public void testdivisiblebyall3() {
        assertEquals("EvenPrimeLucky", Printer.PrintWord(858, false));
        assertEquals("EVENPRIMELUCKY", Printer.PrintWord(858, true));
        assertEquals("EvenPrimeLucky", Printer.PrintWord(286, false));
    }
    @Test
    public void testdivisibleby2and11() {
        assertEquals("EvenPrimeEleven", Printer.PrintWord(22, false));
        assertEquals("EVENPRIMEELEVEN", Printer.PrintWord(22, true));
        assertEquals("EvenPrimeEleven", Printer.PrintWord(43, false));
    }
    @Test
    public void testdivisibleby2() {
        assertEquals("Even", Printer.PrintWord(2, false));
        assertEquals("EVEN", Printer.PrintWord(2, true));
        assertEquals("Even", Printer.PrintWord(4, false));
    }
    @Test
    public void testdivisibleby11() {
        assertEquals("PrimeEleven", Printer.PrintWord(11, false));
        assertEquals("PRIMEELEVEN", Printer.PrintWord(11, true));
        assertEquals("PrimeEleven", Printer.PrintWord(33, false));
    }
    @Test
    public void testdivisibleby13() {
        assertEquals("LuckyThirteen", Printer.PrintWord(13, false));
        assertEquals("LUCKYTHIRTEEN", Printer.PrintWord(13, true));
        assertEquals("LuckyThirteen", Printer.PrintWord(26, false));
    }
    @Test
    public void testdivisiblebynone() {
        assertEquals("OddOneOut", Printer.PrintWord(1, false));
        assertEquals("ODDONEOUT", Printer.PrintWord(1, true));
        assertEquals("OddOneOut", Printer.PrintWord(3, false));
    }
    @Test
    public void testUpperCase() {
        assertEquals("ODDONEOUT", Printer.PrintWord(1, false));
        assertEquals("ODDONEOUT", Printer.PrintWord(1, true));
        assertEquals("EVEN", Printer.PrintWord(2, false));
    };

}