package day6;

import java.util.Scanner;


public class InputExam {
    public static void main(String[] args) {
        // 문제 1.
        //Scanner를 이용해서 아래와 같이 입출력 하여 사칙연산을 수행해주세요.
        //입출력 예시
        //첫번째 숫자를 입력해주세요: 12
        //두번째 숫자를 입력해주세요: 33
        //12 + 33 = 45
        Scanner scan1 = new Scanner(System.in);
        System.out.println("첫번째 숫자를 입력해주세요 : ");
        System.out.println("두번째 숫자를 입력해주세요 : ");
        int num1 = scan1.nextInt();
        int num2 = scan1.nextInt();
        System.out.println(num1 + num2);

        // 문제 2.
        // 구구단의 단을 입력 받아 해당 단을 출력해주는 프로그램을 만들어주세요
        Scanner scan = new Scanner(System.in);
        System.out.println("몇 단을 출력할지 입력해주세요.");
        int dan = scan.nextInt();
        System.out.println(dan + "단을 출력합니다.");
        for(int i = 1; i < 10; i++){
            System.out.println(dan + " * " + i + " = " + dan*i);
        }

      // 문제 3. 이름과 나이를 입력값으로 받아 자기소개를 해주세요.
      // 조건 : 성과 이름은 띄어쓰기로 구분해주세요.
        // 문제 3-1. 출력값
        // 이름을 입력해주세요 : 홍 길동
        // 나이를 입력해주세요 : 29
        // 출력 : 안녕하세요 29세 홍 길동입니다.
        Scanner scan3 = new Scanner(System.in);

        System.out.println("이름을 입력해주세요:");
        System.out.println("나이를 입력해주세요:");

        String name = scan3.nextLine();
        int age = scan3.nextInt();
        System.out.println("안녕하세요 " + age + "살 " + name + " 입니다.");


        // 문제 3-2. 출력값
        // 나이를 입력해주세요 : 29
        // 이름을 입력해주세요 : 홍 길동
        // 출력 : 안녕하세요 29세 홍 길동입니다.

        // 왜 이름 입력 값이 안 받아질까? 엔터도 문자라서 숫자 다음 문자로 인식
        // ex ) nextLine을 쓰면 '29\n홍길동\n'으로 들어감 > nextInt 하면 29만 꺼내감 > nextLine 하면 홍길동을 입력해주기도 전에 \n을 꺼내가고 끝내 버림

        // 해결 방법 1) \n 을 빼는 방법 2) 29을 뺄 때 \n 도 같이 빼감
        Scanner scan4 = new Scanner(System.in);

        // 해결 방법 1) 버퍼를 직접 비워준다
        System.out.println("나이를 입력해주세요:");
        int age2 = scan4.nextInt();
        scan4.nextLine(); // 버퍼 비우기
        System.out.println("이름을 입력해주세요:");
        String name2 = scan4.nextLine();
        System.out.println("안녕하세요 " + age2 + "살 " + name2 + " 입니다.");



        // 해결 방법 2) 입력을 nextLine으로 통일한다
        System.out.println("나이를 입력해주세요:");
        // 문자열 → 숫자로 바꿔준다
//        String age3 = scan4.nextLine();
//        int convertedInt = Integer.parseInt(age3);
        // 상단 두 줄이 하단 한 줄과 같다.
        int age3 = Integer.parseInt(scan4.nextLine());

        System.out.println("나이를 입력해주세요:");
        String name3 = scan4.nextLine();
        System.out.println("안녕하세요 " + age3 + "살 " + name3 + " 입니다.");

    }
}