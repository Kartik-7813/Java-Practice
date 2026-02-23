/*
* Constructors in Java -
*
* 1. These are special methods which is used to instantiate the object of a class, when its created.
* 2. It must have the same name as class name.
* 3. Types - Default & Parameterized constructor
* */

package Constructors;

public class Teacher {

    private int id;
    private String name;
    private String designation;
    private String qualification;
    private int salary;

    // Default constructor
    public Teacher() {
        this.id = 1201;
        this.name = "Mr. ABC";
        this.designation = "Assi. Professor";
        this.qualification = "B.E. CSE";
        this.salary = 45000;
    }

    // Parameterized constructor
    public Teacher(int id, String name, String designation, String qualification, int salary) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.qualification = qualification;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDesignation() {
        return designation;
    }

    public String getQualification() {
        return qualification;
    }

    public int getSalary() {
        return salary;
    }
}
