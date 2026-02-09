
// Polymorphism means “one name, many forms”.
// In Java, the same method behaves differently depending on the object.

// ================= PARENT CLASS =================
class Shape {

    // Compile-time Polymorphism (Method Overloading)
    int area(int a) {               // square
        return a * a;
    }

    int area(int l, int b) {        // rectangle
        return l * b;
    }

    // Run-time Polymorphism (Method Overriding)
    void draw() {
        System.out.println("Drawing a shape");
    }
}

// ================= CHILD CLASS =================
class Circle extends Shape {

    // Method Overriding
    @Override
    void draw() {
        System.out.println("Drawing a circle");
    }
}

// ================= MAIN CLASS =================
public class Polymorphism {
    public static void main(String[] args) {

        // Compile-time Polymorphism
        Shape s = new Shape();
        System.out.println("Area of square: " + s.area(5));
        System.out.println("Area of rectangle: " + s.area(4, 6));

        // Run-time Polymorphism
        Shape ref;        // parent reference
        ref = new Circle();   // child object
        ref.draw();       // calls Circle's draw()
    }
}
