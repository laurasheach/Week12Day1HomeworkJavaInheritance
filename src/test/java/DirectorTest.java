import Management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void setup(){
        director = new Director("Hazel", "GH 45 67 89 I", 75000, "Team A", 100000);
    }

    @Test
    public void canGetName(){
        assertEquals("Hazel", director.getName());
    }

    @Test
    public void canGetNINumber(){
        assertEquals("GH 45 67 89 I", director.getNiNumber());
    }

    @Test
    public void canGetSalary(){
        assertEquals(75000, director.getSalary(), 0.01);
    }

    @Test
    public void canIncreaseSalary(){
        director.raiseSalary(1.05);
        assertEquals(78750, director.getSalary(), 0.01);
    }

    @Test
    public void cannotApplyNegativeSalaryRaise(){
        director.raiseSalary(-1.05);
        assertEquals(75000, director.getSalary(), 0.01);
    }

    @Test
    public void canGetBonus(){
        assertEquals(1500, director.payBonus(), 0.01);
    }

    @Test
    public void canGetBudget(){
        assertEquals(100000, director.getBudget(), 0.01);
    }

    @Test
    public void canChangeName(){
        director.setName("Alice");
        assertEquals("Alice", director.getName());
    }

    @Test
    public void cannotChangeName(){
        director.setName(null);
        assertEquals("Hazel", director.getName());
    }

}
