package ch01_strategy.example_practice;

public class FlyWithWings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("저는 날아요!");
    }
}
