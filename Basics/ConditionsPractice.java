package Basics;/*
Conditional Statements in Java :- 
These statements are used to perform different tasks based on different conditions.

Types - 
1. if statement
2. if-else statement
3. if-else-if ladder
4. switch statement
*/

public class ConditionsPractice {
    public static void main(String[] args) {

        int no = 10;
        // if statement
        if (no % 2 == 0) {
            System.out.println(no + " is an even number");
        }

        // if-else statement
        int a = 10, b = 15;
        if (a > b) {
            System.out.println(a + " is greater than " + b);
        } else {
            System.out.println(b + " is greater than " + a);
        }

        // if-else-if ladder
        if (a > b) {
            System.out.println(a + " is greater than " + b);
        } else if (b > a) {
            System.out.println(b + " is greater than " + a);
        } else {
            System.out.println("Both numbers are equal.");
        }

        // switch statement
        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;  
            default:
                System.out.println("Invalid day");
        }

    }
}
