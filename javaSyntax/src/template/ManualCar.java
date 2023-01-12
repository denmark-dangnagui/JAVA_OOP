package template;

public class ManualCar extends Car {
    @Override
    public void drive() {
        System.out.println("사람이 주행");
        System.out.println("사람이 방향 바꿈");
    }

    @Override
    public void stop() {
        System.out.println("사람이 멈춤");
    }
}
