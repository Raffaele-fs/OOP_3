package javabasics._16;

import java.util.Arrays;
import java.util.List;

public class _16 {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }

    /**
     * 1: Take the code below and put it into a function, read the code and see what it is.
     * <p>
     * What do you think the function does? Name the function appropriately and make sure
     * <p>
     * return the appropriate result type
     */
    private static void exercise1() {

        System.out.println("Exercise 1:");
        // Put this into a function
        double inCelsius = 30;
        double ourConversion = conversion(inCelsius);
        System.out.println(inCelsius + " Celsius is " + ourConversion + " fahrenheit");

    }

    static double conversion(double celsius) {
        return ((celsius * 9) / 5) + 32;

    }


    /**
     * 2: Create a function that processes and prints out all the names in the ArrayList
     * <p>
     * Make sure to put all the formatting code in the function, formatting:
     * 1) to Upper case
     * 2) Remove spaces at the start and the end
     * 3) If the name contains any numbers, instead of returning the name, return "Invalid"
     */
    private static void exercise2() {
        System.out.println("\nExercise 2:");
        List<String> names = Arrays.asList("Alan   ", "Alice   ", "Ant0ni0   ", "  Aziz");
        int checkValue = 2;
        for (String name : names) {
            String ourNames = list(name);


            // Call your function
        }
    }

    //                System.out.println(name.strip().toUpperCase());
    static String list(String na) {
        if (na.contains("0")) {
            System.out.println(" ⇊ this name is Invalid ⇊");
//
        }
        if (na.contains("1")) {
            System.out.println(" ⇊ this name is Invalid ⇊");
//
        }
        if (na.contains("2")) {
            System.out.println(" ⇊ this name is Invalid ⇊");
//
        }
        if (na.contains("3")) {
            System.out.println(" ⇊ this name is Invalid ⇊");
//
        }
        if (na.contains("4")) {
            System.out.println(" ⇊ this name is Invalid ⇊");
//
        }
        if (na.contains("5")) {
            System.out.println(" ⇊ this name is Invalid ⇊");
//
        }
        if (na.contains("6")) {
            System.out.println(" ⇊ this name is Invalid ⇊");
//
        }
        if (na.contains("7")) {
            System.out.println(" ⇊ this name is Invalid ⇊");
//
        }
        if (na.contains("8")) {
            System.out.println(" ⇊ this name is Invalid ⇊");
//
        }
        if (na.contains("9")) {
            System.out.println(" ⇊ this name is Invalid ⇊");
//
        } else {
            System.out.println(na.strip().toUpperCase());
        }
        return na;
    }

    /**
     * 3: Write a function that prints out every variable seen in the code. It should not return anything
     */
    private static void exercise3() {
        System.out.println("\nExercise 3:");
        {
            double myLunchPrice = 5.99;
            String lunchType = "sandwich";
            String description = "Nice big sandwich";
            int weightInGrams = 500;
            String all = "myLunchPrice= " + myLunchPrice + "lunchType =" + lunchType + "description = " + description + "weightInGrams =" + weightInGrams;
            launch(all);
        }


    }

    private static void launch(String print) {
        System.out.println(print);
    }
}
