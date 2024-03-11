package day6;

public class AccessModifyExam {
    public static void main(String[] args) {
        // 문제1 : 값이 출력되게 해주세요.
        // 풀이1 : 하단 Person 클래스에서 private 만 삭제해주면 됨
        Person1 p1 = new Person1();
        p1.id = 20;
        System.out.println("답1.");
        System.out.println("제 번호는 " + p1.id + " 입니다.");
        // 출력 : 제 번호는 20 입니다.

        // 문제2. : 사람의 id를 출력해주세요.
        // 풀이2. : 메소드 두 개(setId, getId)를 만들어준다.
        System.out.println("\n답2.");
        // 조건 : 사람의 id를 20으로 설정해주세요.
        // 조건 : 사람 클래스의 id 필드의 private 속성은 수정할 수 없습니다.
        // 조건 : 사람 클래스에서 출력할 수 없습니다.
        Person p2 = new Person();
        // 구현시작
        p2.setId(20);
        System.out.println("제 번호는 " + p2.getId()+ " 입니다.");
        // 구현끝
        // 출력 : 제 번호는 20 입니다.
    }
}
class Person1 {
    int id;
}
class Person {
    // private => 외부로 공개되지 않는다.
    // 힌트 : 여기에 메소드 2개 추가해야 합니다.
    private int id;

    // 메소드 1. public이니까 누구나 사용 가능하고, 어차피 본인 자신 거라 상관 없음
    public void setId(int id){
        this.id = id;
    }
    // 메소드 2. 받은 값을 return 해준다
    public int getId(){
        return id;
    }
}