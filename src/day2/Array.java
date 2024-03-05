package day2;

public class Array {
    public static void main(String[] args) {

        int a =  10;
        int b =  20;
        int c =  30;
        int d =  40;
        int e =  50;
        int f =  60;
        int g =  70;

        // 모든 변수를 출력
        // 값이 많아지면 변수가 많아지고 변수가 많아지면 힘들다
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);

        // 배열을 사용하면 변수를 하나로 묶을 수 있다

        // 배열 선언
        int[] num = {10, 20, 30, 40, 50, 60, 70};

        // 배열은 순서(index) 에 따라 값을 꺼낼 수 있다.
        // 배열의 시작은 인덱스 0 부터
        System.out.println(num[0]);
        System.out.println(num[1]);
        System.out.println(num[2]);
        System.out.println(num[3]);
        System.out.println(num[4]);
        System.out.println(num[5]);
        System.out.println(num[6]);

        // 배열은 length 라는 길이 정보를 가지고 있다.
        System.out.println(num.length);

        // 0부터 6까지 수열 만들기
        for(int i = 0; i < 7; i++) {
            System.out.println(num[i]);
        }

        // 배열 미리 만들어 놓고 저장하기

        // 100개짜리 배열 만든다.
        // 앞 뒤 자료형 일치 필수
        // 자료형[개수]
        // 비어있는 게 아니라 개수만큼 0 으로 채워지는 것
        int[] arr = new int[10];

        // 3번째 인덱스에 100을 저장
        arr[2] = 100;

         // 문자열 30 개 저장하는 배열 만들기
        // 문자열[개수]
        String[] strArr = new String[3];

        // 배열은 선언된 자료형으로만 사용 가능
        // 배열은 한 가지 자료형만 사용 가능
        arr[0] = 10;
        arr[1] = 0;
        // arr[2] = "홍길동";


    }
}
