package day3;

public class LocalAndClassVariable {
    public static int test() {
        int num = 10;

        return num;
    }

    public static void main(String[] args) {
        int num = test();
        System.out.println(num);

        // person 클래스 참고
        // static이 있는 경우 > 바로 사용 가능
        Person.introduce(); // 출력값 : 안녕하세요 저는 20살입니다.
        Person.addAge(); // 나이 1 증가
        Person.introduce(); // 출력값 : 안녕하세요 저는 21살입니다. 하고 싶은데, 안녕하세요 저는 20살입니다. 로 출력 됨.

        //static이 없는 경우 > 객체로 만들어서 사용해야 함

        //Person p1 = new Person();

        //상태
        //p1.age = 20;
        //p1.name = "홍길동";
        //p1.home = "서울";

        //동작
        //p1.introduce(); //자기소개
        //p1.addAge(); //나이 증가
        //p1.introduce();


    }
}
