package day4;

// 구성 = 부서간 협력 관계를 생각하면 된다.

public class Composition {

    public static void main(String[] args) {

        홍길동 a홍길동 = new 홍길동();
        a홍길동.자바();

        홍길순 a홍길순 = new 홍길순();
        a홍길순.파이썬();

        a홍길동.파이썬();
    }
}

class 홍길동 {

    // 홍길순을 홍길동 안에 넣으면 홍길순의 연락처를 가지고 있다고 생각
    홍길순 a홍길순 = new 홍길순();
    이순신주식회사 이순신주식회사 = new 이순신주식회사();

    public void 자바() {
        System.out.println("자바 17버전 프로그래밍");
    }

    // 홍길동에게 파이썬을 하라고 요청했을 때 홍길순에게 연락
    // 상속을 사용하지 않아도 중복을 없앰
    // 구성 = 객체를 또 다른 객체를 만들어서 사용
    public void 파이썬() {
        a홍길순.파이썬();

        이순신주식회사.파이썬();
        이순신주식회사.자바();
    }
}

class 홍길순 {
    public void 파이썬() {
        System.out.println("파이썬 3.12버전 프로그래밍");
    }
}

class 이순신주식회사 {
    public void 파이썬() {
        System.out.println("파이썬 3.12버전 프로그래밍");
    }
    public void 자바() {
        System.out.println("자바 17버전 프로그래밍");
    }
}