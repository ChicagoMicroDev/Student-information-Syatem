public class CourseSession {

    private String department;
    private String number;

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
        return 0;
    }
}
