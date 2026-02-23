/*
* Single Inheritance in Java -
* 1.
* */

package Inheritance.single_inheritance;

public class Lion extends Animal {

    @Override
    public void eat() {
        System.out.println("Lion eats flesh.");
    }

    @Override
    public void makeSound() {
        System.out.println("Lion roars!");
    }

    public static void main(String[] args) {

        Lion lion;
        lion = new Lion();
        lion.setName("Simba");
        lion.setAge(5);
        System.out.println("Lion name: "+lion.getAge());
        System.out.println("Lion age: "+lion.getName());
        lion.eat();
        lion.makeSound();
    }
}
