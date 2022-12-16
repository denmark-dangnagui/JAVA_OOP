package inheritance;

public class Child extends Parent {

    private String sex;
    public Child(String name, int age, String sex) {
        super();
        this.sex = sex;
    }

    /**
     * 클래스 만들었을 때 컴파일 단걔에서 생성자가 하나도 없으면 만들어준다. 반대는 안만들어준다. 자바 구조
     * 상속을 받았을 때 자기 자신의 생성자가 호출 될 때 부모 생성자를 호출하는 코드가 없으면 컴파일 단계에서 부모 생성자를 호출한다.
     * 자식 클래스가 부모 클래스를 초기화 하려면 super()를 써서 초기화를 한다.
     * 자기 호출할 때는 this()를 사용한다.
     *
     */
}