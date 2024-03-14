import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class week1test {
    public static void main(String[] args) {
//        for(int i = 1; i <= 100; i++){
//            System.out.println(i);
//        }
//        for (int i = 1; i <= 100; i ++) {
//            if ( i %2 == 0){
//                System.out.println(i+": even");
//            } else{
//                System.out.println(i+": odd");
//            }
//        }
//        int time = 74;
//        int score = 0;
//        for(int i = time; i <90; i+=5){
//            score = score +1;
//        }
//        System.out.println(score);
//        int a = 5;
//        int b = 12;
//        if(a < b){
//            for(int i = a; i <= b; i++){
//                System.out.println(i);
//            }
//        } else {
//            for(int j = b; j <= a; j++){
//                System.out.println(j);
//            }
//        }
//        for(int i = 2; i < 10; i++){
//            for (int j = 2; j < 10; j+=2){
//                System.out.println(i+" * "+j+" = "+i*j);
//            }
//        }
//        Scanner scan = new Scanner(System.in);
//        System.out.print("시작 단을 입력해주세요 : ");
//        int start_num = Integer.parseInt(scan.nextLine());
//        System.out.print("끝 단을 입력해주세요 : ");
//        int end_num = Integer.parseInt(scan.nextLine());
//        System.out.print("곱의 한계를 입력해주세요 : ");
//        int gop_num = Integer.parseInt(scan.nextLine());
//
//        for (int i = start_num; i <= end_num; i++){
//            if(i % 2 != 0){
//                for(int j = 2; j <= gop_num; j+=2){
//                    System.out.println(i + " * " + j + " = " + i*j);
//                }
//            }
//        }

//        int height = 7;
//        for(int i = 1; i <= height; i++){
//            for(int j = 0; j < i; j++){
//                System.out.print("*");
//            } System.out.print("\n");
//        }

//        int height = 7;
//        for (int i = 1; i <= height; i++) {
//            for (int j = 0; j < height - i; j++) {
//                System.out.print(" ");
//            }
//            for (int k = 0; k < i; k++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        // 9 짝수 2 4 / 6 8
        int y = 9;
        int star_len = 0;

        for (int i = 0; i < y; i++) {
            int increase = 0;
            int decrease = 0;

            if (y % 2 == 0) {
                if (y / 2 > i) {
                    increase = 1;
                } else {
                    decrease = 1;
                }
            } else {
                if (y / 2 > i) {
                    increase = 1;
                } else {
                    decrease = 1;
                }
            }
            if(increase == 1){
                star_len ++;
            }
            if(decrease == 1){
                star_len--;
            }
            for(int j = 0; j < star_len; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
