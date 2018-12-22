package studentinfo;

import org.junit.Test;
import studentinfo.CourseSession;
import studentinfo.Student;


import static junit.framework.TestCase.assertEquals;

import java.util.ArrayList;

public class CourseSessionTest {
    private CourseSession session;

    public void setUp() {
        session = new CourseSession("ENGL", "101");
    }

    @Test

    public void canCreate() {
        CourseSession session = new CourseSession("ENGL", "101");
        assertEquals("ENGL", session.getDepartment());
        assertEquals("101", session.getNumber());
        assertEquals(0, session.getNumberofStudent());

        Student student1 = new Student("Joseph Smith ");
        session.enroll(student1);
        assertEquals(1, session.getNumberofStudent());
        ArrayList<Student> allStudents = session.getAllStudents();
        assertEquals(1, allStudents.size());
        assertEquals(student1, allStudents.get(0));

        Student student2 = new Student("Semira Allen");
        session.enroll(student2);
        assertEquals(2, session.getNumberofStudent());
        assertEquals(student1, allStudents.get(0));
        assertEquals(student2, allStudents.get(1));


    }
}
