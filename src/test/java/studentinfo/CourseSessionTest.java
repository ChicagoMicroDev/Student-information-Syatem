package studentinfo;

import org.junit.Before;
import org.junit.Test;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import static org.junit.Assert.assertEquals;

public class CourseSessionTest {

    private CourseSession session;
    private Date startDate;


    @Before
    public void setUp() {

        startDate = new Date(2003, 1, 6);
        session = new CourseSession("ENGL", "101", startDate);
    }

    @Test
    public void canCreate() {
//        CourseSession session = new CourseSession("ENGL", "101");
        assertEquals("ENGL", session.getDepartment());
        assertEquals("101", session.getNumber());
        assertEquals(0, session.getNumberOfStudent());
        assertEquals(startDate, session.getStartDate());
    }

    @Test
    public void canEnrollStudent() {
//        CourseSession session = new CourseSession("ENGL", "101");
        Student student1 = new Student("Joseph Smith ");
        session.enroll(student1);
        assertEquals(1, session.getNumberOfStudent());
        assertEquals(student1, session.get(0));

        Student student2 = new Student("Semira Allen");
        session.enroll(student2);
        assertEquals(2, session.getNumberOfStudent());
        assertEquals(student1, session.get(0));
        assertEquals(student2, session.get(1));
    }

    @Test
    public void CanCreateCourseDates() {
        Date sixteenWeeksOut = new Date(2003, 4, 26);
        assertEquals(sixteenWeeksOut, session.getEndDate());
    }

    Date createDate(int year, int month, int date) {
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.clear();
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month - 1);
        calendar.set(Calendar.DAY_OF_MONTH, date);
        return calendar.getTime();
    }
}

//    @Test
//    public void CanCreateRosterReport() {
//        session.enroll(new Student("A"));
//        session.enroll(new Student("B"));
//
//        String rosterReport = session.getRosterReport();
//        assertEquals(
//                CourseSession.ROSTER_REPORT_HEADER +
//                        "A\nB\n" +
//                        CourseSession.ROSTER_REPORT_FOOTER + "Z\n", rosterReport);
//
//
//    }
//}

