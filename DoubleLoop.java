package day2;

public class DoubleLoop {
    public static void main(String[] args) {

        //중첩 반복문(반복문 안에 반복문)
        // 1) 단순하게 복붙
//        for(int i = 1 ; i <= 5; i++){
//            System.out.println(i);
//        }
//        for(int i = 1 ; i <= 5; i++){
//            System.out.println(i);
//        }
//        for(int i = 1 ; i <= 5; i++){
//            System.out.println(i);
//        }
        // 2) 중첩 반복문 사용
//        for (int i = 0; i < 3; i++) {
//            for (int j = 1; j <= 5; j++) {
//                System.out.println(j);
//            }
//        }
        // 예제 1. 구구단 2 ~ 9단 출력
        // 2단
//        for (int i = 1; i < 10; i++) {
//            System.out.println("2 X " + i + " = " + (2 * i));
//        }

        // 3단
        //1)
//        for (int i = 1; i < 10; i++) {
//            System.out.println("3 X " + i + " = " + (3 * i));
        //2)
//        int dan;
//        dan = 3;
//        for (int i = 1; i < 10; i++) {
//           System.out.println(dan + " X " + i + " = " + (dan * i));
//       }

        // 2단 8번
        int dan;
        dan = 2;
        for(int j = 0 ; j < 8; j++) {
            for (int i = 1; i < 10; i++) {
                System.out.println(dan + " X " + i + " = " + (dan * i));
            }
        }
        // 전체
//        for(int i = 1 ; i < 10; i++) {
//            for (int j = 1; j < 10; j++) {
//                System.out.println(i + " X " + j + " = " + (i * j));
//            }
//        }
    }
}
