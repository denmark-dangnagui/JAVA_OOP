package staticex;

public class StudentIdTest {
    public static void main(String[] args) {

        Student studentLee = new Student("Lee");

        System.out.println(Student.getSerialNum());

        Student kim = new Student("kim");

        System.out.println("kim = " + Student.getSerialNum());


        System.out.println("studentLee = " + studentLee.getStudentId());
        System.out.println("kim.getStudentId() = " + kim.getStudentId());

    }
}
