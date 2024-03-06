package day2;

public class ArrayExam {
    public static void main(String[] args) {
        // arr 배열에 10, 20, 30, 40, 50, 60, 70, 80, 90, 100을 저장하고 출력해주세요.

        int[] num = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        System.out.println(num[0]);
        System.out.println(num[1]);
        System.out.println(num[2]);
        System.out.println(num[3]);
        System.out.println(num[4]);
        System.out.println(num[5]);
        System.out.println(num[7]);
        System.out.println(num[8]);
        System.out.println(num[9]);

        // 배열의 모든 요소를 세번 출력해주세요.
        int[] arr = {1,2,3,4,5};
        for(int j = 0; j < 3; j++) {
            for(int i = 0; i < 5; i++) {
                System.out.print(arr[i]);
            }
            System.out.println();
        }

        // 배열에 5개의 값을 입력하고 거꾸로 출력해주세요.
        int[] arrev = {1,2,3,4,5};
        for(int i = 4; i >= 0; i--) {
            System.out.println(arrev[i]);
        }

        // 배열 안의 숫자들의 합을 구해주세요.
        int[] arr2 = {10, 20, 30, 40, 50};
        int a = 0;
        for(int i = 0; i < arr2.length; i++) // 실행문 제외해야 결과 값이 제대로 나옴
            a += arr2[i];
        System.out.println(a);
    }
}
