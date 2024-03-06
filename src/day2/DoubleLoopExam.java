package day2;

public class DoubleLoopExam {
    public static void main(String[] args) {
        // 문제 : 구구단 작성(완료)
        // 조건 : 짝수번째만 곱하기

//         for(int j = 2; j < 10; j+=2) {
//             for (int i = 2; i <= 9; i+=2) {
//                 System.out.println((j) + " X " + (i) + " = " + (j * i));
//             }
//         }
        // 문제 : 구구단은 n단 ~ m단 중 홀수단만 1 ~
        // limit 까지 곱 중 짝수곱만 출력해주세요
        // 조건 : n은 4, m은 20, limit는 10

//        int n = 4; // 시작
//        int m = 20; // 끝
//        int limit = 10; // 곱의 개수
//
//        for(int j = 5 ; j <= 20; j+=2) {
//            for (int i = 2; i <= 10; i+=2) {
//                System.out.println((j) + " X " + (i) + " = " + (j * i));
//            }
//        }
        // 출력
        //  높이 : [3]
        //
        //    *
        //    **
        //    ***
        //

        //    높이 : [5]
        //
        //    *
        //    **
        //    ***
        //    ****
        //    *****

        //    높이 : [7]
        //
        //    *
        //    **
        //    ***
        //    ****
        //    *****
        //    ******
        //    *******

        int height = 3;

     //println 으로 출력하지 않고, print로 출력해야 함
//        for(int i = 1; i <= height; i++) {
//            for(int j = 1; j <= i; j++) {
//                    System.out.print("*");
//                } System.out.println();
//        }

//        높이 : [3]
//
//      *
//     **
//    ***
//
//    */
//
//    /*
//
//    높이 : [5]
//
//        *
//       **
//      ***
//     ****
//    *****
//
//    */
//
//    /*
//
//    높이 : [7]
//
//          *
//         **
//        ***
//       ****
//      *****
//     ******
//    *******

//        for(int i = height; i > 0; i--) {
//           for(int j = 1; j <= height; j++) {
//               if(j < i){
//                   System.out.print(" ");}
//               else System.out.print("*");
//               } System.out.println();
//       }

//print_tri(3);
        // 출력
        //*
        //**
        // *

        //print_tri(5);
        // 출력
        //*
        //**
        //***
        //**
        //*

        //print_tri(6);
        // 출력
        //*
        //**
        //***
        //***
        //**
        //*

        for(int i = 1; i <= height; i++) {
            for(int j = 0; j < i ; j++ ){
                System.out.print("*");
            } System.out.println();
        }
        for(int i = 0; i < height; i++) {
            for (int j = (height - 1); j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


