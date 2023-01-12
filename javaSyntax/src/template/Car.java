package template;

public abstract class Car {

    public abstract void drive();
    public abstract void stop();

    public void startCar() {
        System.out.println("시동을 켭니다.");
    }

    public void turnOff() {
        System.out.println("시동을 끕니다.");
    }

    final public void run() { // final을 선언하면서 하위 클래스에서 재정의 할 수 없게 함.
        startCar();
        drive();
        stop();
        turnOff();
    }
}
