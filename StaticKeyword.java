package OOP;

// 1. Static variable - Used for memory management. Only one copy of variable is created & shared among all
// objects in java. Only used for class-level variable, not local variable.

// 2. Static method - Once created, we can call it just by using the class name, no need to create
// the object of class.

// 3. Static block - It is block of code which executes automatically when class is loaded in memory.
// It executes before main() method.

class Employee {

    int id;
    String empName;
    static String companyName = "Cisco"; // static keyword

    Employee(int id, String empName) {
        this.id = id;
        this.empName = empName;
    }

    void display() {
        System.out.println(id + " " + empName + " " + Employee.companyName);
    }

    static void show() {
        System.out.println("Hello World");  // static method
    }

    static {
        System.out.println("Static block"); // static block
    }
}


public class StaticKeyword {

    static void main() {

        Employee emp1 = new Employee(101, "kartik");
        emp1.display();
        Employee emp2 = new Employee(102, "shreyas");
        emp2.display();
        Employee.show();
    }
}
