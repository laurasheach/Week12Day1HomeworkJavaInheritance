import Management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void setup(){
        manager = new Manager ("Laura", "AB 12 34 56 C", 50000, "Team A");
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
        assertEquals(50000, manager.getSalary(), 0.01);
    }

    @Test
    public void canGetDeptName(){
        assertEquals("Team A", manager.getDeptName());
    }

    @Test
    public void canIncreaseSalary(){
        manager.raiseSalary(1.05);
        assertEquals(52500, manager.getSalary(), 0.01);
    }

    @Test
    public void cannotApplyNegativeSalaryRaise(){
        manager.raiseSalary(-1.05);
        assertEquals(50000, manager.getSalary(), 0.01);
    }

    @Test
    public void canGetBonus(){
        assertEquals(500, manager.payBonus(), 0.01);
    }

    @Test
    public void canChangeName(){
        manager.setName("Alice");
        assertEquals("Alice", manager.getName());
    }

    @Test
    public void cannotChangeName(){
        manager.setName(null);
        assertEquals("Laura", manager.getName());
    }

}
