package OOP;

//Use-1: Final method cannot be overridden
class Demo {
    final void show() {
        System.out.println("Hello World");
    }
}

class Demo2 extends Demo {
    /*
    void show() {       // This will generate a compile-time error
        System.out.println("Welcome to Java");
    }
     */
}

// Use-2: Final class can't be inherited
final class Demo3 {
    int a =  10;
}

// class Demo4 extends Demo3 {} // This will also generate compile-time error

public class FinalKeyword {
    public static void main(String[] args) {

        //Use-3: Final variable's value cannot be changed
        final int num = 3;
        // num = 5; // This will also generate an error
    }
}
