package ch01;

public class FlyWithWings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("저는 날아요!");
    }
}
