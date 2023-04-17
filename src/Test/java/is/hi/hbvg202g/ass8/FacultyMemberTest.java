package is.hi.hbvg202g.ass8;

import is.hi.hbv202g.ass8.FacultyMember;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FacultyMemberTest {
    private String name = "NAME_OF_FACULTY_MEMBER";
    private String department = "DEPARTMENT";
    private FacultyMember facultyMember;

    @Before
    public void setUp(){
        facultyMember = new FacultyMember(name, department);
    }

    @Test
    public void TestFacultyMemberName(){
        assertEquals(name, facultyMember.getName());
    }
    @Test
    public void TestFacultyMemberDepartment(){
        assertEquals(department, facultyMember.getDepartment());
    }
}
