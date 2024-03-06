package day3;
// 메모 : 함수 만들 때 main 먼저 하고, 함수 만드는 게 덜 헷갈림
public class Parameter {
    public static void plus(){
    // 함수 정의 → 변수

        int num1 = 10;
        int num2 = 20;
        System.out.println(num1 + num2);
    }
    // int num1, int num2 는 매개변수라고 부름 (값 x, 변수 o)
    public static void plus1(int num1, int num2){
        System.out.println(num1 + num2);
    }
    public static void multiply(int num1, int num2){
        System.out.println(num1 * num2);
    }


    public static void main(String[] args) {
    // 함수 호출 → 값(인자, argument)

        // 함수에 값을 지정하면 함수만으로 동작을 다르게 힘들다
        plus(); // 10 + 20 결과 출력
        plus(); // 30 + 40 결과 출력

        // 미리 num을 지정하지 않으면 값을 그때 그때 받아 사용 가능
        plus1(40, 70);
        plus1(30, 40);

        multiply(10, 20);
        multiply(5, 5);

        // 인수의 개수와 매개변수 개수는 일치 필수
    }
}
