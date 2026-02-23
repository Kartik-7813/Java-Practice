/*
* Abstraction in Java -
* 1. Abstraction is the process of hiding internal implementation details & only showing important functionality to user.
* 2. It is achieved through abstract classes & abstract functions.
*
* Abstract class - It is a class which cannot be instantiated & contains both abstract methods & concrete methods.
* Abstract methods - Methods which are only declared, it doesn't contain method body.
* Concrete methods - Methods which are defined, means it contains both function declaration with the method body.
* */

package Abstract_Class;

public abstract class Television {

    public abstract void tvOff();

    public abstract void tvOn();

}

/*
* Here, as we can see the class Television is declared as abstract class which contains abstract methods. After then to
* use these methods, we will access these methods by inheriting this abstract class & eventually the methods by writing
* code in it.
* */
