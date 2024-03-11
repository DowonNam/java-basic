//package day6.pg1;
//// 다른 패키지 안에 있는 것을 불러오기 : import
//// import (제일 상위 패키지부터 작성)
//import day6.pg2.test;
//
//public class AccessModifier {
//
//    public static void main(String[] args) {
//
//        // 접근제어자 → 인스턴스변수와 메서드, 클래스에 사용
//        //public, protected, default, private
//
//        test t1 = new test();
//        t1.a = 10;
//        System.out.println(t1.a);
//
//        test t2 = new test2();
//        t2.a = 20; // 같은 패키지 안에서도 사용 불가
//
//    }
//}
//
////class test{
////    int a; // default → 접근제어자 생략 가능
////}
//
//class test2{
//    private int a; // 자기 자신만 사용 가능, test2 클래스 내에서만 사용 가능
//}