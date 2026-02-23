/*
* Super Keyword in Java -
*
* 1. Super keyword is used in Java to access the variables & functions, when they're getting overridden by
*    child class members & functions within the inheritance hierarchy.
* 2. It is also used to access the constructors of parent class in child class explicitly.
* */

package Super_Keyword;

public class Bike extends Vehicle {

    public int maxSpeed = 150;

    public void displaySpeed() {

        System.out.println("Minimum speed: "+minSpeed);
        System.out.println("Maximum speed of Bike: "+maxSpeed);
        System.out.println("Maximum speed of any vehicle: "+super.maxSpeed); // base class member called using
                                                                             // "super" keyword

    }

    public static void main(String[] args) {

        Bike bike;
        bike = new Bike();
        bike.displaySpeed();
    }
}

class Man extends Person {

    Man() {

        super(); // It will call base class constructor first
        System.out.println("Man class constructor");
    }

    public static void main(String[] args) {

        Man man;
        man = new Man();
    }
}
