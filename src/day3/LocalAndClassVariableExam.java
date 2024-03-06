package day3;
// 문제 : 자동차 클래스를 만들고 함수를 이용해 다음과 같이 출력해주세요.
//Car class 참고

public class LocalAndClassVariableExam {
    static int num = 10;
    public static String printValue(String s){
        System.out.println(s);
        return s;
    }

    public static void main(String[] args) {
         //문제 1-1 : 1개의 자동차가 3번 달리게 해주세요.
         //출력 : 자동차가 달립니다.
        Car c1 = new Car();
        System.out.print("문제1-1.\n");
        c1.car(3);
        System.out.print("\n문제1-2.\n");

        //문제 1-2 : 1개의 자동차가 3번 달리게 해주세요.
        //출력 : 자동차가 달립니다.
        Car c2 = new Car();
        Car c3 = new Car();
        c1.car(1);
        c2.car(1);
        c3.car(1);



        // 문제 2-1. 자동차가 자신의 최고속력으로 달리게 해주세요.
        System.out.println("\n문제2-1.");
        c1.speed = 220;
        c1.run();
        // 출력 : 자동차가 최대속력 220km로 달립니다.

        System.out.print("\n문제2-2.\n");
        // 2-2. 두 자동차가 자신의 최고속력으로 달리게 해주세요.
        c1.speed = 220;
        c1.run();
        // 출력 : 자동차가 최대속력 220km로 달립니다.

        c2.speed = 250;
        c2.run();
        // 출력 : 자동차가 최대속력 250km로 달립니다.

        //=============================================================
        System.out.print("\n문제3.\n");
        사람 a사람1 = new 사람();
        a사람1.이름 = "홍길동";
        a사람1.나이 = 22;

        a사람1.자기소개();
        // 출력 : 저는 22살 홍길동 입니다.

        사람 a사람2 = new 사람();
        a사람2.이름 = "홍길순";
        a사람2.나이 = 25;

        a사람2.자기소개();
        // 출력 : 저는 25살 홍길순 입니다.

        a사람1.자기소개();
        // 출력 : 저는 22살 홍길동 입니다.
        //=============================================================
        // 문제 : 아래 코드의 잘 못된 점을 고쳐보세요. 그리고 printValue 함수를 완성시켜주세요.
//
//        class Main {
//             static 에서 사용할 거기 때문에 static을 추가해주었음
//            int num = 10;
//
//            public static void main(String[] args) {
//
//                System.out.println(num); // 출력 : 10
//                 상단 참고
//                printValue("안녕");
//                // 출력 : 안녕
//            }
//
//        }

        System.out.print("\n문제4.\n");
        System.out.println(num); // 출력 : 10

        printValue("안녕");
        // 출력 : 안녕
    }
}
