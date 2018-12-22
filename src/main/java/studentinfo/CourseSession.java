package studentinfo;

public class CourseSession {

    private String department;
    private String number;

    private java.util.ArrayList<Student> students =
            new java.util.ArrayList<Student>();

    public CourseSession(String department, String number) {
        this.department = department;
        this.number = number;


    }

    String getDepartment() {
        return department;
    }

    String getNumber() {
        return number;
    }


    public int getNumberofStudent() {

        return students.size();
    }

    public void enroll(Student student) {
        students.add(student);
    }
    java.util.ArrayList<Student>getAllStudents(){
        return students;
    }
    Student get(int index){
        return students.get(index);
    }


}
