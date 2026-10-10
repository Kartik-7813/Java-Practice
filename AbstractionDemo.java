package OOP;

// Abstract class
abstract class PaneerDish {

    int paneerPieces;
    abstract void gravy();

}

class ShahiPaneer extends PaneerDish {

    @Override
    void gravy() {
        System.out.println("ShahiPaneer");
    }
}

// Interface
interface AlooDish {
    void show();
    default void make() {
        System.out.println("Aloo & Jeera");
    }
    static void serve() {
        System.out.println("AlooJeera is ready");
    }
}

class AlooJeera implements AlooDish {

    public void show() {
        System.out.println("AlooJeera");
    }
}


public class AbstractionDemo {
    static void main(String[] args) {
        /*
        ShahiPaneer shahiPaneer = new ShahiPaneer();
        shahiPaneer.paneerPieces = 5;
        System.out.println(shahiPaneer.paneerPieces);
        shahiPaneer.gravy();
         */

        AlooJeera a = new AlooJeera();
        a.show();
        a.make();
        AlooDish.serve();
    }
}
