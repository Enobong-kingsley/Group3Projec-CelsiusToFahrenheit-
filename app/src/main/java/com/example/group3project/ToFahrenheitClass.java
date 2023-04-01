package com.example.group3project;
//The first thing to do is to import your scanner class inorder to read the user input.
import java.util.Scanner;

public class ToFahrenheitClass {
    // Now inside the class you create the "main" function. This would be the entry point to your java application on compile time
    public static void main(String[] args) {
        // after that we can now create an instance of our scanner class this way we can access the properties of the class if we want
        Scanner input = new Scanner(System.in);
        //Now lets print out a simple prompt message for the user
        System.out.print("Please enter temperature in Celsius: ");
        //the next line of code just creates a variable called celsius and calls the scanner method nextDouble
        //NOTE: the nextDouble method scans the next token of the input as a Double integer type
        double celsius = input.nextDouble();
        // Conversion formula: now lets do the logic by writing the formula for converting celsius to fahrenheit
        double fahrenheit = (celsius * 9/5) + 32;
        //Finally we print the input of the user(Celsius) plus the degree of fahrenheit
        System.out.println(celsius + " degree Celsius is equal to " + fahrenheit + " degree Fahrenheit.");
    }
}
