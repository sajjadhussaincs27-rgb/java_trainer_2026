
// Default Method 

interface Vehicle {
    default void fuel() {
        System.out.println("Needs fuel");
    }
}

//Static Method in Interface
interface MathUtil {
    static void add(int a, int b) {
        System.out.println(a + b);
    }
}

//Interface Extending Interface
interface A {
    void showA();
}

interface B extends A {
    void showB();
}
