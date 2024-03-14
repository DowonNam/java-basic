package test;

import java.util.Scanner;

public class gugudan {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("시작 단을 입력하시오 : ");
        int startNum = Integer.parseInt(scan.nextLine());
        System.out.print("마지막 단을 입력하시오 : ");
        int endNum = Integer.parseInt(scan.nextLine());
        System.out.print("마지막 곱을 입력하시오 : ");
        int endGop = Integer.parseInt(scan.nextLine());

        for(int i = startNum; i <= endNum; i++){
            if(i % 2 == 1){
                for(int j = 1; j <= endGop; j++){
                    if(j % 2 == 0){
                        System.out.println(i +" * " + j + " = " + i*j);
                    }
                }
            }
        }
    }
}
