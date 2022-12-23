package coop;

public class Subway {
    int lineNumber;
    int passengerConut;
    int money;

    public Subway(int lineNumber) {
        this.lineNumber = lineNumber;
    }

    public void take(int money){
        this.money += money;
        passengerConut++;
    }

    public void showInfo(){
        System.out.println("lineNumber = " + lineNumber);
        System.out.println("passengerConut = " + passengerConut);
        System.out.println("수입 = " + money);
    }

}
