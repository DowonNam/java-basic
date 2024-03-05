package day1;

public class VariableExam2 {
    public static void main(String[] args) {

        int a = 5;
        int b = 10;

        System.out.println("a : " + a);
        System.out.println("b : " + b);

        // a = 10;
        // b = 5;

        int c = 0;

        c = a;
        a = b;
        b = c;


        System.out.println("a : " + a);
        // 출력 : a : 10
        System.out.println("b : " + b);
        // 출력 :  b : 5

    }
}
