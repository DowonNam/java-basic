package day6;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in); // 표준입력
        int num = scan.nextInt(); // 정수 입력
        System.out.printf("당신이 입력한 값은 : %d\n", num);

        // 문자열 입력
        String str = scan.next();
        System.out.printf("당신이 입력한 문자열은 : %s", str);
    }
}
