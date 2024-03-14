package test;

import java.util.Scanner;

public class star1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("높이를 입력하시오 : ");
        int height = Integer.parseInt(scan.nextLine());

        for(int i = 1; i <= height; i++){
            for(int j = 0; j < i; j++){
                System.out.print("*");
            }System.out.println();
        }
    }
}
