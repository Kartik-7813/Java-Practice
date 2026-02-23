/*
 * Polymorphism in Java -
 * 1. Polymorphism means an entity having many forms. In Java, polymorphism allows the objects to act or work
 *    differently based on their class type.
 * 2. In this, a function can have many forms, i.e. it can act differently based on the object calling them.
 * 3. Types of polymorphism -
 *    i. Compile-time polymorphism
 *    ii. Run-time polymorphism
 *
 * Here, we are going to see the example of compile-time polymorphism.
 */
package Polymorphism.compile_time;

public class Addition {

    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public double add (double a, double b, double c, double d) {
        return a + b + c + d;
    }

}

class Main {
    public static void main(String[] args) {

        Addition addition = new Addition();
        System.out.println(addition.add(4, 5));
        System.out.println(addition.add(8, 2, 5));
        System.out.println(addition.add(4.7, 53.5, 7.2, 3.14));

    }
}

/*
* In the above code, we see that -
* 1. Class "Addition" contains 3 methods with same name, but different parameters.
* 2. In the class "Main", we called these 3 methods by passing different arguments to each one,
*    based on type of parameter passed to them.
* 3. Hence, each one is working differently & giving the result different. This is called compile-time polymorphism.
* 4. Where the compiler picks the correct method during compile time based on the arguments.
* 5. "Method overloading" is the key player in this type of polymorphism.
* * */
