package Inheritance.hierarchical_inheritance;

public class FourWheeler extends Vehicle {

    public static void main(String[] args) {

        FourWheeler fourWheeler;
        fourWheeler = new FourWheeler();
        fourWheeler.setVehicleName("Tata Nexon");
        fourWheeler.setPrice(1500000);

        System.out.println(fourWheeler.getVehicleName());
        System.out.println(fourWheeler.getPrice());

    }
}
