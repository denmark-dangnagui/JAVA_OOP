package staticex;

public class Student {

    private static int serialNum = 1000;
    public int studentId;

    String studentName;

    String address;

//    public Student() {
//    }


    public Student(String studentName) {
        this.studentName = studentName;
        serialNum++;
        studentId = serialNum;
    }

    public Student(int id, String name){
        this.studentId = id;
        this.studentName = name;
        this.address = "주소 없음";
        serialNum++;
        studentId = serialNum;
    }

    public void showStudentInfo(){
        System.out.println("studentName = " + studentName);
        System.out.println("address = " + address);
    }

    public String getStudentName(){
        return studentName;
    }

    public int getStudentId() {
        return studentId;
    }

    public static int getSerialNum() {
        int i = 0;
        return serialNum;
    }

    public static void setSerialNum(int serialNum) {
        Student.serialNum = serialNum;
    }
}
