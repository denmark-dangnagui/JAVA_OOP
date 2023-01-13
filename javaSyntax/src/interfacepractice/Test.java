package interfacepractice;

public class Test {

    public static void main(String[] args) {
        CompleteCalculator calc = new CompleteCalculator();
        int n1 = 10;
        int n2 = 2;

        System.out.println(calc.add(n1, n2));
        System.out.println(calc.subtract(n1, n2));
        System.out.println(calc.time(n1, n2));
        System.out.println(calc.divide(n1, n2));

        calc.showInfo();
        calc.description();
    }
}
