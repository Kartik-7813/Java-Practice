package Basics;

/*
Array in Java: 

Array is a collection of elements having same datatype which are stored in contiguous memory locations.
Types of Array:
1. Single Dimensional Array (1D Array)
2. Multi Dimensional Array (2D Array, 3D Array, etc.)

Arrays can be declared in two ways:
1. dataType[] arrayName = new dataType[size];
2. dataType[] arrayName = {value1, value2, value3, ..., valueN};

*/
public class ArrayPractice {
    
    public static void main(String[] args) {
        
        // Accessing empty array elements
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" "+ arr[i]);
        }
        System.out.println();

        //Accesing & displaying initialized array elements
        int[] arr2 = {1,2,3,4,5,6,7,8,9,10};
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(" "+ arr2[i]);
        }
        System.out.println();

        System.out.println("Using for-each loop:");
        for (int j : arr2) {
            System.out.print(" "+ j);
        }
        System.out.println();

        // Array reversal
        System.out.println("Array Reversal:");
        for(int i = arr2.length -1; i >= 0; i--) {
            System.out.print(" "+ arr2[i]);
        }
        System.out.println();

        // Sum of array elements
        int sum = 0;
        for (int j : arr2) {
            sum += j;
        }
        System.out.println("Sum of array elements: " + sum);

        // 2-D Array
        int[][] arr3 = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        System.out.println("2-D Array elements:");
        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3.length; j++) {
                System.out.print(" "+ arr3[i][j]);
            }
            System.out.println();
        }

        // Jagged Array
        int[][] jaggedArr = {
            {1,2,3},
            {4,5},
            {6,7,8,9}
        };

        System.out.println("Jagged Array elements:");
        for (int i = 0; i < jaggedArr.length; i++) {
            for (int j = 0; j < jaggedArr[i].length; j++) {
                System.out.print(" "+ jaggedArr[i][j]);
            }
            System.out.println();
        }


    }
}
