
abstract class Vehicle {

    // Abstract method
    abstract void start();

    // Normal method
    void fuel() {
        System.out.println("Vehicle needs fuel");
    }
}

class Bike extends Vehicle {

    // Implementing abstract method
    @Override
    void start() {
        System.out.println("Bike starts with key");
    }
}

public class AbstractDemo {
    public static void main(String[] args) {

        Vehicle v = new Bike();  // reference of abstract class
        v.start();
        v.fuel();
    }
}
