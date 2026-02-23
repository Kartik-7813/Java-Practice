package Basics;

/*
Methods in Java: 

1. Methods / Functions are blocks of code that perform a specific task. 
2. They help in code reusability, organization, and modularity.

Syntax - 
returnType methodName(parameter1Type parameter1, parameter2Type parameter2, ...) {
    // method body
    // return statement (if returnType is not void)
}

Method Overloading:

1. Method overloading is a feature in Java that allows a class to have more than one method with the same name, 
but different data types or number of parameters.

*/
public class MethodsPractice {
    public static void main(String[] args) {

        String sample = "   Hello World   ";
        System.out.println(stringFunc(sample));

        System.out.println("Sum of 5 and 10 is: " + add(5, 10));

        System.out.println("Method Overloading Example:");
        System.out.println("Subtraction of 2 no's: " + sub(20, 10));
        System.out.println("Subtraction of 3 no's: " + sub(30, 10, 5));

        System.out.println(isPrime(7));
    }

    // Function to trim and convert string to uppercase
    public static String stringFunc(String str) {
            return str.toUpperCase().trim();
        }

    // Function to add two integers
    public static int add(int a, int b) {
        return a + b;
    }

    // Method overloading
    public static int sub (int a, int b) {
        return a - b;
    }

    public static int sub (int a, int b, int c) {
        return a - b - c;
    }

    // Function to check if a number is prime
    public static boolean isPrime(int n) {

        int res = 0;
        if (n <= 1) {
            return false;
        }
        for (int i=1; i<=n; i++) {
            if(n%i==0) {
                res++;
            }
        }
        return res == 2;
    }
}