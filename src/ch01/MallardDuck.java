package ch01;

public class MallardDuck extends Duck {

    public MallardDuck() {
        /**
         * 나는 행동과 꽥꽥거리는 행동을 Duck 또는 Duck의 하위 클래스(서브클래스)에서 정의하지 않고
         * 공통되는 메서드를 인터페이스로 분리한 다음 각 서브 클래스의 구현부에서
         */
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    public void display() {
        System.out.println("저는 물오리 입니다!");
    }

}
