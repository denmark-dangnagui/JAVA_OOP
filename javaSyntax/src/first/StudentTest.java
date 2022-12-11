package first;

public class StudentTest {
    public static void main(String[] args) {
        Student studentLee = new Student();
        studentLee.studentName = "이태민";
        studentLee.address = "서울";

        studentLee.showStudentInfo();
    }
}
