package sis.studentinfo;
import java.util.*;

public class DateUtil {

    public Date createDate(int year, int month, int date){
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.clear();
        calendar.set(calendar.YEAR,year);
        calendar.set(calendar.MONTH, month -1);
        calendar.set(calendar.DAY_OF_MONTH, date);
        calendar.set(Calendar.DAY_OF_MONTH,date);
        return calendar.getTime();


    }

}
