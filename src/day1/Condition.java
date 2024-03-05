package day1;
import java.util.Scanner;

public class Condition {
    public static void main(String[] args) {
        // 조건문

        int a = 100;

        if(a > 50){
            System.out.println("hi");
        }
//예제 소지금에 따른 야식 메뉴
//2만원 이상 : 치킨
//2만원 미만 : 떡볶이

        int money = 10000;

        if(money >= 20000){
            System.out.println("치킨");}
        else System.out.println("떡볶이");

// if문 (정답인 부분이 맨 앞에 있다고 해도 전부 확인을 함)
//1. 맑음 2. 흐림 3. 비 4. 눈

//        int weather = 2;
//
//        if(weather == 1){
//            System.out.println("날씨가 맑습니다. 나들이 가세요.");
//        }
//
//        if(weather == 2) {
//            System.out.println("날씨가 흐립니다. 집에 계세요.");
//        }
//
//        if(weather == 3) {
//            System.out.println("날씨가 비옵니다. 우산을 챙기세요.");
//        }
//        if(weather == 4) {
//            System.out.println("날씨가 눈옵니다. 눈사람을 만드세요.");
//        }

        //  택일구조(if-else문) > (정답인 부분이 맨 앞에 있다면 그 부분만 확인하고 결과 값 도출)
    Scanner sc = new Scanner(System.in);
    System.out.println("1. 맑음, 2.흐림, 3.비, 4.눈 중 숫자를 선택해 입력하시오.");
        int weather = sc.nextInt();

        if(weather == 1){
            System.out.println("날씨가 맑습니다. 나들이 가세요.");
        }else if(weather == 2){
            System.out.println("날씨가 흐립니다. 집에 계세요.");
        }else if(weather == 3){
            System.out.println("날씨가 비옵니다. 우산을 챙기세요.");
        }else if(weather == 4){
            System.out.println("날씨가 눈옵니다. 눈사람을 만드세요.");
        }else {
            System.out.println("올바르지 않은 값입니다.");
        }
    }
}


