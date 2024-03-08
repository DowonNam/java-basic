//package day5;
//코딩 할 때 틀린 부분 확인하기

//public class TvSimulation {
//
//    public static void main(String[] args) {
//        샤오미Tv a샤오미Tv = new 샤오미Tv();
//        삼성Tv a삼성Tv = new 삼성Tv();
//        LGTv aLGTv = new LGTv();
//
//        a샤오미Tv.켜기();
//        // 출력 => 샤오미Tv 켜집니다.
//        a샤오미Tv.끄기();
//        // 출력 => 샤오미Tv 꺼집니다.
//        a샤오미Tv.vr켜기();
//        // 출력 => 샤오미Tv vr켜기!
//        System.out.println();
//
//        a삼성Tv.켜기();
//        // 출력 => 삼성Tv 켜집니다.
//        a삼성Tv.끄기();
//        // 출력 => 삼성Tv 꺼집니다.
//        a삼성Tv.ar켜기();
//        // 출력 => 삼성Tv ar켜기!
//        System.out.println();
//
//        aLGTv.켜기();
//        // 출력 => LGTv 켜집니다.
//        aLGTv.끄기();
//        // 출력 => LGTv 꺼집니다.
//        aLGTv.게임모드전환();
//        // 출력 => LGTv 게임모드전환!
//
//        System.out.println("== 표준Tv 리모콘 들여온 후 ==");
//
//        // 표준Tv 리모콘을 만든다.
//        표준Tv a표준Tv;
//
//        // a표준Tv 변수에 샤오미Tv 객체를 연결한다.
//        a표준Tv = a샤오미Tv;
//        a표준Tv.켜기();
//        // 출력 : 샤오미TV 켜집니다.
//        a표준Tv.끄기();
//        // 출력 : 샤오미TV 꺼집니다.
//
//        // a표준Tv 변수에 삼성Tv 객체를 연결한다.
//        a표준Tv = a삼성Tv;
//        a표준Tv.켜기();
//        // 출력 : 삼성TV 켜집니다.
//        a표준Tv.끄기();
//        // 출력 : 삼성TV 꺼집니다.
//
//        // a표준Tv 변수에 LGTv 객체를 연결한다.
//        a표준Tv = aLGTv;
//        a표준Tv.켜기();
//        // 출력 : LGTV 켜집니다.
//        a표준Tv.끄기();
//        // 출력 : LGTV 꺼집니다.
//
//
//        LGTv aLGTv2 = (LGTv)a표준Tv;
//        aLGTv2.게임모드전환();
//    }
//}
//
//class 표준Tv extends Tv{
//    표준Tv a샤오미Tv;
//    표준Tv a삼성Tv;
//    표준Tv aLGTv;
//    void 켜기() {
//        System.out.println();
//        a샤오미Tv.켜기();
//        a삼성Tv.켜기();
//        aLGTv.켜기();
//    }
//    void 끄기() {
//        System.out.println();
//        a샤오미Tv.끄기();
//        a삼성Tv.끄기();
//        aLGTv.끄기();
//    }
//
//}
//class Tv{
//    void 켜기(){
//    };
//    void 끄기(){
//    };
//    void vr켜기(){
//    };
//}
//class 샤오미Tv extends Tv{
//    public void 켜기(){
//        System.out.println("샤오미 TV가 켜집니다.");
//    };
//    public void 끄기(){
//        System.out.println("샤오미Tv 꺼집니다.");
//    };
//    public void vr켜기(){
//        System.out.println("샤오미Tv vr켜기!");
//    };
//}
//
//class 삼성Tv extends Tv{
//    public void 켜기(){
//        System.out.println("삼성 TV가 켜집니다.");
//    };
//    public void 끄기(){
//        System.out.println("삼성Tv 꺼집니다.");
//    };
//    public void ar켜기(){
//        System.out.println("삼성Tv ar켜기!");
//    };
//}
//class LGTv extends Tv{
//    public void 켜기(){
//        System.out.println("삼성 TV가 켜집니다.");
//    };
//    public void 끄기(){
//        System.out.println("삼성Tv 꺼집니다.");
//    };
//    public void 게임모드전환(){
//        System.out.println("LGTv 게임모드전환!");
//    };
//}