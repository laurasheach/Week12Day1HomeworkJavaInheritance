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
        director.raiseSalary(5000);
        assertEquals(80000, director.getSalary(), 0.01);
    }

    @Test
    public void canGetBonus(){
        assertEquals(750, director.payBonus(), 0.01);
    }

    @Test
    public void canGetBudget(){
        assertEquals(100000, director.getBudget(), 0.01);
    }

}
