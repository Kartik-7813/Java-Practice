package OOP;

public class Car {

    int modelNumber;
    String color;

    public void start() {
        System.out.println("Starting Car");
    }
    public void stop() {
        System.out.println("Stopping Car");
    }
}

class Main {
    public static void main(String[] args) {

        Car car = new Car();
        car.modelNumber = 101;
        car.color = "red";
        car.start();
        car.stop();
    }
}