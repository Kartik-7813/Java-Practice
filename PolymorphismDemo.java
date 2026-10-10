package OOP;

// compile-time
class Addition {

    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public double add(double a, double b) {
        return a + b;
    }
}

//run-time
class Animal {

    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Cat extends Animal {

    @Override
    void sound() {
        System.out.println("Meow meow");
    }
}

public class PolymorphismDemo {
    static void main(String[] args) {

        Addition add = new Addition();
        System.out.println(add.add(10, 20));
        System.out.println(add.add(10, 20, 30));
        System.out.println(add.add(10.7, 9.63));


        Animal animal = new Cat();
        animal.sound();

        Animal cat = new Animal();
        cat.sound();
    }
}
