package day1;

public class Print {
    public static void main(String[] args){
        System.out.println(100);
        System.out.println(200);
        System.out.println("Nam Dowon");
        System.out.println("홍길동");
        //  \n 줄바꿈
        System.out.println("안녕하세요\n반갑습니다.");
       // 문자 합치기
        System.out.println("안녕하세요 반갑습니다.");
        System.out.println("안녕하세요" + "반갑습니다.");
        System.out.println("안녕하세요" + "반갑습니다." + "Hello");
        // 숫자 더하기
        System.out.println(100+200);
        System.out.println(12000+200);
        // 숫자 문자 구분하기

        System.out.println("100"+"200");
        System.out.println(12000+200);
        // 문자랑 숫자를 같이 쓸 경우 문자가 우선 순위 -> 숫자 > 문자로 변함
        System.out.println("12000"+200);
        //출력문을 이용해서 더하기 식 표현
        System.out.println("12000 + 200 = 12200" );
        // 더하기 연산자가 여러번 나오면 왼쪽 부터 순차적으로 연산
        // 즉, 12054가 문자가 되어 옆에 문자열과 붙고, 543도 문자가 되어 왼쪽 문자열에 붙음
        System.out.println("12054 + 543 = " + 12054 + 543);
        System.out.println("12054 + 543 = " + (12054 + 543));
        //숫자 곱하기 (*)
        System.out.println(100*200);

        // 문제1. 구구단 2단을 출력해주세요. 단, 출력문은 한 번만 사용.
        // 풀이1. for 문을 사용
        for(int i=1 ; i<10 ; i++){
        System.out.println("2 x "+(i)+" = "+(i*2));}


        // 정답1. 하단을 반복하면 됨.
        System.out.println("2 x 1 = " + (2*1) +"\n" + "2 x 2 = " + (2*2) );




    }
}
