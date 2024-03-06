package day3;

public class ParameterExam {
    public static void print(int num1) {
            System.out.println(num1);
    }
    public static void introduce() {
        for(int i=0; i < 10; i++) {
            System.out.println("안녕하세요. 저는 20살 홍길동입니다.!");
        }
    }

    public static void introduce1(int num1){
        for(int i = 0 ; i < num1 ; i++){
            System.out.println("안녕하세요. 20살 홍길동입니다.!");
        }
    }
    public static void greeting1(int num1) {
            if (num1 == 1) {
                System.out.println("안녕하세요");
            } else if (num1 == 2) {
                System.out.println("하이~");
            } else {System.out.println("봉쥬");
            }
    }
    public static void greeting2(int num1, int num2) {
        for (int i = 0; i < num2; i++) {
            if (num1 == 1) {
                System.out.println("안녕하세요");
            } else if (num1 == 2) {
                System.out.println("하이~");
            } else {System.out.println("봉쥬");
            }
        }
    }
        public static void main (String[]args){

            System.out.print("문제 1.\n");
            print(4); // 출력: 4
            print(10); // 출력: 10
            print(100); // 출력: 100
            System.out.print("\n문제 2-1.\n");
            introduce();
            System.out.print("\n문제 2-2.\n");
            introduce1(3);
            System.out.print("\n문제 2-3.\n");
            greeting1(2);
            greeting1(3);
            greeting1(1);
            System.out.println();
            greeting2(1,3);
            greeting2(2,5);
            greeting2(3,7);
        }
}