package ch03_decorator.example_practice;

public class Decaf extends Beverage{
    public Decaf() {
        description = "디카페인 커피";
    }

    public double cost() {
        return 0.78;
    }

}

