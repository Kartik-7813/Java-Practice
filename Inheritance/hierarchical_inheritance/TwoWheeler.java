package Inheritance.hierarchical_inheritance;

public class TwoWheeler extends Vehicle {

    public static void main(String[] args) {

        TwoWheeler twoWheeler;
        twoWheeler = new TwoWheeler();
        twoWheeler.setVehicleName("Bajaj Platina");
        twoWheeler.setPrice(75000);

        System.out.println(twoWheeler.getVehicleName());
        System.out.println(twoWheeler.getPrice());
    }
}
