package day2;

public class ObjectAndClass {
    public static void main(String[] args) {
        // 객체 -> 폴더

        // 사람 표현
        // 이름, 나이, 거주지

        // 사람 1명
        // 1) 안 섞었을 때는 보기 쉬움
//        String name = "홍길동";
//        int age = 20;
//        String home = "서울";
//
//        System.out.println(home + "사는" + age + "살" + name + "입니다.");
//
//        String name2 = "이순신";
//        int age2 = 30;
//        String home2 = "부산";
//
//        System.out.println(home2 + "사는" + age2 + "살" + name2 + "입니다.");

        // 2) 섞으면 보기 힘들 때 있음 (또한 정보를 잘못 매치하는 실수도 잦아짐)
//        String name = "홍길동";
//        String name2 = "이순신";
//        int age = 20;
//        int age2 = 30;
//        String home = "서울";
//        String home2 = "부산";
//
//        System.out.println(home2 + "사는" + age2 + "살" + name2 + "입니다.");
//        System.out.println(home + "사는" + age + "살" + name + "입니다.");
//
//        // 3) 이순신 정보 복사
//        String name3 = name2;
//        int age3 = age2;
//        String home3 = home2;
//
//        //이렇게 묶는 게 위에 단어별로 묶는 거 보다 실수가 덜할 것임은 보여 줄 수 있음
//        //하지만 배열은 문자와 숫자 등 같이 혼합하지 못하여 문법적으로 에러남
//        //이 단점을 보완하기 위하여 객체 사용
//        //int[] hong = {"홍길동", 20,  "서울"};
//        //hongCopy = hong;

        //==========================================================================================

        // 홍길동, 이순신이 자기 정보를 기입
        // Person p1 상자에 넣어 정리를 깔끔하게 하고, Person 으로 만들어 놓은 class 를 복사해서 만듦.
        // p1 = 홍길동 / p2 = 이순신

        // 홍길동용 이력서 원본 복사
        Person p1 = new Person();

        // 복사본에다가 홍길동의 정보를 기입
        p1.name = "홍길동";
        p1.age = 20;
        p1.home = "서울";

        // 이순신용 이력서 원본 복사
        Person p2 = new Person();

        //복사본에다가 이순신 정보를 기입
        p2.name = "이순신";
        p2.age = 30;
        p2.home = "부산";

        // 홍길동 자기소개
        System.out.println(p1.home + " 사는 " + p1.age + "살 " + p1.name + "입니다.");
        // 이순신 자기소개
        System.out.println(p2.home + " 사는 " + p2.age + "살 " + p2.name + "입니다.");

        //객체 복사
        // 이순선 정보가 p3에 저장이 됨.
        Person p3 = p2;

        // 복사 출력
        System.out.println(p3.home + " 사는 " + p3.age + "살 " + p3.name + "입니다.");

        // 자동차 1개 복사 및 생성
        Car c1 = new Car();
        c1.model = "소나타";
        c1.year = 2020;
        c1.price = 3000;
        System.out.println(c1.model + c1.year + c1.price);
    }
}

// 객체 = 이력서 (비유)
// ex) 이력서 >  미리 이 칸들을 적으면 그 적은 사람만 쓸 수 있음 (달라질 수 있는 정보들은 그냥 빈 칸으로)
// 그렇기 때문에 이력서가 필요한 사람마다 원본을 복사해서 하나씩 나눠줌 (원본은 사용 x 복사만)
// 이력서 원본 : class / 이력서 복사본 : 객체(=object,instance) / 이력서 항목 : 변수

// 새로운 클래스 생성
// 클래스에는 이름을 무조건 생성해줘야 함 (person 등)
// 사람은 이름과 나이와 거주지가 묶여있는 개념이다를 표현

class Person {
    // 값은 지정하지 않고 속성만 지정함
    String name;
    int age;
    String home;
}


// 자동차에 필요한 정보들을 묶어줌
class Car{
    String model;
    int year;
    int price;
    String color;
    int speed;
}