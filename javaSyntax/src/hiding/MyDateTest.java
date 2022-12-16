package hiding;

public class MyDateTest {
    public static void main(String[] args) {

        MyDate myDate = new MyDate();
        myDate.setDay(10);
        myDate.setMonth(7);
        myDate.setYear(2019);

        myDate.showDate();
        int day = myDate.getDay();
        System.out.println(day);
    }
}
