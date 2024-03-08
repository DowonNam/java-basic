package day5;

public class Overloading {
    public static void main(String[] args) {
        계산기 a계산기 = new 계산기();
        int rst = a계산기.더하기(1,2);
        System.out.println(rst);

        double rst1 = a계산기.더하기(1.3,2);
        System.out.println(rst1);
    }
}

class 계산기 {
    int 더하기(int num1,int num2){
        return num1 + num2;
    }

    // 함수(메서드)의 이름은 같아도 매개변수의 개수가 다르거나, 타입이 다르면 다른 함수로 인식한다 → 오버로딩
    double 더하기(double num1,double num2) {
        return num1 + num2;
    }
}