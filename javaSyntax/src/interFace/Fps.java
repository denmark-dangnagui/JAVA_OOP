package interFace;

public interface Fps {
    //추상 메서드 run 생성
    public void run();

    default void shot(){
        System.out.println("탕!");
    }

    static void exit(){
        System.out.println("탈주!");
    }
}
