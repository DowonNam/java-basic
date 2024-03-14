package NewTest;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("높이를 입력하시오 : ");
        int h = Integer.parseInt(scan.nextLine());

        for (int i = 1; i <= h; i++) {
            for (int j = 0; j < h - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
