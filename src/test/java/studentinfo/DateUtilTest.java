package studentinfo;

import java.util.*;
import org.junit.*;

import static org.junit.Assert.assertEquals;


public class DateUtilTest {

    @Test
    public void CanCreateDate() {
        Date date = new DateUtil().createDate(2000, 1, 1);
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(date);
        assertEquals(2000, calendar.get(calendar.YEAR));
        assertEquals(Calendar.JANUARY, calendar.get(calendar.MONTH));
        assertEquals(1,calendar.get(calendar.DAY_OF_MONTH));


    }
}