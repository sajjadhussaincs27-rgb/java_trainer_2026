
// Aggregation or loosely coupled
class Department {
    static String Deptname;

    Department(String name) {
        Deptname = name;
    }
}

class University {
    private Department HR;

    University(Department d) {
        HR = d;
    }

    String getHRValue() {
        return HR.Deptname;
    }
}
// ```

// ### Explanation

// * `Department` exists independently of `University`.
// * `University` **receives** a `Department` object from outside.
// * Changes made to `Department` are reflected in `University`.
// * This shows a **has-a relationship** with loose coupling.

// ---

// ## Composition (Tightly Coupled)

// In composition, objects are **strongly dependent** on the container object. If the container is destroyed, the contained objects are also destroyed.

// ### Example: House and Room

// ```java
// Composition or tightly coupled
class Room {
    private String name;

    public Room(String name) {
        this.name = name;
    }
}

class House {
    private List<Room> rooms = new ArrayList<>();

    public House() {
        rooms.add(new Room("Living Room")); // Created internally
    }
}
// ### Explanation

// * `Room` objects are created **inside** the `House` class.
// * `Room` cannot exist independently of `House`.
// * This represents **strong ownership** and tight coupling.

// ---

// ## Main Method

// ```java
public class Main {
    public static void main(String[] args) {
        Department d = new Department("HR");
        University u = new University(d);

        System.out.println(u.getHRValue());

        Department.Deptname = "Sales";
        System.out.println(u.getHRValue());
    }
}
