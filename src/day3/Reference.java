package day3;
// 메모리 두 가지 스택, 힙
// 대부분은 스택에 저장
// new 라고 선언 된 건 힙에 만들어진다고 생각
// 객체는 바로 저장이 안 되기 때문에 참조 값이 나오고 그것을 변수에 담아서 사용

public class Reference {
    public static void main(String[] args) {
        Person p1 = new Person(); //변수 = 객체의 참조 값을 저장, 객체가 힙 메모리에 생성
        Person p2 = new Person();

        System.out.println(p1); // 출력하면 day3.Person@2f4d3709 이렇게 결과 값 나옴 > 객체의 주민등록번호 : 2f4d3709
        System.out.println(p2); // 출력하면 day3.Person@4e50df2e 이렇게 결과 값 나옴 > 객체의 주민등록번호 : 4e50df2e > 상단과 서로 다른 객체
        // 참조는 실체가 아니라 실체는 따로 있고 그냥 가르키는 값

        // 사람 정보 입력
        p1.name = "홍길동";
        p1.age = 20;
        p1.home = "서울";

        System.out.println(p1.name);
        // 사람 복사
        Person p3 = p1; // 홍길동 정보를 p3 에 복사
        System.out.println(p3.name);

        // 홍길동은 2 명이 된걸까?
        // 아니다 홍길동은 1 명이다. Person p3 은 변수 > 변수는 stack 에 만들어진다
        // 왜? 엄밀히 말하면 p1 은 참조값이지 그 자체는 아님, p3에는 참조값이 복사가 된 것이지 그 자체가 두 개가 된 것이 아님

        p3. name = "이순신";
        System.out.println(p3.name);
        System.out.println(p1.name); // p1 은 이름은 바꾼 적이 없지만 실행하면 변경 됨 > 사실상 둘이 같은 걸 가지고 있으니 변경 되는 것임

        // 예제 1. 손흥민을 2 명 만들어주세요. (단, 코드의 중복은 없어야 합니다.)
        // 손흥민, 31, 런던

        Person p4 = new Person();

        p4.name = "손흥민";
        p4.age = 31;
        p4.home = "런던";

        Person p5 = new Person();
        p5.name = p4.name;
        p5.age = p4.age;
        p5.home = p4.home;

        p4. name = "손흥만";

        System.out.println(p4.name);
        System.out.println(p5.name); // 결과값이 바뀌지 않음 참조가 아닌 그 자체이기 때문

        // 객체의 복사
        // 참조값의 복사 → 얕은 복사
        // 객체값의 복사 → 깊은 복사

    }
}

