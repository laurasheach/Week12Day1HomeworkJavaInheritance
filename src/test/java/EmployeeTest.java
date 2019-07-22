import Management.Director;
import Management.Manager;
import Staff.Employee;
import TechStaff.DatabaseAdmin;
import TechStaff.Developer;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class EmployeeTest {

    Employee employee;

    @Test
    public void managerAsEmployee(){
        employee = new Manager("Laura", "AB 12 34 56 C", 50000, "Team A");
        assertEquals("Laura", employee.getName());
    }

    @Test
    public void developerAsEmployee(){
        employee = new Developer("Gordon", "CD 23 45 67 E", 25000);
        assertEquals("Gordon", employee.getName());
    }

    @Test
    public void databaseAsEmployee(){
        employee = new DatabaseAdmin("Bob", "EF 34 56 78 G", 25000);
        assertEquals("Bob", employee.getName());
    }

    @Test
    public void directorAsEmployee(){
        employee = new Director("Hazel", "GH 45 67 89 I", 75000, "Team A", 100000);
        assertEquals("Hazel", employee.getName());
    }

    @Test
    public void canChangeNameOfEmployee(){
        employee = new Manager("Laura", "AB 12 34 56 C", 50000, "Team A");
        employee = new DatabaseAdmin("Bob", "EF 34 56 78 G", 25000);
        assertEquals("Bob", employee.getName());
    }

    @Test
    public void collectionOfParentCollection(){
        ArrayList<Employee> staff = new ArrayList<Employee>();
        staff.add(new Manager("Laura", "AB 12 34 56 C", 50000, "Team A"));
        staff.add(new DatabaseAdmin("Bob", "EF 34 56 78 G", 25000));
        assertEquals(2, staff.size());
    }

    @Test
    public void objectRembersItsType(){
        employee = new Developer("Gordon", "CD 23 45 67 E", 25000);
        Developer developer = (Developer) employee;
        assertEquals("Gordon", developer.getName());

    }
}
