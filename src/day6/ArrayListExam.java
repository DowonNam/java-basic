package day6;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExam {
    public static void main(String[] args) {
        // 배열의 단점

        int[] arr = new int[10];
        arr[0] = 10; // 0번째 인덱스 사용
        //arr[10] = 100; // 10번째 인덱스 사용 → 마지막은 9이기 때문에 에러

        // 혹시 모르니까 배열을 크게 만들면 어떨까? 안전하지 않을까?
        int[] arr1 = new int[1000];
        arr1[0] = 10; // 0번째 인덱스 사용
        arr1[10] = 100;
        // 배열은 크기가 고정이라서 유연 x
        // 1000개 방을 만들면 너무 많은 방이 남게 된다

        // 오른쪽에도 객체 타입 넣어줘야 하지만, 왼쪽 보고 유추 가능해서 생략 가능
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10); // 0번째 인덱스에 10을 추가
        list.add(20); // 1번째 인덱스에 10을 추가
        list.add(30); // 3번째 인덱스에 10을 추가

        // 값 가져오기
        int rst = list.get(1); // 1번째 인덱스의 값을 가져옴
        System.out.println(rst);

        // 값 삭제하기
        list.remove(1);
        System.out.println(list.get(1)); // 30
        // System.out.println(list.get(2)); // remove 후 2번째 인덱스는 없어짐 에러

        // AarryList의 크기 확인
        int size = list.size();
        System.out.println(size); // 2

        // ArrayList의 모든 값 출력
        // 마지막인덱스는 항상 개수 -1
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
