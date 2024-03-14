package test;

import java.util.Scanner;

/*

   높이 : [3]

     *
    **
   ***

   */
public class star2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("높이를 입력해주세요 : ");
        int height = Integer.parseInt(scan.nextLine());

        for (int i = 1; i <= height; i++) {
            for (int j = height; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

    }
}

