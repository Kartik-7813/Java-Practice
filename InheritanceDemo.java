package OOP;

// Single, Multilevel & Hierarchical Inheritance
class Vehicle {
    String vehicleType;
    int maxSpeed;
}

class Bike extends Vehicle {

    public void displayDetails() {
        System.out.println(vehicleType);
        System.out.println(maxSpeed);
    }

    public void startBike() {
        System.out.println("Bike is starting");
    }

    public void stopBike() {
        System.out.println("Bike is stopping");
    }
}

class Platina extends Vehicle {

    String color;

    public void displayDetails() {
        System.out.println(vehicleType);
        System.out.println(color);
        System.out.println(maxSpeed);
    }

    public void startPlatina() {
        System.out.println("Platina is starting");
    }

    public void stopPlatina() {
        System.out.println("Platina is stopping");
    }
}

class Auto_Rickshaw extends Vehicle {

    int no_of_tyres;
    public void displayDetails() {
        System.out.println(vehicleType);
        System.out.println(no_of_tyres);
    }
}

public class InheritanceDemo {
    public static void main() {

        Bike bike = new Bike();
        bike.vehicleType = "2-wheeler";
        bike.maxSpeed = 160;
        bike.displayDetails();
        bike.startBike();
        bike.stopBike();

        Platina platina = new Platina();
        platina.vehicleType = "2-wheeler";
        platina.maxSpeed = 140;
        platina.color = "black";
        platina.displayDetails();
        platina.startPlatina();
        platina.stopPlatina();

        Auto_Rickshaw auto_Rickshaw = new Auto_Rickshaw();
        auto_Rickshaw.vehicleType = "3-wheeler";
        auto_Rickshaw.no_of_tyres = 3;





    }
}
