package day4;

public class InheritanceExam_c {
    public static void main(String[] args) {

        청둥오리c a청둥오리 = new 청둥오리c();
        a청둥오리.날다();
        a청둥오리.헤엄치다();
        // 출력 : 오리가 날개로 날아갑니다.
        System.out.println();

        흰오리c a흰오리 = new 흰오리c();
        a흰오리.날다();
        a흰오리.헤엄치다();
        System.out.println();
        // 출력 : 오리가 날개로 날아갑니다.

        고무오리c a고무오리 = new 고무오리c();
        a고무오리.날다();
        a고무오리.헤엄치다();
        System.out.println();
        //출력 : 오리가 날개로 날아갑니다.

        고무2오리c a고무2오리 = new 고무2오리c();
        a고무2오리.날다();
        a고무2오리.헤엄치다();
        System.out.println();
        // 출력 : 저는 날 수 없어요. ㅜㅠ

        아수라오리c a아수라오리 = new 아수라오리c();
        a아수라오리.날다();
        a아수라오리.헤엄치다();
        System.out.println();
    }
}


class 오리c {
    // private 켑슐화를 위하여 사용
    private String classname;

    // this 는 현재 객체를 나타내는 참조
    // 1. 인스턴스 변수와 메서드 매개변수의 이름이 충돌할 때
    // 2. 인스턴스 메서드에서 다른 인스턴스 메서드 호출
    // 3. 인스턴스 변수를 반환할 때

    public 오리c() {
        this.classname = this.getClass().getSimpleName();
     }

    public void 날다() {
        System.out.println(this.classname +" : "+ "오리가 날개로 날아갑니다.");
    }
    public void 헤엄치다() {
        System.out.println(this.classname +" : "+ "오리가 오리발로 헤엄칩니다.");
    }

}
class 청둥오리c extends 오리c{
    }
class 흰오리c extends 오리c{
    }
class 고무오리c extends 오리c {
    private String classname;
    public 고무오리c() {
        this.classname = this.getClass().getSimpleName();
    }
    public void 날다() {
        System.out.println(classname +" : "+ "저는 날 수 없어요. ㅜㅠ");
    }
    public void 헤엄치다() {
        System.out.println(classname +" : "+ "오리가 둥둥 떠다닙니다.");
    }
}

class 고무2오리c extends 고무오리c {
}

class 아수라오리c extends 고무오리c {
    private String classname;
    public 아수라오리c() {
        this.classname = this.getClass().getSimpleName();
    }
    public void 날다(){
        System.out.println(this.classname +" : "+ "오리가 날개로 날아갑니다.");
    }
}