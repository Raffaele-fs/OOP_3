package javainproduction._1;

import javaoopadvanced._3.Persons;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Random;

public class Exercises {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }

    /**
     * 1:
     * <p>
     * <p>
     * In the main method, create a variable x as a random number between 0-100 using Math.random() * 100;
     * <p>
     * Use a ternary operator to check if x is greater than or equal to 50. If it is, print "x is greater than or equal to 50". If it's not, print "x is less than 50".
     * <p>
     * Experiment with different values of x and observe the output
     */
    private static void exercise1() {
        System.out.println("\nExercise 1: ");
        Main main = new Main();
        main.print();
    }

    /**
     * 2:
     * <p>
     * <p>
     * Create a record called "Person" with fields for name, age and address.
     * <p>
     * Add a toString method to Person to print out the data in a different format
     * <p>
     * Print the record to the console
     */
    private static void exercise2() {
        System.out.println("\nExercise 2: ");
        Person person=new Person("mario",22,"via bella");
        System.out.println(person);
    }

    /**
     * 3:
     * <p>
     * <p>
     * In the main method, create a BigInteger variable with a large value.
     * <p>
     * Create a BigDecimal variable with a large value
     * <p>
     * Divide the BigInteger by 3 using the divide method and assign the result to a new BigInteger variable
     * <p>
     * Divide the BigDecimal by Math.PI using the divide method and assign the result to a new BigDecimal variable
     * <p>
     * Print the results
     */
    private static void exercise3() {
        System.out.println("\nExercise 3: ");
        BigInteger bigInteger=new BigInteger("1234567890987654321");
        BigDecimal bigDecimal=new BigDecimal(3423253.021);
        System.out.println(bigInteger.divide(BigInteger.valueOf(3)));
        System.out.println(bigDecimal.divide(BigDecimal.valueOf(Math.PI)));

    }

}
