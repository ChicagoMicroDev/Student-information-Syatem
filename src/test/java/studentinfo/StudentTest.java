package studentinfo;

import org.junit.Test;
import studentinfo.Student;

import static org.junit.Assert.assertEquals;

public class StudentTest {
    @Test
    public void canCreate() {
        final String firstStudentName = "Jane Doe"  ;
        final String SecondStudentName = "Joe Blow ";
       Student student = new Student(firstStudentName);

       assertEquals(firstStudentName, student.getName());

       Student secondStudent = new Student(SecondStudentName);
       assertEquals(SecondStudentName, secondStudent.getName());

       assertEquals(firstStudentName, student.getName());
    }
}
