public class CourseSession {

    private String department;
    private String number;
    private int numberOfStudent = 0;

    public CourseSession(String department, String number) {
        this.department = department;
        this.number = number;


    }
    String getDepartment(){
        return department;
    }
    String getNumber(){
        return number;
    }


    public int getNumberofStudent() {

        return numberOfStudent;
    }

    public void enroll(Student student) {
        numberOfStudent = numberOfStudent +1;

    }
}
