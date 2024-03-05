package day1;

public class ConditionChoose {

    public static void main(String[] args) {

        int age =  25;
//답 1. 이렇게 되면 값이 3 개가 나와서 안 됨
//        if(age <= 13) {
//            System.out.println("초등학생");
//        }
//        if(age <= 17) {
//            System.out.println("중학생");
//        }
//        if(age <= 19) {
//            System.out.println("고등학생");
//        }

//답 2. 이렇게 해도 정답
//        if(age <= 13) {
//            System.out.println("초등학생");
//        }
//        if(age <= 17) {
//            if (age > 13) {
//                System.out.println("중학생");
//            }
//        }
//        if(age <= 19) {
//            if (age > 16) {
//                System.out.println("고등학생");
//            }
//        }
//답 2. 제일 간단한 정답
        // 택일 구조(else if)를 사용하면 연산상의 효율성과 조건식의 간결함을 얻을 수 있다.
        if(age <= 13) {
           System.out.println("초등학생");
        }
        else if(age <= 17) {
            System.out.println("중학생");
        }
        else if(age <= 19) {
            System.out.println("고등학생");
        // 상단에 있는 거 전부 아닌 경우
        // else 같은 경우는 마지막에 조건을 생략하고 사용 가능(조건문 덩어리 마지막에 와야 함)
        } else {
            System.out.println("성인");
        }
    }
}
