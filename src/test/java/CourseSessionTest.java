import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CourseSessionTest {
    @Test
    public void testCreate() {

        CourseSession session = new CourseSession("ENGL", "101");
        assertEquals("ENGL", session.getDepartment());
        assertEquals("101", session.getNumber());


    }
}
