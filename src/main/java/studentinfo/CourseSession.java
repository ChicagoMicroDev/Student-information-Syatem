package studentinfo;

import java.util.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CourseSession {

    private String department;
    private String number;
    private ArrayList<Student> students =
            new ArrayList<Student>();
    private Date startDate;

    CourseSession(String department, String number, Date startDate) {
        this.department = department;
        this.number = number;
        this.startDate = startDate;

    }

    Date getEndDate() {
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTime(startDate);
        int numberOfDays = 16 * 7 - 3;
        calendar.add(Calendar.DAY_OF_YEAR, numberOfDays);
        return calendar.getTime();
    }

    String getDepartment() {
        return department;
    }

    String getNumber() {
        return number;
    }


    int getNumberOfStudent() {

        return students.size();
    }

    void enroll(Student student) {
        students.add(student);
    }

    Date getStartDate() {
        return startDate;
    }


    Student get(int index) {
        return students.get(index);
    }

//    String getRosterReport(){
//        StringBuilder buffer = new StringBuilder();
//
//        buffer.append(ROSTER_REPORT_HEADER);
//
//        Student student = students.get(0);
//        buffer.append(students.getName());
//        buffer.append('\n');
//
//        student = student.get(1);
//        buffer.append(student.getName());
//        buffer.append('\n');
//
//        buffer.append(ROSTER_REPORT_FOOTER + students.size() + '\n');
//
//        return buffer.toString();
//
//    }
//
//
}
