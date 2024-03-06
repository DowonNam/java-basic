package day3;

public class Method {
    // 함수는 클래스 밖에 만들 수 없음.
    //함수(메서드) 만들기(정의)
    // public static void  함수이름() { 저장코드 }

    // 수정하고 싶을 때 일괄적으로 수정 가능
    public static void test() {
        System.out.println("실행1");
        System.out.println("실행2");
        System.out.println("실행3");
        System.out.println("실행4");
    }
    // 자바는 함수가 하나 더 생기더라도 main 에서 시작하고 끝남
    // Method 함수를 만들어도 main 안에서 사용을 안 하면 작동하지 않음
    //main 메서드
    public static void main(String[] args) {
    Person p1 = new Person();
        p1.name = "홍길동";
        p1.age = 20;
        p1.home = "서울";


    Person p2 = new Person();
        p2.name = "이순신";
        p2.age = 30;
        p2.home = "부산";

        // 자기소개 문구를 바꾸고 싶다. 안녕하세요 > 반갑습니다 (일일이 바꿔주기에는 너무 번거롭고 힘듦)
        System.out.println("반갑습니다 저는" + p1.home + "에 사는 " + p1.age + "살 " + p1.name + "입니다.");
        System.out.println("반갑습니다 저는" + p2.home + "에 사는 " + p2.age + "살 " + p2.name + "입니다.");

        // 메서드(함수)를 이용해서 코드를 재활용

        // 실행 3까지 넣고 코드 3개를 복사했는데, 실행 4가 빠진 걸 뒤늦게 알았음
        // 실행 4를 코드마다 일일이 찾아서 넣어주기 어렵고 헷갈림 > 실수 잦아질 확률 높음
        System.out.println("실행1");
        System.out.println("실행2");
        System.out.println("실행3");

        System.out.println("실행1");
        System.out.println("실행2");
        System.out.println("실행3");

        System.out.println("실행1");
        System.out.println("실행2");
        System.out.println("실행3");

        // 함수도 만들어서 사용
        // 함수는 함수 안에 만들 수 없음.

        // 위에서 만든 함수 사용 방법
        test(); // test 함수 사용(호출), 함수에 저장된 값이 쭉 출력

        test();

        test(); // 세 번 호출하면 세 번 출력
        // 함수 출력 장점
        // 상단과 같은 결과 값을 가져왔지만 코드의 양이 줄어 들었음
        // 실질적인 코드는 하나이기 때문에 수정이 용이
    }
}
// 같은 폴더(패키지) 안에 동일한 이름의 클래스를 만들 수 없다.
// 같은 폴더(패키지) 안의 클래스들은 서로 사용 가능하다.
