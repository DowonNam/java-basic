package day4;

public class AccountExam {
    public static void main(String[] args) {

        // Account a2 = new Account(); 로 다른 계좌 생성 가능
        Account a1 = new Account();

        //a1이 가지고 있는 함수인데, 이름은 deposit 이다
        a1.deposit(1000); // 1000원을 예금했습니다.
        a1.deposit(2000); // 2000원을 예금했습니다.
        a1.deposit(3000); // 3000원을 예금했습니다.

        int money = a1.withdraw(400);
        System.out.println(money + " 원을 출금했습니다."); // 400

        int remainder = a1.getRemainder();
        System.out.println("잔액 " + remainder +" 원 남았습니다.\n"); // 5600

        money = a1.withdraw(1400);
        System.out.println(money + " 원을 출금했습니다."); // 1400

        remainder = a1.getRemainder();
        System.out.println("잔액 " + remainder +" 원 남았습니다.\n"); // 4200

    }
}
