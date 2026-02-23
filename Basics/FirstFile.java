package Basics;/*
   This is the simple java program where we studied about variables and primitive data types in Java.
   1. A variable is a container where we can store the data values within a program.
   2. We can create a variable by defining the data type followed by the variable name.
   3. There are two main data types in Java:
        a. Primitive data types
        b. Non-primitive data types
   4. Primitive data types in Java are the most basic data types. There are 8 primitive data types in Java:
        a. byte
        b. short
        c. int
        d. long
        e. float
        f. double
        g. char
        h. boolean
*/

class FirstFile {
    public static void main(String[] args) {

        // Data types practice
        // Integral data types
        byte varByte = 10;
        int varInt = 50;
        short varShort = 20;
        long varLong = 50000;

        System.out.println("Byte value: " + varByte);
        System.out.println("Integer value: " + varInt);
        System.out.println("Short value: " + varShort);
        System.out.println("Long value: " + varLong);

        // Floating point data types
        float varFloat = 5.75f;
        double varDouble = 19.99;

        System.out.println("Float value: " + varFloat);
        System.out.println("Double value: " + varDouble);

        // Character data type
        char varChar = 'A';
        System.out.println("Character value: " + varChar);

        // Boolean data type
        boolean varBoolean = true;
        System.out.println("Boolean value: " + varBoolean);

    }
}