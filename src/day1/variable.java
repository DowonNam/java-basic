package day1;

public class variable {
    public static void main(String[] args){
        // 변수
        // 변수 = 데이터 저장 공간(그릇)

        System.out.println(30);
        System.out.println(30);
        System.out.println(30);
        System.out.println(30);
        System.out.println(30);

        // 변수 선언
        //변수타입 변수명;

        //숫자형 변수 선언;
        int number;

        // 변수의 값 저장
        number = 40; // 안됨

        int number2;

        String str;
        str = "차태진";
        // 변수에 저장되어 있는 겂을 사용
        // 변수명을 값처럼 사용

        System.out.println(number);
        System.out.println(number);
        System.out.println(number);
        System.out.println(number);
        System.out.println(number);


        //문제 2. 자기소개 10번 출력, 인사말 나이 ~입니다.
        int age;
        age = 27;

        String name;
        name = "남도원";

        //풀이 2. 자기소개 10번 출력, 인사말 나이 ~입니다.
        //1) 기본
        System.out.println("안녕하세요. " + age + "살 " + name + "입니다.");
        System.out.println("안녕하세요. " + age + "살 " + name + "입니다.");
        System.out.println("안녕하세요. " + age + "살 " + name + "입니다.");
        System.out.println("안녕하세요. " + age + "살 " + name + "입니다.");
        System.out.println("안녕하세요. " + age + "살 " + name + "입니다.");
        System.out.println("안녕하세요. " + age + "살 " + name + "입니다.");
        System.out.println("안녕하세요. " + age + "살 " + name + "입니다.");
        System.out.println("안녕하세요. " + age + "살 " + name + "입니다.");
        System.out.println("안녕하세요. " + age + "살 " + name + "입니다.");
        System.out.println("안녕하세요. " + age + "살 " + name + "입니다.");
        System.out.println("안녕하세요. " + (age+1) + "살 " + name + "입니다.");

        //2) for문 사용
        for(int i=0; i<11; i++){
            System.out.println("안녕하세요. " + age + "살 " + name + "입니다.");

        // 변수 주의사항
            // 변수명은 중복 x
            // 변수명은 숫자로 시작 x
            // 변수는 재활용 가능
    }



    }

}