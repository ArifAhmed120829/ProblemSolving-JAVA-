package Java_classes;
// Java Program to Take Input from User Separated by Space
// Using BufferedReader class
 
// Importing required classes
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
// Main class
// BufferedReaderTest
public class prcd {
 
    // Main driver method
    public static void main(String[] args)
        throws IOException
    {
 
        // Creating an object of BufferedReader class
        BufferedReader bi = new BufferedReader(
            new InputStreamReader(System.in));
 
        // Custom integer array of size 10
        int num[] = new int[10];
        String[] num2 = new String[2];
        // Array of string type to store input
        String[] strNums;
        String[] strNums2;
        // Display message
        System.out.println("enter string of numbers");
        // Reading input a string
        strNums = bi.readLine().split(" ");
        
        for (int i = 0; i < strNums.length; i++) {
            num[i] = Integer.parseInt(strNums[i]);
        }
        System.out.println("enter string of text");
        // Reading input a string
        strNums2 = bi.readLine().split(" ");
        
        for (int i = 0; i < strNums2.length; i++) {
            num2[i] = strNums2[i];
        }
 
        // Display message
        System.out.println("printing stored numbers ");
 
        // Printing the stored numbers using for loop
        for (int i = 0; i < strNums.length; i++) {
            System.out.println(num[i]);
        }
        System.out.println("printing stored texts ");
        for (int i = 0; i < strNums2.length; i++) {
            System.out.println(num2[i]);
        }
    }
}