package Basics;

public class LoopsPractice2 {
    
    public static void main(String[] args) {
        
        /*
        1
        10
        100
        1000
        10000
        */
        int n=1;
        for(int i = 1; i <= 5; i++) {
            System.out.println(n);
            n=n*10;
        }

        // count digits in a number
        int number = 12345;
        int count = 0;
        while (number != 0) {
            number = number / 10;
            count++;
        }
        System.out.println("\nNumber of digits: " + count);

        // factorial of a number
        int num = 5;
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial = factorial * i;
        }
        System.out.println("\nFactorial is: " + factorial);
    }

}
