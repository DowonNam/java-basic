package day4;

public class CastingExam_c {
    public static void main(String[] args) {
        // 변수는 수정하지 않습니다.
        int num1 = 10;
        int num2 = 4;

        System.out.println((double)num1 / num2); // 출력 : 2.5
        System.out.println();


        무기3 a무기 = new 칼3();
        a무기.공격();
        // 출력 : 칼로 공격합니다.

        a무기 = new 활3();
        a무기.공격();
        // 출력 : 활로 공격합니다.
    }
}

class 무기3{
    private String 무기;

    // 왜 public 뒤에 class 명과 같은 명만 사용 가능할까?
    // this 사용해서? 본인 클래스 명을 가르키는 함수라서?
    public 무기3() {
        this.무기 = this.getClass().getSimpleName();
    }
    public void 공격() {
        System.out.println(무기 + "로 공격합니다.");
    }
}

class 활3 extends 무기3{ }

class 칼3 extends 활3{ }