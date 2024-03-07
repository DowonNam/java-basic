package day4;
// 형변환
public class Casting {
    public static void main(String[] args) {

        // 자바의 대전제 → 변수에는 오직 변수와 일치하는 타입의 값만 저장 가능

        //자바의 기본 타입
        int a = 10; // 형변환 X
        double b = 10; // 형변환 O → int 가 double로 바뀜 → 자바가 자동을 바꿈

        // int c = 3.14; // 형변환 X 이거는 자동으로 안 바꿔줌
                      // double 이 int로 바꾸려면 소수점 떼야함 > 데이터 손실 초래 위험
        //수동 형변환
        int c = (int) 3.14; // 억지로 형변환, 소수점 없어짐
        System.out.println(c);

        //객체타입 형변환
        // 자바 상속 → 상위 타입을 바탕으로 하위 타입 생성 → 동물을 바탕으로 고양이 생성
        // 상속관계에서 하위 타입은 상위타입으로 형변환 가능, 그 반대는 불가능

        Cat c1 = new Cat();
        c1.meow();

        Animal a1 = new Animal();
        a1.breathe();

        // 고양이가 야옹만 안 한다고 약속을 한다면 동물에 넣어도 됨
        Animal a2 = c1; // 하위타입이 상위타입으로 모습을 바꾸는 건 괜찮아서 자동 형변환이 일어난다 (원래 형변환이 일어나면 안 되지만 예외)
        a2. breathe();
        a2.eat();

        // 두 개의 타입이 달라서 에러가 남 (자동 형변환 x)
        // 자동 형변환 안 되는 이유 > 문제가 일어날 수 있기 때문에
        // animal 에 고양이일지 개가 들어갈지 아무도 모름

        // Cat c2 = new Animal(); 자동 형변환 x, a2에는 Cat과 Dog 가 들어있을 수 있기 때문에 Cat이라고 확신 x
        // Cat c2 = new a2;

        // Cat c2 = (Cat) a2;
        // c2.meow(); = 상위타입을 하위타입으로 바꾸는 건 위험하기 때문에 개발자가 직접 수동형변환을 해야함

    }
}
