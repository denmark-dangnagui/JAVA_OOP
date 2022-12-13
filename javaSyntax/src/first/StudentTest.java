package first;

public class StudentTest {
    public static void main(String[] args) {
        Student studentLee = new Student("이태민");
        studentLee.studentName = "이태민";
        studentLee.address = "서울";

        studentLee.showStudentInfo();

        Student studentKim = new Student(1,"김유신");
        studentKim.studentName = "김유신";
//        studentKim.address = "경주";

        studentKim.showStudentInfo();
    }
}
