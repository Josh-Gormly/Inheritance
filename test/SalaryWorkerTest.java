import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SalaryWorkerTest {
SalaryWorker sw1, sw2;
    @BeforeEach
    void setUp()
    {
        sw1 = new SalaryWorker("000001", "Joshua", "Gormly","Mr.", 2002, 17.50, 52000);
        sw2 = new SalaryWorker("000002", "John", "Gormly", "Mr.", 1978, 85.00, 234000);
    }

    @Test
    void setAnnualSalary()
    {
        sw2.setAnnualSalary(300000);
        assertEquals(300000, sw2.getAnnualSalary());
    }

    @Test
    void calculateWeeklyPay()
    {
        assertEquals(1000.00, sw1.calculateWeeklyPay(20));
        assertEquals(1000.00, sw1.calculateWeeklyPay(50));
    }

    @Test
    void displayWeeklyPay()
    {
        assertEquals("1000.00", sw1.displayWeeklyPay(20));
        assertEquals("1000.00", sw1.displayWeeklyPay(50));
    }
}