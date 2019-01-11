package sis.report;

import org.junit.*;
//import sis.report.RosterReporter;
import sis.studentinfo.CourseSession;
import sis.studentinfo.DateUtil;
import sis.studentinfo.*;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import static org.junit.Assert.assertEquals;


public class RosterReporterTest {
    @Test
    public void CanCreateRosterReport() {
        CourseSession session = new CourseSession("ENGL", "101", new DateUtil().createDate(2003, 1 , 6));

        session.enroll(new Student("Joseph Smith"));
        session.enroll(new Student("Semira Allen"));

        String rosterReport = new RosterReporter(session).getReport();
        System.out.println(rosterReport);
        assertEquals(RosterReporter.ROSTER_REPORT_HEADER + "Joseph Smith" + RosterReporter.NEWLINE + "Semira Allen" + RosterReporter.NEWLINE + RosterReporter.ROSTER_REPORT_FOOTER + "2" + RosterReporter.NEWLINE, rosterReport);
    }
    Date createDate(int year, int month, int date){
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.clear();
        calendar.set(calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month -1);
        calendar.set(Calendar.DAY_OF_MONTH,date);
        return calendar.getTime();
    }
}
