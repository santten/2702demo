import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TimeCalTest {
    @Test
    public void TimeCalculatorTest() {
        assertEquals(1.0, TimeCal.timeCalculator(100.0, 100.0), 0);
    }
}