package reference;

public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student(100,"lee");
        student.setKoreaSubject("국어",100);
        student.setMathSubject("수학", 40);


        Student studentKim = new Student(100,"Kim");
        studentKim.setKoreaSubject("국어",30);
        studentKim.setMathSubject("수학", 80);

        student.showStudentScore();
        studentKim.showStudentScore();


    }
}
