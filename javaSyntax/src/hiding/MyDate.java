package hiding;

public class MyDate {

    private int day;
    private int month;
    private int year;

    private boolean isValid;

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        if (month < 1 || month > 12) {
            isValid = false;
        } else
            this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void showDate() {
        if (isValid) {
            System.out.println(year + " - " + month + " - " + day);
        } else {
            System.out.println("유효하지 않습니다.");
        }
    }
}
