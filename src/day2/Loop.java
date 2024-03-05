package day2;

public class Loop {
    public static void main(String[] args) {

        // 반복문을 이용해 동일한 명령을 여러번 실행
        // if는 한번 실행 되면 끝이지만 while 은 계속 반복 됨
        // while이 무한대로 실행 됨
//        while(true) {
//            System.out.println("실행");
//        }

        // 원하는 만큼만 반복
        // 디버그 모드로 확인해보기
        int cnt = 0; // 반복 횟수를 세는 용도

        while(cnt < 5) { // 5번 반복 > 5 번이 넘으면 false로 바꿔주면 됨
            System.out.println("실행");
            cnt++; // cnt 변수 값이 1씩 증가하기 때문에
        }

        // for 문
        for(int cnt2 = 0;cnt2 < 5;cnt2++) { // 상단 while 문 요소들을 복붙 (변수명만 변경)
            System.out.println("실행");
        }
        // 예제 1. 1부터 10까지 출력
        for(int i = 1; i <= 10; i++){
            System.out.println(i);
        }

        // 예제 2. 1부터 10까지 짝수 출력
        //1) 증감식을 2로 증가 시킨 방법
        for(int i = 2; i <= 10; i+=2) {
            System.out.println(i);
        }
        //2) 조건문을 사용하여 만드는 방법
        for(int i = 2; i <= 10; i++) {
            if(i % 2 == 0){
                System.out.println(i);
            }
        }

        // 예제 3. 1부터 10까지 4의 배수 출력
        for(int i = 4; i <= 10; i+=4) {
            System.out.println(i);
        }

    }

}
