package day6;

import java.util.Scanner;

public class StringInput {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //문자열 입력1 → 단어 입력
        //문자열 입력2 → 문장 입력
        String str1 = scan.next();
        System.out.println(str1);

        // 문장 입력하고 싶으면 nextLine();

        String str2 = scan.nextLine();
        System.out.println(str2);
    }
}
