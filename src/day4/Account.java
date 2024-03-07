package day4;

public class Account {
    // 예금을 할 때마다 0으로 만들면 안 됨, 한 번 생성 될 때만 실행 되어야 한다
    // 공통으로 사용하는 변수
    int remain = 0;

    // 문제에서 함수를 deposit으로 정의했으니, deposit으로 정의
    public int deposit(int dep){

        // 금액을 추가시켜서 쌓아 나간다
        remain += dep;

        System.out.println(dep + " 원을 예금했습니다.");
        System.out.println("잔액 " + remain + " 원 남았습니다.\n");
        return dep;
    }

    public int withdraw(int out){
        remain -= out;
        return out;
   }
    public int getRemainder(){
        return remain;
    }

}
