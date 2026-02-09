
interface A {
    void showA();
}

interface B {
    void showB();
}

class C implements A, B {
    public void showA() {
        System.out.println("Show A");
    }

    public void showB() {
        System.out.println("Show B");
    }
}

public class MultipleInheritanceUsingInterface {

    public static void main(String[] args) {
        
    }
}
