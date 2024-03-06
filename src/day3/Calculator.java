package day3;
//Calculator  라는 커다란 묶음에 계산 4 가지가 있음
public class Calculator {
    // main 하는 거 아님, main은 Scope 에서 만들 예정이므로 여기는 그냥 Calculator만 넣어주면 됨
    public static double plus(int num1,int num2){
        return num1 + num2;
    }

    public static double minus(int num1,int num2){
        return num1 - num2;
    }

    public static double multiple(int num1,int num2){
        return num1 * num2;
    }

    public static double divide(int num1,int num2){
        return num1 / num2;
    }

    public static double square(int num1){
        return num1 * num1;
    }

}
