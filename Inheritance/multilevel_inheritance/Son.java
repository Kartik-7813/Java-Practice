package Inheritance.multilevel_inheritance;

public class Son extends Father {

    public static void main(String[] args) {

        Son son;
        son = new Son();
        son.setName("Raj");
        son.setAge(20);

        Father father;
        father = new Father();
        father.setName("Sheth");
        father.setAge(40);

        Grandfather grandfather;
        grandfather = new Grandfather();
        grandfather.setName("Mothe Sheth");
        grandfather.setAge(70);

        System.out.println("Son's name: "+son.getName());
        System.out.println("Son's Age: "+son.getAge());
        System.out.println();

        System.out.println("Father's name: "+father.getName());
        System.out.println("Father's Age: "+father.getAge());
        System.out.println();

        System.out.println("Grandfather's name: "+grandfather.getName());
        System.out.println("Grandfather's Age: "+grandfather.getAge());





    }
}
