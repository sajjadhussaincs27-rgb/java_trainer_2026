
// File name: AccessModifierDemo.java

class Demo {

    private int a = 10;      
    // private: accessible only inside this class

    int b = 20;              
    // default: accessible within same package

    protected int c = 30;    
    // protected: accessible in same package or subclass

    public int d = 40;       
    // public: accessible from anywhere

    void showValues() {
        // All variables are accessible here because this is the same class
        System.out.println("Private a = " + a);
        System.out.println("Default b = " + b);
        System.out.println("Protected c = " + c);
        System.out.println("Public d = " + d);
    }
}

public class AccessModifierDemo {

    public static void main(String[] args) {

        Demo obj = new Demo();

        // obj.a;  NOT allowed (private)
        System.out.println("Default b = " + obj.b);     // allowed
        System.out.println("Protected c = " + obj.c);   // allowed
        System.out.println("Public d = " + obj.d);      // allowed

        obj.showValues(); // method call
    }
}
