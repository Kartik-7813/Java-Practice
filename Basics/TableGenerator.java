package Basics;/*
Table Generator in Java (basic microproject):- 

1. In this program, we will accept a number as input from user & then generate its multiplication table upto 10.
2. To take the input from user, we will use Scanner class object from .util package & we will use its nextInt() method to read an integer input. 
3. We will use a for loop to iterate from 1 to 10 & in each iteration & multiply the input number with the loop counter to get the product.
*/

import java.util.Scanner;
public class TableGenerator {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to generate its multiplication table: ");
        int number = sc.nextInt();

        System.out.println("Multiplication Table of " + number + ":");
        for (int i = 1; i<=10; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }
    }
    
}
