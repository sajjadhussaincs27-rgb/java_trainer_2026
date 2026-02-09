
// An interface in Java is used to achieve 100% abstraction and multiple inheritance.
// It tells a class what to do, not how to do it.
//Basic syntax
interface InterfaceName {
    void method1();   // abstract method
}

class ClassName implements InterfaceName {
    public void method1() {
        // implementation
    }
}
