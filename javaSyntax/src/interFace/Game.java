package interFace;

public class Game {
    public void main(){
        Fps battleGround = new BattleGround();
        battleGround.run();
        battleGround.shot();
//        battleGround.exit(); <--- 에러
        Fps.exit();

        Fps overWatch = new OverWatch();
        overWatch.shot();
        overWatch.run();
//        overWatch.exit() <--- 에러
        Fps.exit(); // 스태틱 함수로서 Fps 메서드로만 사용할 수 있다.
    }
}


