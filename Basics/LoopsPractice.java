package Basics;/*
Loops in Java :-

Loops are used to execute a block of code multiple times based on a condition.
Types of Loops in Java -
1. for loop
2. while loop
3. do-while loop
*/

public class LoopsPractice {
    public static void main(String[] args) {

        // for loop
        System.out.println("Even no. from 1 to 20 using for loop:");
        for(int i=1;i<=20;i++) {
            if (i%2==0) {
                System.out.println(i);
            }
        }

         System.out.println("\nOdd no. from 1 to 20 using for loop:");
        for(int i=1;i<=20;i++) {
            if (i%2==1) {
                System.out.println(i);
            }
        }

        // while loop
        System.out.println("\nEven no. from 1 to 20 using while loop: ");
        int j = 1;
        while(j<=20) {
            if (j%2==0) {
                System.out.println(j);
            }
            j++;
        }

        System.out.println("\nOdd no. from 1 to 20 using while loop: ");
        int l = 1;
        while(l<=20) {
            if (l%2==1) {
                System.out.println(l);
            }
            l++;
        }
        
        // do-while loop
        System.out.println("\nNumbers from 1 to 10 using do-while loop: ");
        int k=1;
        do {
            System.out.println(k);
            k++;
        } while(k<=10);
        
    }
}
