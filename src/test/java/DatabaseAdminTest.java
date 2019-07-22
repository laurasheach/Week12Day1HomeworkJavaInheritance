import TechStaff.DatabaseAdmin;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void setup(){
        databaseAdmin = new DatabaseAdmin("Bob", "EF 34 56 78 G", 25000);
    }

    @Test
    public void canGetName(){
        assertEquals("Bob", databaseAdmin.getName());
    }

    @Test
    public void canGetNINumber(){
        assertEquals("EF 34 56 78 G", databaseAdmin.getNiNumber());
    }

    @Test
    public void canGetSalary(){
        assertEquals(25000, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void canIncreaseSalary(){
        databaseAdmin.raiseSalary(1.05);
        assertEquals(26250, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void cannotApplyNegativeSalaryRaise(){
        databaseAdmin.raiseSalary(-1.05);
        assertEquals(25000, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void canGetBonus(){
        assertEquals(250, databaseAdmin.payBonus(), 0.01);
    }

    @Test
    public void canChangeName(){
        databaseAdmin.setName("Alice");
        assertEquals("Alice", databaseAdmin.getName());
    }

    @Test
    public void cannotChangeName(){
        databaseAdmin.setName(null);
        assertEquals("Bob", databaseAdmin.getName());
    }

}
