
// ================= SINGLE INHERITANCE =================
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

// ================= MULTILEVEL INHERITANCE =================
class Puppy extends Dog {
    void weep() {
        System.out.println("Puppy weeps");
    }
}

// ================= HIERARCHICAL INHERITANCE =================
class Cat extends Animal {
    void meow() {
        System.out.println("Cat meows");
    }
}

// ================= MULTIPLE INHERITANCE USING INTERFACE =================
interface Pet {
    void play();
}

class PetDog extends Animal implements Pet {
    public void play() {
        System.out.println("PetDog plays with owner");
    }
}

// ================= MAIN CLASS =================
public class Inheritance {
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

        System.out.println("\n---- Multiple Inheritance (Using Interface) ----");
        PetDog pd = new PetDog();
        pd.eat();
        pd.play();
    }
}

