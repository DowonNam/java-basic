package day5.DuckSimulation1;
// 내가 푼 답

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

class 흰오리 {
    날개 흰날개 = new 날개();
    발 흰발 = new 발();
    public void 날다(){
        흰날개.사용();

    }
    public void 헤엄치다(){
        흰발.사용();
    }
}

class 청둥오리 {
    날개 청둥날개 = new 날개();;
    발 청둥발 = new 발();
    public void 날다(){
        청둥날개.사용();
    }
    public void 헤엄치다(){
        청둥발.사용();
    }
}

class 고무오리 {
    날개 고무날개 = new 날개();;
    발 고무발 = new 발();
    public void 날다(){
        고무날개.미사용();

    }
    public void 헤엄치다(){
        고무발.미사용();
    }
}

class 아수라오리 {
    날개 아수라날개 = new 날개();;
    발 아수라발 = new 발();
    public void 날다(){
        아수라날개.사용();

    }
    public void 헤엄치다(){
        아수라발.미사용();
    }
}
class 날개{
    void 사용(){
        System.out.println("오리가 날개로 날아갑니다.");
    }
    void 미사용(){
        System.out.println("저는 날 수 없어요..");
    }
}
class 발{
    void 사용(){
        System.out.println("오리가 오리발로 헤엄칩니다.");
    }
    void 미사용(){
        System.out.println("오리가 둥둥 떠다닙니다.");
    }
}