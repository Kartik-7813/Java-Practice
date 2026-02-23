/*
Basics.Operators in  Java:
1. Arithmetic Basics.Operators
2. Assignment Basics.Operators
3. Relational Basics.Operators
4. Bitwise Basics.Operators
5. Logical Basics.Operators
6. Unary Basics.Operators
7. Ternary Basics.Operators

As we can see there are 7 types of operators in Java, but here in this code, we will practice first three types of operators. 
*/

package Basics;
public class Operators {
    public static void main(String[] args) {
        
    int a = 10;
    int b = 3;
    
    /* Type-1 -> Arithmetic Basics.Operators in Java:
    1. Addition (+)
    2. Subtraction (-)
    3. Multiplication (*)
    4. Division (/)
    5. Modulus (%) */
    
    System.out.println("Addition: " + (a+b));
    System.out.println("Subtraction: "+ (a-b));
    System.out.println("Multiplication: "+ (a*b));
    System.out.println("Division: "+ (a/b));
    System.out.println("Modulus: "+ (a%b));
    System.out.println(" ");

    /* Assignment Basics.Operators in Java:
    1. Assignment (=)
    2. Addition Assignment (+=)s
    3. Subtraction Assignment (-=)
    4. Multiplication Assignment (*=)
    5. Division Assignment (/=)
    6. Modulus Assignment (%=) */  
    
    System.out.println("Assignment: " + (a=b));
    System.out.println("Addition Assignment: " + (a+=b));
    System.out.println("Subtraction Assignment: " + (a-=b));
    System.out.println("Multiplication Assignment: " + (a*=b));
    System.out.println("Division Assignment: " + (a/=b));
    System.out.println("Modulus Assignment: " + (a%=b));
    System.out.println(" ");

    /* Relational Basics.Operators in Java:
    1. Equal to (==)
    2. Not equal to (!=)
    3. Greater than (>)
    4. Less than (<)
    5. Greater than or equal to (>=)
    6. Less than or equal to (<=) */

    System.out.println(a == b); 
    System.out.println(a != b);
    System.out.println(a > b);
    System.out.println(a < b);
    System.out.println(a >= b);
    System.out.println(a <= b);

    }
}
