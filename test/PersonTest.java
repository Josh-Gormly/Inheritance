import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Calendar;

class PersonTest
{
    private Person p1,p2,p3;

    @BeforeEach
    void setUp()
    {
        p1 = new Person("000001", "Josh", "Gorm", "", 2002);
        p2 = new Person("000002", "Cynthia", "Gormly", "Mrs.", 1974);
        p3 = new Person("000003", "John", "Gormly", "Mr.", 1968);
    }

    @Test
    void setID()
    {
        p1.setID("000004");
        assertEquals("000004", p1.getID());
    }

    @Test
    void setFirstName()
    {
        p1.setFirstName("Joshua");
        assertEquals("Joshua", p1.getFirstName());
    }

    @Test
    void setLastName()
    {
        p1.setLastName("Gormly");
        assertEquals("Gormly", p1.getLastName());
    }

    @Test
    void setTitle()
    {
        p3.setTitle("Mrs.");
        assertEquals("Mrs.", p3.getTitle());
    }

    @Test
    void setYearOfBirth()
    {
        p1.setYearOfBirth(2001);
        assertEquals(2001, p1.getYearOfBirth());
    }

    @Test
    void toCSVDataRecord()
    {
        assertEquals("000003, John, Gormly, Mr., 1968", p3.toCSVDataRecord());
    }

    @Test
    void getFullName()
    {
        assertEquals("John Gormly", p3.getFullName());
    }

    @Test
    void getFormalName()
    {
        assertEquals("Mrs. Cynthia Gormly", p2.getFormalName());
    }

    @Test
    void getAge()
    {
        assertEquals(Calendar.YEAR - p2.getYearOfBirth(), p2.getAge());
    }

    @Test
    void testGetAge()
    {
        assertEquals(49, p2.getAge(2023));
    }
}