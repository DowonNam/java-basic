package day5;
// 문제 : 사람의 걷다 메서드에 this. 를 적절한 곳에 추가해주세요.

public class ConstructorExam2 {
    public static void main(String[] args) {
        int k = 10; // main 함수 안에서만 산다.

        사람4 a사람 = new 사람4();
        a사람.나이 = 20;

        int dan = 8;  // main 함수 안에서만 산다.
        for ( int i = 1; i < 9; i++ ) {
            // i => for block 안에서만 산다.
            System.out.println(dan + " * " + i + " = " + dan * i);
        }

        System.out.println(a사람.나이);
        a사람.걷다();

        // 문제 : 아래와 같이 출력 되도록 해주세요.

        int 엄지손가락_길이 = new 사람4().a왼팔.a손.a엄지손가락.길이;

        System.out.println(엄지손가락_길이 + "cm");
                // 출력 : 5cm

    }
}
class 사람4 {
    // 인스턴스 변수
    int 나이;

    왼팔4 a왼팔 = new 왼팔4();

    void 걷다() {
        int 나이 = 22;

        System.out.println(this.나이 + "살인 홍길동씨가 걷습니다.");
    }
}

class 왼팔4 {
    손4 a손 = new 손4();
}

class 손4 {
    엄지손가락4 a엄지손가락 = new 엄지손가락4();
}

class 엄지손가락4 {
    int 길이 = 5;
}