package coop;

public class takeTransTest {
    public static void main(String[] args) {
        Student lee = new Student("lee", 5000);
        Student jjj = new Student("jjj", 5000);

        Bus bus1 = new Bus(100);
        Bus bus2 = new Bus(100);
        Subway subway1 = new Subway(2);
        Subway subway2 = new Subway(2);

        lee.takeBus(bus1);
        jjj.takeSubway(subway1);

        lee.showInfo();
        jjj.showInfo();

        bus1.showInfo();
        bus2.showInfo();
        subway1.showInfo();
        subway2.showInfo();
    }
}
