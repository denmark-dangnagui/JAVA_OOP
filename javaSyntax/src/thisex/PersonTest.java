package thisex;

public class PersonTest {

    public static void main(String[] args) {
        Person person = new Person();
        person.showInfo();

        Person person1 = new Person("lee", 20);
        person1.showInfo();
        System.out.println(person1);


        Person self = person1.getSelf();
        System.out.println(self);
    }
}
