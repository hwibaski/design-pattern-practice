package ch01_strategy.example_practice;

public class MiniDuckSimulator {

    public static void main(String[] args) {
        System.out.println("--------물오리-----------");
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        System.out.println("--------오리 모델-----------");
        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        System.out.println("--------나는 행동 setter 호출 후-----------");
        model.performFly();

    }

}
