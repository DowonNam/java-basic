package day5;

public class ConstructorChain {
    public static void main(String[] args) {
        //동물 a동물 = new 동물();
        고양이 a고양이 = new 고양이(); // 부모클래스 결과값 호출 + 본인 값 호출 두 번 호출함
    }
}

class 동물 {
    // 자바에서는 같은 이름의 함수를 만들 수 있음, 대신 형태는 달라야 한다.
//    public 동물() {}
//    public 동물(int 나이){
//        }

    public 동물(){
        System.out.println("동물이 생성되었습니다.");
    }
}

class 고양이 extends 동물{
    public 고양이() {
        // super = 부모, this = 자기자신
        super(); // 부모의 생성자 호출
        System.out.println("고양이가 생성되었습니다.");
    }
}

