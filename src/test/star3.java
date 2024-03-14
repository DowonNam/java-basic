package test;

public class star3 {
    static int height = print_tri(9);
    static int star_len = 0;

    public static void main(String[] args) {

        for (int i = 0; i < height; i++) {
            int increase = 0;
            int decrease = 0;

            if (height % 2 == 0) {
                if (height / 2 > i) {
                    increase = 1;
                }
                else if (height / 2 < i) {
                    decrease = 1;
                }
            } else {
                if (height / 2 >= i) {
                    increase = 1;
                } else {
                    decrease = 1;
                }
            }
            if (increase == 1) {
                star_len++;
            }
            if (decrease == 1) {
                star_len--;
            }
            for (int j = 0; j < star_len; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
    public static int print_tri(int n) {
        return n;
    }
}