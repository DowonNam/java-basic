package day3;
// CLASS 만들 때 따로 CLASS 파일을 생성해서 만들어줘야 나중에 관리하고 수정하기 용이하다
// 함수 안에 있음 : 지역변수, 밖에 있음 : 클래스 변수
//static = 고정시키다
//static 이 붙은 것은 static이 붙지 않은 것을 사용할 수 없다.

// 변수 → 사물, 상태값
class Person{
    static String name; // 함수가 공유하는 변수 → 인스턴스 변수
    static int age; // 함수가 공통적으로 같이 사용할(공유하는) 변수 : static 넣어줌 → class 변수(위치도 class 안에 있음)
    String home;
    // 인류 평균 나이 → 모든 사람이 공유하는 변수 → 클래스 변수
    static int averageAge = 30; // 인류 평균 나이 30 가정 // static 은 모든 함수가 공유하기 때문에 다른 값으로 변경하면 전체에서 변경 됨


    // introduce 앞에 static 이 붙어있는데, 위에 age에 static이 안 붙어 있으면 오류가 남.
    // static이 붙어있으면 클래스에 다이렉트 사용 가능, 안 붙어 있으면 클래스가 아닌 객체에 붙어있는 거기 때문에 객체를 만들어서 사용해줘야 한다.
    // > static을 붙여서 바로 사용하거나, public static void에서 static을 같이 지워주면 static이 없는 것도 사용 가능
    // public static void main 에 static이 붙은 이유는 main 은 무조건 첫 시작이기 때문에 즉, main 에서 바로 사용하려면 static 있어야 함
    // 객체의 변수와 함수에는 특별한 이유가 없으면 static을 붙이지 않는다

    // 함수 → 동작(나이를 먹는다, 걷는다, 밥을 먹는다)
    public static void introduce() {
        // int age = 20; // 지역변수, 밖에 클래스 변수로 존재(안에 없으면 밖에서 찾음)
        System.out.println("안녕하세요 저는 " + age + "살" + name + "입니다.");
    }
    public static void addAge(){
        // int age = 20; // 지역변수, 밖에 클래스 변수로 존재(안에 없으면 밖에서 찾음)
        age++; // ++ 1 증가
    }

}
