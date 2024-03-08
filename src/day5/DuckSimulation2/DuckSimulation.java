package day5.DuckSimulation2;
//해설
public class DuckSimulation {
    public static void main(String[] args) {
        청둥오리 a청둥오리 = new 청둥오리();
        a청둥오리.날다();
        a청둥오리.헤엄치다();
        // 출력 : 오리가 날개로 날아갑니다.
        // 출력 : 오리가 오리발로 헤엄칩니다.
        System.out.println();
        흰오리 a흰오리 = new 흰오리();
        a흰오리.날다();
        a흰오리.헤엄치다();
        // 출력 : 오리가 날개로 날아갑니다.
        // 출력 : 오리가 오리발로 헤엄칩니다.
        System.out.println();
        고무오리 a고무오리 = new 고무오리();
        a고무오리.날다();
        a고무오리.헤엄치다();
        // 출력 : 저는 날 수 없어요..
        // 출력 : 오리가 둥둥 떠다닙니다.
        System.out.println();
        아수라오리 a아수라오리 = new 아수라오리();
        a아수라오리.날다();
        a아수라오리.헤엄치다();
        // 출력 : 오리가 날개로 날아갑니다.
        // 출력 : 오리가 둥둥 떠다닙니다.
        System.out.println();
    }
}


class 오리 {
    날개아이템 a날개 = new 날개();
    발아이템 a발 = new 발();
    public void 날다() {
        a날개.사용();
    }
    public void 헤엄치다(){
        a발.사용();
        }
    }

class 흰오리 extends 오리 {
    }


class 청둥오리 extends 오리 {
}

class 고무오리 extends 오리 {
    // 상속 받는 순간 여기서 정의를 해도 부모 값을 사용한다
    // 부모가 물려준 값을 사용하지 않고 싶을 때는 생성자로 만들면 됨
    //
  고무오리(){
  a날개 = new 고무날개();
  a발 = new 고무발();
  }
}

class 아수라오리 extends 오리{
 아수라오리(){
     a발 = new 고무발();
     }
}
abstract class 날개아이템 {
    abstract void 사용();{
    }
}
class 날개 extends 날개아이템{
    void 사용(){
        System.out.println("오리가 날개로 날아갑니다.");
    }
}
class 고무날개 extends 날개아이템{
    void 사용(){
        System.out.println("저는 날 수 없어요..");
    }
}
abstract class 발아이템 {
    abstract void 사용();{
    }
}
class 발 extends 발아이템{
    void 사용(){
        System.out.println("오리가 오리발로 헤엄칩니다.");
    }
}

class 고무발 extends 발아이템{
    void 사용(){
        System.out.println("오리가 둥둥 떠다닙니다.");
    }
}