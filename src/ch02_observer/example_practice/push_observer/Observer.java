package ch02_observer.example_practice.push_observer;

public interface Observer {

    public void update(float temperature, float humidity, float pressure);

}
