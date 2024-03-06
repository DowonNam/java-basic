package day3;
// 리턴은 출력이랑 상관 없음
public class Scope {

    public static void main(String[] args) {
        // 원론적으로는 함수 하나에서 모든 걸 만들 수 있음
        // 코드를 함수로 쪼개서 관리

        // 함수는 같은 클래스 내에 있는 함수끼리만 호출 및 사용 가능
//        double result = plus(1,2); // class 안에 plus 가 없어서 오류
//        System.out.println(result);

        // class 안에 함수가 없다면 소유자에게 요청을 해야 한다
        double result = Calculator.plus(1,2);
        System.out.println(result);

        // Scope
        // 변수의 유효범위

        //지역에서 만들어져서 지역에서만 사용되는 변수 → 지역변수
        // 함수 안에서 만들어진 모든 변수는 지역변수

        int a = 10; // a 변수의 유효범위는 main 함수 내부
        {
            int b = 20; // b 변수의 유효범위는 블록 내부
        }
//        System.out.println(b); // 변수의 유효범위가 아니라 사용 x

        if(true){
            int c = 50; // 지역변수 (if 함수 안에서 만들어진 지역변수 > 괄호 밖에서 c 값 실행하면 오류)
        }


        // 같은 함수 내에서는 동일한 이름으로 변수를 2개 이상 만들 수 없다.


    }
}
