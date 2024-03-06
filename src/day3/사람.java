package day3;
//class 사람 {
//
//    static int 나이;
//    static String 이름;
//
//    public static void 자기소개() {
//        System.out.println("저는 " + 나이 + "살 " + 이름 + " 입니다.");
//    }
//}

// 상단과 같은 코드에서 static 을 지움
// static이 있을시 값을 변경하면 자꾸 수정이 됨
public class 사람 {


    int 나이;
    String 이름;

    public void 자기소개() {
        System.out.println("저는 " + 나이 + "살 " + 이름 + " 입니다.");
    }
}
