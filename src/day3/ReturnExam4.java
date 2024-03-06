package day3;
// 1 부터 n까지 수 중 짝수인 것만 출력
public class ReturnExam4 {

    //    public static boolean isEven(int num) {
//    }
//    public static void printEven(int n) {
//        // isEven 메서드를 이용.
//    }
    public static boolean isEven(int num) {
        if(num % 2==0){
            return true;
        } else {
            return false;
        }
   }
    public static void printEven(int n) {
        for(int i = 1; i <= n; i++) {
            if (isEven(i) == true){
                System.out.print(i);}
            else{
                System.out.print(" ");
            }
        }
    }

        public static void main (String[]args){

        printEven(10); // 출력: 2 4 6 8 10
            System.out.println();
        printEven(20); // 출력: 2 4 6 8 10 12 14 16 18 20
            System.out.println();
        printEven(5); // 출력: 2 4



        }

}