package day3;

public class ReturnExam {
    public static void func1(){
    }
    // 괄호 안에 꼭 자료형 넣어줘야 됨
    public static int func2(int num1){
        return num1;
    }
    public static int func3(int num1){
        return num1*num1;
    }
    public static int func4(int num1,int num2){
        return num1+num2;
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        System.out.println(a);
        // 출력 : 10
        System.out.println(b);
        // 출력 : 10

        int c = func2(22);
        System.out.println(c);
        // 출력 : 22

        int d = func2(55);
        System.out.println(d);
        // 출력 : 55

        int e = func3(10);
        System.out.println(e);
        // 출력 : 100
        int f = func3(5);
        System.out.println(f);
        // 출력 : 25

        int g = func4(10, 30);
        System.out.println(g);
        // 출력 : 40

        int h = func4(20, 50);
        System.out.println(h);
        // 출력 : 70
    }
}
