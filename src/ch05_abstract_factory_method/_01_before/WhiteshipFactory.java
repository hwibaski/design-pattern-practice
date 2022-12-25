package ch05_abstract_factory_method._01_before;


import ch04_factory_method.example_practice.after_factory_method.DefaultShipFactory;
import ch04_factory_method.example_practice.after_factory_method.Ship;
import ch04_factory_method.example_practice.after_factory_method.Whiteship;
import ch05_abstract_factory_method._02_after.Anchor;
import ch05_abstract_factory_method._02_after.Wheel;

public class WhiteshipFactory extends DefaultShipFactory {

    @Override
    public Ship createShip() {
        Ship ship = new Whiteship();
        ship.setAnchor((Anchor) new WhiteAnchor());
        ship.setWheel((Wheel) new WhiteWheel());
        return ship;
    }
}
