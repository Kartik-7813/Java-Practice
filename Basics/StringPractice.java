package Basics;/*
String is the sequence of characters which is used to store text data.
There are two ways to create strings in java: 

1. Using String Literal - 
Ex. String str = "Hello";

2. Using new Keyword - 
Ex. String str = new String("Hello");

Q. How the strings are stored in memory?

1. In java, the strings are basically stored as objects of String class in heap memory.
2. There is a special memory area in heap memory called "String Constant Pool" which stores string literals. 
3. When we create a string using string literal, the JVM checks the string constant pool first. If the string already exists, 
it returns the reference to the existing string. If not, it creates a new string in the pool.
4. If we create a string using new keyword, it always creates a new string object in general heap memory, not in string constant pool,
even if the same string already exists in the string constant pool.
*/

public class StringPractice {
    public static void main(String[] args) {

        String str1 = "Java";
        String str2 = "Java";
        System.out.println(str1 == str2); // The o/p is true, as both refer to same object in string constant pool

        String str3 = new String("Programming");
        String str4 = new String("Programming");
        System.out.println(str3 == str4); // The o/p is false, as both refer to different objects in general heap memory
        System.out.println("");

        /* 
        Different string methods - 
        1. length() - It returns the length of the string
        2. charAt(index) - It returns the character at the specified index
        3. toUpperCase() - This will convert the given string to uppercase
        4. toLowerCase() - It converts the string into lowercase format
        5. substring(start, end) - It returns the substring from given start index to end index
        6. equals(anotherString) - It compares two strings for equality
        7. equalsIgnoreCase(anotherString) - It compares two strings for equality, ignoring case differences
        8. concat(anotherString) - It concatenates the specified string to the end of the current string
        9. trim() - It removes start & end whitespaces from the string
        10. replace(oldChar, newChar) - It replaces all occurrences of oldChar with newChar in the string
        ... and many more.
        */

        String string = "Kartik Chinchole";
        System.out.println("String length: " + string.length());
        System.out.println("Character at index 7: " + string.charAt(7));
        System.out.println("Uppercase: " + string.toUpperCase());
        System.out.println("Lowercase: " + string.toLowerCase());
        System.out.println("Substring: " + string.substring(0, 6));
        System.out.println("Equals: " + string.equals("Kartik Chinchole"));
        System.out.println("Equals Ignore Case: " + string.equalsIgnoreCase("kartik Chinchole"));
        System.out.println("Concatenation: " + string.concat(" - Java Developer"));

        String s = "   Hello World!   ";
        System.out.println("Trimmed String: " + s.trim());
        System.out.println("Replace: " + string.replace('i', 'o'));
    }
}
