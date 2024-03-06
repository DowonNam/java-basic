package day3;

public class Car {
    int speed;

    public void car(int n)
    {for(int i=0; i < n; i++){
        System.out.println("자동차가 달립니다.");
        }
    }
    public void run() {
        System.out.println("자동차가 최대속력" + speed +"km로 달립니다.");
    }
}
