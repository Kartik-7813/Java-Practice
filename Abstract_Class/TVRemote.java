package Abstract_Class;

public class TVRemote extends Television {

    @Override
    public void tvOff() {
        System.out.println("Television is turned OFF !!");
    }

    @Override
    public void tvOn() {
        System.out.println("Television is turned ON !!");
    }
}

class Main {

    public static void main(String[] args) {

        TVRemote tvRemote = new TVRemote();
        tvRemote.tvOn();
        tvRemote.tvOff();
    }
}

/*
* Here, we successfully inherited the abstract class & implemented the abstract methods by writing code body into them.
* But abstract classes doesn't provide 100% abstraction, because they can contain both abstract methods as well as
* concrete methods.
* */
