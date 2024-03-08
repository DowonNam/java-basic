package day5.Tv2;
// 정답_2
public class TvSimulation {

    public static void main(String[] args) {
        샤오미Tv a샤오미Tv = new 샤오미Tv();
        삼성Tv a삼성Tv = new 삼성Tv();
        LGTv aLGTv = new LGTv();

        a샤오미Tv.이름세팅();
        a샤오미Tv.켜기();
        // 출력 => 샤오미Tv 켜집니다.
        a샤오미Tv.끄기();
        // 출력 => 샤오미Tv 꺼집니다.
        a샤오미Tv.vr켜기();
        // 출력 => 샤오미Tv vr켜기!
        System.out.println();

        a삼성Tv.이름세팅();
        a삼성Tv.켜기();
        // 출력 => 삼성Tv 켜집니다.
        a삼성Tv.끄기();
        // 출력 => 삼성Tv 꺼집니다.
        a삼성Tv.ar켜기();
        // 출력 => 삼성Tv ar켜기!
        System.out.println();

        aLGTv.이름세팅();
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
        // 아래에서 생성한 이름세팅 함수를 선언해줘야 적용 가능
        a표준Tv.이름세팅();
        a표준Tv.켜기();
        // 출력 : 샤오미TV 켜집니다.
        a표준Tv.끄기();
        // 출력 : 샤오미TV 꺼집니다.
        System.out.println();

        // a표준Tv 변수에 삼성Tv 객체를 연결한다.
        a표준Tv = a삼성Tv;
        // 아래에서 생성한 이름세팅 함수를 선언해줘야 적용 가능
        a표준Tv.이름세팅();
        a표준Tv.켜기();
        // 출력 : 삼성TV 켜집니다.
        a표준Tv.끄기();
        // 출력 : 삼성TV 꺼집니다.
        System.out.println();

        // a표준Tv 변수에 LGTv 객체를 연결한다.
        a표준Tv = aLGTv;
        // 아래에서 생성한 이름세팅 함수를 선언해줘야 적용 가능
        a표준Tv.이름세팅();
        a표준Tv.켜기();
        // 출력 : LGTV 켜집니다.
        a표준Tv.끄기();
        // 출력 : LGTV 꺼집니다.
        System.out.println();


        LGTv aLGTv2 = (LGTv)a표준Tv;
        aLGTv2.게임모드전환();
    }
}

class 표준Tv{
    // 상속 하면 변수도 상속 됨
    // 무조건 부모 클래스에서 설정한 변수 값을 사용하게 됨
    String brand;
    void 켜기() {
        System.out.println(brand + " 켜집니다.");
    }
    void 끄기() {
    }
    void 이름세팅(){}
}

class 샤오미Tv extends 표준Tv{

    // 변수 선언(만들기) 표준 Tv에서 물려받은 brand 변수와는 다르다.
    // 샤오미 Tv에게만 있는 변수이다.
    void 이름세팅(){
    brand = "샤오미Tv";}
    // 연산은 함수에서만 가능
    // class에는 변수와 함수 선언만 가능하다. brand = "샤오미Tv"; class 안에서 자체로 사용하는 건 문법적으로 불가능함
    // 즉 함수를 새로 만들어줘서 실행해야 됨 void 이름세팅() 이라는 함수를 생성함
    public void 끄기(){
        System.out.println("샤오미Tv 꺼집니다.");
    };
    public void vr켜기(){
        System.out.println("샤오미Tv vr켜기!");
    };
}

class 삼성Tv extends 표준Tv{
    void 이름세팅(){
        brand = "삼성Tv";}
    public void 끄기(){
        System.out.println("삼성Tv 꺼집니다.");
    };
    public void ar켜기(){
        System.out.println("삼성Tv ar켜기!");
    };
}
class LGTv extends 표준Tv{
    void 이름세팅(){
        brand = "LGTv";}
    public void 끄기(){
        System.out.println("LGTv 꺼집니다.");
    };
    public void 게임모드전환(){
        System.out.println("LGTv 게임모드전환!");
    };
}