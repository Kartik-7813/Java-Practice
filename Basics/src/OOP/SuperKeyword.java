package OOP;

class AA {
    int n = 10;
    void m1() {
        System.out.println("m1");
    }
    AA() {
        System.out.println("AA");
    }
}
class BB extends AA {
    int n = 10;
    void show() {
        super.m1(); // Use-2: To access current parent class method
        System.out.println(super.n); // Use-1: To access current parent class instance
    }
    BB() {
        System.out.println("BB");
    }
}
public class SuperKeyword {
    public static void main(String[] args) {
        BB  obj = new BB(); // Use-3: To invoke parent class constructor. In java, even if we don't mention
                            // super(), it will still call parent class constructor first & then child
                            // class constructor
        //obj.show();
    }
}
