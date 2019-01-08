package sis.studentinfo;

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

    public CourseSession(String department, String number, Date startDate) {
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


    public int getNumberOfStudent() {

        return students.size();
    }

    public void enroll(Student student) {
        students.add(student);
    }

    Date getStartDate() {
        return startDate;
    }


    Student get(int index) {
        return students.get(index);
    }

    static final String NEWLINE = System.getProperty("line.separator");
    static final String ROSTER_REPORT_HEADER = "Student" + NEWLINE + "____" + NEWLINE;
    static final String ROSTER_REPORT_FOOTER = NEWLINE + "# students =";
//
//    String getRosterReport() {
//
//        StringBuilder buffer = new StringBuilder();
//
//        buffer.append(ROSTER_REPORT_HEADER);
//
//        for (Student student : students) {
//            buffer.append(student.getName());
//            buffer.append(NEWLINE);
//        }
//
////        Student student = students.get(0);
////        buffer.append(student.getName());
////        buffer.append(NEWLINE);
////
////        student = students.get(1);
////        buffer.append(student.getName());
////        buffer.append(NEWLINE);
//
//        buffer.append(ROSTER_REPORT_FOOTER + students.size() + NEWLINE);
//
//        return buffer.toString();
//
//    }

    public ArrayList<Student> getAllStudents() {
        return students;
    }


}
