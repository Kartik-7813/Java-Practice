package Encapsulation;

/*
* Encapsulation in Java:
* 1. Encapsulation is a technique / process of combining data & methods into a single unit / class.
* 2. In OOP, it is used to keep data secure & organized.
*/

public class Student {

    int rollNo;
    String name;
    String course;
    int age;
    int fee;
    private double cgpa;    // We can't directly access it in another class & set its value.
                            // Hence, encapsulation is performed.

    // setter method to set cgpa
    public void setCgpa(double cgpa) {
        if (cgpa < 0) {
            System.out.println("Invalid CGPA");
        } else {
            this.cgpa = cgpa;
        }
    }

    // getter method to return cgpa
    public double getCgpa() {
        return cgpa;
    }
}
