package day1;

public class LogicalOperator {
    public static void main(String[] args) {
        // 논리연산자

        //&&(AND)
        //둘 다 true 일때만 true
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);

        // ||(OR)
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);
        //둘 다 FALSE 일 때만 FALSE, 그 외에는 TRUE

        System.out.println(true || false || true || false);

        System.out.println(10 > 20 && 1 != 1 && 3 > 2);
    }
}
