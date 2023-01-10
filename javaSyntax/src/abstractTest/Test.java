package abstractTest;

public class Test {
    public static void main(String[] args) {
        // Computer computer = new Computer(); 이렇게는 안됨. 애초에 구현바디가 없으니까

        Computer computer = new DeskTop(); // 이렇게는 됨.
        computer.display();

    }
}
