package day4;
// 상속
public class Inheritance {

    public static void main(String[] args) {
        // 프로그래밍 → 중복과의 싸움
        // 데이터의 중복 → 변수로 해결
        // 코드의 중복 → 함수로 해결
        // 함수의 중복 → 클래스,객체로 해결
        // 객체의 중복 → 상속


        // 두 동물은 다른 객체, 서로 행동 및 특성이 다름
        // 하지만 같은 동물이라는 범주이기 때문에 같이 작동하는 기능이 있음
        // ex) 숨을 쉰다, 밥을 먹는다

        Dog d1 = new Dog();
        d1.bark();
        d1.breathe();

        Cat c1 = new Cat();
        c1. meow();
        c1.breathe();
    }
}

// 부모 클래스 만들기
class Animal{
    public void eat(){
    System.out.println("먹는다");
    }

    // 상속이 없을 때는 숨쉬는 형태를 변경하려면 각각 바꿔야 하는데,
    // 상속을 하면 한 번에 변경 가능하다
    public void breathe(){
    System.out.println("숨을 쉰다 !!");
    }
}

// 자식 클래스
// extends 상속 > Dog는 Animal이다 라고 생각하면 됨
class Dog extends Animal{
    public void bark(){
        System.out.println("멍멍");
    }
}

// extends 상속 > Cat은 Animal이다 라고 생각하면 됨
class Cat  extends Animal{
    public void meow(){
        System.out.println("야옹");
    }
}