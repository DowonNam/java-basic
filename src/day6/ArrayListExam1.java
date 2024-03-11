package day6;
import java.util.ArrayList;

public class ArrayListExam1 {
    public static void main(String[] args) {
    // 문제 1.
    // {5,4,3,2,1,0}을 ArrayList에 추가 해주세요.
    // ArrayList의 사이즈를 출력해주세요.
    // ArrayList의 3,4번째 값을 읽어서 출력해주세요. (인덱스 X, 1부터 )
    // 1,2번째 값을 지운 뒤, 다시 3,4번째 값을 출력해주세요
    // List의 모든 값을 출력해주세요.
    // 정수를 저장할 수 있는 ArrayList를 선언하고 만들어주세요.
    // 리스트에 값을 추가해주세요.
        ArrayList<Integer> list = new ArrayList<>();

        list.add(5);
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(1);
        list.add(0);

        // size()
        // 리스트의 사이즈를 출력해주시고, 값이 6이 맞다면 계속 진행해주세요.
        int size = list.size();
        System.out.println(size);
        // 출력결과 : 6

        // get()
        // 리스트의 3,4번째 값을 출력해주세요.
        System.out.print(list.get(2)+",");
        System.out.println(list.get(3));
        // 출력결과 : 3, 2

        // remove()
        // 리스트의 1,2번째 값을 지운 뒤, 다시 3,4번째 값을 출력해주시고 어떤 변화가 있는지 체크해주세요.
        list.remove(0);
        list.remove(1);
        System.out.print(list.get(2)+",");
        System.out.println(list.get(3));
        // 출력 결과 : 1, 0

        // 반복문으로 출력.
        // 리스트의 모든 값을 출력해주세요.
        for(int i = list.size()-1 ; i >= 0; i--){
            System.out.print(i);
        }
        // 출력 결과 : 3, 2, 1, 0

        System.out.println("\n\n답2.");
        // 문제 2
        사람 사람1 = new 사람(24, "홍길동");
        사람 사람2 = new 사람(30, "이순신");
        사람 사람3 = new 사람(41, "을지문덕");
        사람 사람4 = new 사람(32, "황진이");

        // 1. 네 사람을 ArrayList에 저장
        ArrayList<사람> list1 = new ArrayList<>();
        list1.add(사람1);
        list1.add(사람2);
        list1.add(사람3);
        list1.add(사람4);

        System.out.println("\n답2-1-2.");
        // 2. 네 사람에게 자기소개 시키기
        for (int i = 0; i < list1.size(); i++) {
            // 사람 타겟 = list1.get(i);
            // 타겟.introduce();
            // 하단 한 줄을 두 줄로 풀어 쓴 경우는 상단과 같다
            list1.get(i).introduce();
        }
        System.out.println("\n답2-1-3.");
        // 3. 30대인 사람에게만 자기소개 시키기
        for (int i = 0; i < list1.size(); i++) {
            사람 Person = list1.get(i);
            if(Person.getAge() >=30 && Person.getAge() < 40){
                Person.introduce();
            }
        }
        System.out.println("\n답2-2-1.");
        // 향상된 반복문
        // for (오른쪽과 동일한 타입 변수를 만들어줌 : 배열)
        for ( 사람 대상 : list1) {
            대상.introduce();
        }
        System.out.println("\n답2-2-2.");
        for ( 사람 대상 : list1) {
            if(대상.getAge() >= 30 && 대상.getAge() < 40){
                대상.introduce();
            }
        }
    }
}

class 사람 {
    private int age;
    private String name;

    사람(int age, String name) {
        this.age = age;
        this.name = name;
    }

    void introduce() {
        System.out.printf("%d살 %s입니다.\n", age, name);
    }

    int getAge() {
        return this.age;
    }

    String getName() {
        return this.name;
    }
}