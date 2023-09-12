import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WorkerTest {
private Worker w1, w2;
    @BeforeEach
    void setUp()
    {
        w1 = new Worker("000001", "Joshua", "Gormly", "Mr.", 2002, 17.50);
        w2 = new Worker("000002", "John", "Gormly", "Mr.", 1978, 85.00);
    }



    @Test
    void calculateWeeklyPay()
    {
        assertEquals(175.00, w1.calculateWeeklyPay(10.0));
    }

    @Test
    void displayWeeklyPay()
    {
        assertEquals("726.25", w1.displayWeeklyPay(40));
    }

    @Test
    void testSetHourlyPayRate()
    {
        w2.setHourlyPayRate(50);
        assertEquals(50, w2.getHourlyPayRate());
    }
}