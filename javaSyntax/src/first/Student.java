package first;

public class Student {

    public int studentId;

    String studentName;

    String address;

//    public Student() {
//    }


    public Student(String studentName) {
        this.studentName = studentName;
    }

    public Student(int id, String name){
        this.studentId = id;
        this.studentName = name;
        this.address = "μ£Όμ μμ";
    }

    public void showStudentInfo(){
        System.out.println("studentName = " + studentName);
        System.out.println("address = " + address);
    }

    public String getStudentName(){
        return studentName;
    }
}
