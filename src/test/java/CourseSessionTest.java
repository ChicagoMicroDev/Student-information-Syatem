import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CourseSessionTest {
    @Test
    public void testCreate() {

        CourseSession session = new CourseSession("ENGL", "101");
        assertEquals("ENGL", session.getDepartment());
        assertEquals("101", session.getNumber());
        assertEquals(0, session.getNumberofStudent());

        Student student1 = new Student("Joseph Smith ");
        session.enroll(student1);
        assertEquals(1,session.getNumberofStudent());

        Student student2 = new Student("Semira Allen");
        session.enroll(student2);
        assertEquals(2, session.getNumberofStudent());


    }
}
