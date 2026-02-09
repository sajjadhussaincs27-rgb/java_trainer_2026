
// ================= ABSTRACT PARENT CLASS =================
abstract class Vehicle {

    // Instance variable
    int speed = 60;

    // Static variable
    static String type = "Transport";

    // Final variable
    final int wheels = 2;

    // Constructor in abstract class
    Vehicle() {
        System.out.println("Vehicle constructor called");
    }

    // Abstract method
    abstract void start();

    // Normal method
    void fuel() {
        System.out.println("Vehicle needs fuel");
    }

    // Static method
    static void category() {
        System.out.println("Vehicle category: " + type);
    }
}

// ================= ABSTRACT CHILD CLASS =================
abstract class Bike extends Vehicle {

    // Abstract method still not implemented
    abstract void brand();
}

// ================= CONCRETE CHILD CLASS =================
class SportsBike extends Bike {

    // Implementing abstract methods
    @Override
    void start() {
        System.out.println("SportsBike starts with self-start");
    }

    @Override
    void brand() {
        System.out.println("Brand: Yamaha");
    }
}

// ================= MAIN CLASS =================
public class AbstractCompleteDemo {

    public static void main(String[] args) {

        // Abstract class reference → child object (Polymorphism)
        Vehicle v = new SportsBike();

        v.start();      // overridden method
        v.fuel();       // parent method

        System.out.println("Speed: " + v.speed);
        System.out.println("Wheels: " + v.wheels);

        Vehicle.category(); // static method
    }
}

