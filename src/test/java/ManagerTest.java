import Management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void setup(){
        manager = new Manager ("Laura", "AB 12 34 56 C", 25000, "Team A");
    }

    @Test
    public void canGetName(){
        assertEquals("Laura", manager.getName());
    }

    @Test
    public void canGetNINumber(){
        assertEquals("AB 12 34 56 C", manager.getNiNumber());
    }

    @Test
    public void canGetSalary(){
        assertEquals(25000, manager.getSalary(), 0.01);
    }

    @Test
    public void canGetDeptName(){
        assertEquals("Team A", manager.getDeptName());
    }

    @Test
    public void canIncreaseSalary(){
        manager.raiseSalary(5000);
        assertEquals(30000, manager.getSalary(), 0.01);
    }

    @Test
    public void canGetBonus(){
        assertEquals(250, manager.payBonus(), 0.01);
    }

}
