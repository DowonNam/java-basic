package day5.Tv1;
// 정답
public class TvSimulation {

    public static void main(String[] args) {
        샤오미Tv a샤오미Tv = new 샤오미Tv();
        삼성Tv a삼성Tv = new 삼성Tv();
        LGTv aLGTv = new LGTv();

        a샤오미Tv.켜기();
        // 출력 => 샤오미Tv 켜집니다.
        a샤오미Tv.끄기();
        // 출력 => 샤오미Tv 꺼집니다.
        a샤오미Tv.vr켜기();
        // 출력 => 샤오미Tv vr켜기!
        System.out.println();

        a삼성Tv.켜기();
        // 출력 => 삼성Tv 켜집니다.
        a삼성Tv.끄기();
        // 출력 => 삼성Tv 꺼집니다.
        a삼성Tv.ar켜기();
        // 출력 => 삼성Tv ar켜기!
        System.out.println();


        aLGTv.켜기();
        // 출력 => LGTv 켜집니다.
        aLGTv.끄기();
        // 출력 => LGTv 꺼집니다.
        aLGTv.게임모드전환();
        // 출력 => LGTv 게임모드전환!
        System.out.println();

        System.out.println("== 표준Tv 리모콘 들여온 후 ==\n");

        // 표준Tv 리모콘을 만든다.
        // 켜고 끄는 기능은 모두 다 가지고 있으니 공통으로 가지고 있는 클래스를 만들면 편함
        표준Tv a표준Tv;

        // a표준Tv 변수에 샤오미Tv 객체를 연결한다.
        // 객체랑 연결하는 건 불가능하다 타입이 다름 (형변환 시도 > 형변환 안 됨, 두 클래스는 서로 관계가 없기 때문)
        // 이럴 때는 상속 관계로 만들어 주면 된다, 상속 관계가 되면 형변환이 가능함
        a표준Tv = a샤오미Tv;
        a표준Tv.켜기();
        // 출력 : 샤오미TV 켜집니다.
        a표준Tv.끄기();
        // 출력 : 샤오미TV 꺼집니다.
        System.out.println();

        // a표준Tv 변수에 삼성Tv 객체를 연결한다.
        a표준Tv = a삼성Tv;
        a표준Tv.켜기();
        // 출력 : 삼성TV 켜집니다.
        a표준Tv.끄기();
        // 출력 : 삼성TV 꺼집니다.
        System.out.println();

        // a표준Tv 변수에 LGTv 객체를 연결한다.
        a표준Tv = aLGTv;
        a표준Tv.켜기();
        // 출력 : LGTV 켜집니다.
        a표준Tv.끄기();
        // 출력 : LGTV 꺼집니다.
        System.out.println();


        LGTv aLGTv2 = (LGTv)a표준Tv;
        aLGTv2.게임모드전환();
    }
}

abstract class 표준Tv{ // 추상클래스 : 객체화하여 사용할 수 없다. 반드시 상속 받아 오버라이딩 해서 사용
    // 세상에 존재하는 티비를 추상적으로 표현
    abstract void 켜기();  // 추상메서드
    // 추상적이므로 정의 할 수 없음, 바디 부분{}을 없애줌
    // 대신 자식 클래스에서 켜기라는 기능을 오버라이딩 하면 됨
    // 만약 오버라이딩 안 하면? 내용이 없음, 기능이 정의 되지 않았기 때문에 활용 x
    abstract void 끄기();
}

class 샤오미Tv extends 표준Tv{ // 표준 Tv에게 물려받은 켜기 메서드가 내용이 없는 추상메서드이기 때문에 오버라이딩 하지 않으면 실행 할 수 없다
    public void 켜기(){
        System.out.println("샤오미Tv 켜집니다.");
    };
    public void 끄기(){
        System.out.println("샤오미Tv 꺼집니다.");
    };
    public void vr켜기(){
        System.out.println("샤오미Tv vr켜기!");
    };
}

class 삼성Tv extends 표준Tv{
    public void 켜기(){
        System.out.println("삼성Tv 켜집니다.");
    };
    public void 끄기(){
        System.out.println("삼성Tv 꺼집니다.");
    };
    public void ar켜기(){
        System.out.println("삼성Tv ar켜기!");
    };
}
class LGTv extends 표준Tv{
    public void 켜기(){
        System.out.println("LGTv 켜집니다.");
    };
    public void 끄기(){
        System.out.println("LGTv 꺼집니다.");
    };
    public void 게임모드전환(){
        System.out.println("LGTv 게임모드전환!");
    };
}