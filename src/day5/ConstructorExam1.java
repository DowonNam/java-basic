package day5;

public class ConstructorExam1 {
    // 다음 클래스들을 생성자를 이용해 간단하게 값을 세팅해주세요.
    public static void main(String[] args) {
        System.out.println("문제 1.\n");
        Person p1 = new Person(); // 사람이 태어납니다.
        p1.age = 27;
        p1.name = "홍길동";

        Person p2 = new Person(); // 사람이 태어납니다.
        p2.age = 25;
        p2.name = "홍길순";

        p1.introduce(27,"홍길동"); // 안녕하세요 27살 홍길동입니다.
        p2.introduce(25,"홍길순"); // 안녕하세요 25살 홍길순입니다.
        System.out.println();

        Car c1 = new Car(); // 자동차가 만들어집니다.
        c1.model = "소나타";
        c1.color = "하얀색";
        c1.speed = 100;

        Car c2 = new Car(); // 자동차가 만들어집니다.
        c2.model = "모닝";
        c2.color = "검정색";
        c2.speed = 70;

        c1.drive("소나타","하얀색",100); // 하얀색 소나타이/가 100km로 달립니다.
        c2.drive("모닝","검정색",70); // 검정색 모닝이/가 70km로 달립니다.
        System.out.println();


        Cat cat1 = new Cat(); // 고양이가 태어납니다.
        cat1.name = "아리";
        cat1.age = 4;
        cat1.kind = "러시안블루";

        Cat cat2 = new Cat(); // 고양이가 태어납니다.
        cat2.name = "망고";
        cat2.age = 6;
        cat2.kind = "샴";

        cat1.meow("아리","러시안블루",4); // 4살 러시안블루 고양이 아리가 야옹하고 웁니다.
        cat2.meow("망고","샴",6); // 6살 샴 고양이 망고가 야옹하고 웁니다.
        System.out.println();


        Warrior w1 = new Warrior(); // 전사가 태어납니다.
        w1.name = "이순신";
        w1.attack = 20;
        w1.defense = 10;

        Warrior w2 = new Warrior(); // 전사가 태어납니다.
        w2.name = "강감찬";
        w2.attack = 15;
        w2.defense = 15;

        w1.status("이순신",20,10); // 이름 : 이순신, 공격력 : 20, 방어력 : 10
        w2.status("강감찬",15,15); // 이름 : 강감찬, 공격력 : 15, 방어력 : 15

        w1.attack("이순신",20); // 이순신이 20의 데미지를 입힙민다.
        w2.attack("강감찬", 15); // 강감찬이 15의 데미지를 입힙민다.

        w1.defense("이순신", 10); // 이순신이 10 데미지를 방어합니다.
        w2.defense("강감찬", 15); // 강감찬이 15 데미지를 방어합니다.
        System.out.println();

        System.out.println("문제 2.\n");
        사람1 a사람 = new 사람1();
        a사람.나이 = 10;
        a사람.a왼팔 = new 팔();
        a사람.팔(100);
        // 출력 : 100cm

        new 사람1().걷다();
        System.out.println(new 사람1().a왼팔.길이 + "cm");

        // 출력 : 100cm

    }
}

class Person{
    int age;
    String name;
    public void introduce(int age, String name){
        System.out.println("안녕하세요 " + age + "살 " + name + "입니다.");
        this.age = age;
        this.name = name;
    }
}

class Car {
    String model;
    String color;
    int speed;

    public void drive(String model, String color, int speed) {
        System.out.printf(color +" " +model+ "이/가 " + speed + "로 달립니다.\n");
    this.model = model;
    this.color = color;
    this.speed = speed;
    }
}

class Cat {
    String name;
    String kind;
    int age;

    public void meow(String name, String kind, int age) {
        System.out.printf(age + "살 " + kind +  "고양이 " + name + "가 야옹하고 웁니다.\n");

    }
}

class Warrior {

    // 상태
    String name;
    int attack;
    int defense;

    // 동작
    public void status(String name, int attack,int defense) {
        System.out.printf("이름 : "+ name + ", 공격력 : " + attack + ", 방어력 : " + defense+"\n");
    }
    public void attack(String name, int attack) {
        System.out.printf(name + "이 "+ attack + " 의 데미지를 입힙니다.\n");
    }
    public void defense(String name, int defense) {
        System.out.printf(name + "이 "+ defense +" 데미지를 방어합니다.\n");
    }
}

class 사람1{
    int 나이;
    팔 a왼팔 = new 팔();
    public void 팔(int 길이) {
        System.out.printf(길이 + "cm\n");
    }
    public void 걷다() {
        System.out.println("사람 걷는다.");
    }
}

class 팔 {
    int 길이 = 100;
}
