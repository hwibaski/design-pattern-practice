package ch03_decorator.example_practice;

public abstract class CondimentDecorator extends Beverage{

    Beverage beverage;

    public abstract String getDescription();
}
