import TechStaff.Developer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void setup(){
        developer = new Developer("Gordon", "CD 23 45 67 E", 25000);

    }

    @Test
    public void canGetName(){
        assertEquals("Gordon", developer.getName());
    }

    @Test
    public void canGetNINumber(){
        assertEquals("CD 23 45 67 E", developer.getNiNumber());
    }

    @Test
    public void canGetSalary(){
        assertEquals(25000, developer.getSalary(), 0.01);
    }

    @Test
    public void canIncreaseSalary(){
        developer.raiseSalary(1.05);
        assertEquals(26250, developer.getSalary(), 0.01);
    }

    @Test
    public void cannotApplyNegativeSalaryRaise(){
        developer.raiseSalary(-1.05);
        assertEquals(25000, developer.getSalary(), 0.01);
    }

    @Test
    public void canGetBonus(){
        assertEquals(250, developer.payBonus(), 0.01);
    }

    @Test
    public void canChangeName(){
        developer.setName("Alice");
        assertEquals("Alice", developer.getName());
    }

    @Test
    public void cannotChangeName(){
        developer.setName(null);
        assertEquals("Gordon", developer.getName());
    }
}
