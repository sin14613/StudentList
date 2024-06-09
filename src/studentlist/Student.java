package studentlist;

/**
 *
 * @author paulbonenfant
 */
public class Student {

    private String name;
    private String studentID;
    private String address;

    public Student(String name, String studentID, String address) {
        this.name = name;
        this.studentID = studentID;
        this.address = address;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    } 
}
