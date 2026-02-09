//  SINGLE INHERITANCE 
class Animal {
    void eat() {
        System.out.println("Animal eats food");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

//  MULTILEVEL INHERITANCE 
class Puppy extends Dog {
    void weep() {
        System.out.println("Puppy weeps");
    }
}

//  HIERARCHICAL INHERITANCE 
class Cat extends Animal {
    void meow() {
        System.out.println("Cat meows");
    }
}
// ================= MAIN CLASS =================
public class InheritanceType {
    public static void main(String[] args) {

        System.out.println("---- Single Inheritance ----");
        Dog d = new Dog();
        d.eat();
        d.bark();

        System.out.println("\n---- Multilevel Inheritance ----");
        Puppy p = new Puppy();
        p.eat();
        p.bark();
        p.weep();

        System.out.println("\n---- Hierarchical Inheritance ----");
        Cat c = new Cat();
        c.eat();
        c.meow();
    }
}