package studentinfo;

import org.junit.runner.*;
import org.junit.runners.Suite;
@RunWith(Suite.class)
@Suite.SuiteClasses({
        StudentTest.class,
        CourseSessionTest.class,
        RosterReporterTest.class,
        DateUtilTest.class,
})

public class AllTests {
}
