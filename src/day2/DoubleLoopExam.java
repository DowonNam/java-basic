package day2;

public class DoubleLoopExam {
    public static void main(String[] args) {
        // 문제 : 구구단 작성(완료)
        // 조건 : 짝수번째만 곱하기

//         for(int j = 2; j < 10; j+=2) {
//             for (int i = 2; i <= 9; i+=2) {
//                 System.out.println((j) + " X " + (i) + " = " + (j * i));
//             }
//         }
        // 문제 : 구구단은 n단 ~ m단 중 홀수단만 1 ~
        // limit 까지 곱 중 짝수곱만 출력해주세요
        // 조건 : n은 4, m은 20, limit는 10

//        int n = 4; // 시작
//        int m = 20; // 끝
//        int limit = 10; // 곱의 개수
//
//        for(int j = 5 ; j <= 20; j+=2) {
//            for (int i = 2; i <= 10; i+=2) {
//                System.out.println((j) + " X " + (i) + " = " + (j * i));
//            }
//        }
        // 출력
        //  높이 : [3]
        //
        //    *
        //    **
        //    ***
        //

        //    높이 : [5]
        //
        //    *
        //    **
        //    ***
        //    ****
        //    *****

        //    높이 : [7]
        //
        //    *
        //    **
        //    ***
        //    ****
        //    *****
        //    ******
        //    *******

        int heighjt = 3;

//        for (int i = 0; i <= heighjt; i++) {
//            for (int j = 0; j < i; j++) {
//                System.out.println("*");
//                }
//            System.out.println();
//        }

        for (int i = 0; i <= heighjt; i++) {
            for (int j = heighjt; j > 0; j--) {
                System.out.println(j);
            }
            System.out.println();
        }

    }
}
