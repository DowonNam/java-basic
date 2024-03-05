package day2;

public class IncDecOperator {
    public static void main(String[] args) {
        // 증감연산자
        int num = 10;
        System.out.println(num+5);
        System.out.println(num);

        //변수의 값을 5 증가 시키고 싶을 때
        // num = 15; 증가 x
        num = num + 5;
        System.out.println(num);

        num += 5; //num = num + 5; 과 동일한 표현
        System.out.println(num);

        //변수의 값을 3 감소 시키고 싶을 때
        num = num - 3;
        System.out.println(num);

        num -= 3;
        System.out.println(num);

        // 증감연산자
        // 1) 증가
        num +=1 ; // 증가값이 1인 경우에 한해서는 num++ 라고 쓸 수 있다.
        num++; // 위와 같은 표현
        System.out.println(num);

        // 2) 감소
        num -=1 ; // 감소값이 1인 경우에 한해서는 num-- 라고 쓸 수 있다.
        num--; // 위와 같은 표현
        System.out.println(num);
    }
}
