package template;

public class AICar extends Car {
    @Override
    public void drive() {
        System.out.println("자율 주행");
        System.out.println("자동차가 스스로 방향 바꿈");
    }

    @Override
    public void stop() {
        System.out.println("알아서 멈춤");
    }
}
