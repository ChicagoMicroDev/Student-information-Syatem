package sis.studentinfo;

import org.junit.runner.*;
import org.junit.runners.Suite;
import sis.report.RosterReporterTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        StudentTest.class,
        CourseSessionTest.class,
        RosterReporterTest.class,
        DateUtilTest.class,
})

public class AllTests {
}
