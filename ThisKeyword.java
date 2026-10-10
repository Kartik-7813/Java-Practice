package OOP;

// Use-1: Refer the current class instance variable
class A {
    int a;
    void assign(int a) {
        this.a = a;
    }
    void display() {
        System.out.println(a);
    }
}

// Use-2: Invoke the current class constructor
class B {
    B() {
        System.out.println("No args");
    }
    B(int b) {
        this();
        System.out.println("Parameterized");
    }
}

// Use-3: Invoke the current class method
class C {
    void hello() {
        System.out.println("hello");
    }
    void show() {
        hello(); // Here, implicitly "this" is used to point & call the first method
    }
}

public class ThisKeyword {
    static void main(String[] args) {
        A obj= new A();
        obj.assign(10);
        obj.display();

        B obj2= new B(10);

        C obj3 = new C();
        obj3.show();
    }
}
