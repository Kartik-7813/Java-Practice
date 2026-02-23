/*
* Run-time polymorphism -
* 1. In this type of polymorphism, the function call is decided during runtime, i.e. which function should be called is
* decided during the execution of the code.
* 2. It is achieved through the function overriding.
*/

package Polymorphism.run_time;

public class BengalTiger extends Tiger {

    @Override
    public void roar() {
        System.out.println("Roarrr!");
    }

    public static void main(String[] args) {
        BengalTiger tiger = new BengalTiger();
        tiger.roar();
    }
}

/*
* 1. Here as you can see, there are 2 classes, which are following inheritance hierarchy & both contains same functions
* with same name.
* 2. The function present in base class is getting overriden by the child class function. This is the runtime polymorphism.
*/
