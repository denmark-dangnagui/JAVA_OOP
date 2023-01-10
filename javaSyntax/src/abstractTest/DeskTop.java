package abstractTest;

public class DeskTop extends Computer {

    @Override
    public void typing() {
        System.out.println("DeskTop typing");
    }

    @Override
    public void display() {
        System.out.println("DeskTop display");
    }
}
