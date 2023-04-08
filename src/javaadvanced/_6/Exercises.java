package javaadvanced._6;

public class Exercises {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4();
        exercise5();
    }

    private enum YouCanUseClassLocalEnumsLikeThis {
        THIS_CAN_ONLY_BE_ACCESSED_IN_THIS_CLASS,
        THIS_TOO
    }

    /**
     * 1:
     * <p>
     * <p>
     * Create an enum called "Days" with the values "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY", "SUNDAY".
     * <p>
     * Loop over the values with Days.values() and print them out.
     */

    private enum Days {
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY

    }

    private static void exercise1() {
        System.out.println("\nExercise 1: ");
        // Your code here
        for (Days day : Days.values()
        ) {
            System.out.println(day);
        }
    }

    /**
     * 2:
     * <p>
     * <p>
     * Create an enum called "Seasons" with the values "SPRING", "SUMMER", "FALL", "WINTER".
     * <p>
     * Write a method that takes a Seasons value as input and returns the corresponding date range of months in that season.
     */
    private enum Season {
        SPRING,
        SUMMER,
        FALL,
        WINTER
    }

    private static void inputData(Season season) {
        switch (season) {
            case FALL -> System.out.println("23 SETTEMBRE -> 21 DICEMBRE");
            case SUMMER -> System.out.println("22 GIUGNO -> 22 SETTEMBRE");
            case SPRING -> System.out.println("21 MARZO -> 21 GIUGNO");
            case WINTER -> System.out.println("22 DICEMBRE ->20 MARZO");
        }

    }

    private static void exercise2() {
        System.out.println("\nExercise 2: ");
        inputData(Season.SUMMER);
        inputData(Season.SPRING);
        inputData(Season.FALL);
        inputData(Season.WINTER);


    }

    /**
     * 3:
     * <p>
     * <p>
     * Create an enum called "TrafficLight" with the values "RED", "YELLOW", "GREEN".
     * <p>
     * Write code that simulates the behavior of a traffic light. It should take the current state of the traffic light as input and return the next state.
     */

    private enum TrafficLight {
        RED,
        YELLOW,
        GREEN
    }

    private static TrafficLight lights(TrafficLight trafficLight) {
        TrafficLight risultato = null;
        if (trafficLight == TrafficLight.GREEN) {
            risultato = TrafficLight.YELLOW;
        }
        if (trafficLight == TrafficLight.RED) {
            risultato = TrafficLight.GREEN;
        }
        if (trafficLight == TrafficLight.YELLOW) {
            risultato = TrafficLight.RED;
        }
        return risultato;
    }

    private static void exercise3() {
        System.out.println("\nExercise 3: ");
        System.out.println(lights(TrafficLight.YELLOW));
        System.out.println(lights(TrafficLight.RED));
        System.out.println(lights(TrafficLight.GREEN));

        // Your code here
    }

    /**
     * 4:
     * <p>
     * Given the Days enum from exercise 1, add a local field called isWeekend and set it to true for the weekend days and false for the weekdays.
     * <p>
     * Write an if statement that prints weekend or weekday based on the enum
     */
    private enum Days2 {
        MONDAY(false),
        TUESDAY(false),
        WEDNESDAY(false),
        THURSDAY(false),
        FRIDAY(false),
        SATURDAY(true),
        SUNDAY(true);
        Boolean isWeekend = true;

        Days2(Boolean isWeekend) {
            this.isWeekend = isWeekend;
        }

    }

    private static void risultato(Days2 days2) {
        if (days2.isWeekend) {
            System.out.println("yes, is weekend");
        } else {
            System.out.println("no, go to work");
        }

    }

    private static void exercise4() {
        System.out.println("\nExercise 4: ");
        risultato(Days2.SATURDAY);
        // Your code here
    }

    /**
     * 5:
     * <p>
     * <p>
     * Create an enum called "Operator" with the values "ADD", "SUBTRACT", "MULTIPLY", "DIVIDE".
     * <p>
     * Write a method that takes two integers and an Operator value as input, performs the corresponding operation on the integers, and returns the result.
     */
    private enum Operator {
        ADD,
        SUBTRACT,
        MULTIPLY,
        DIVIDE

    }

    private static double operazione(double num1, double num2, Operator operator){
        double risultato=0;
        switch (operator){
            case ADD -> risultato=num1+num2;
            case DIVIDE -> risultato=num1/num2;
            case MULTIPLY -> risultato=num1*num2;
            case SUBTRACT -> risultato=num1-num2;
        }
        return risultato;
    }

    private static void exercise5() {
        System.out.println("\nExercise 5: ");
        // Your code here

        double num1 = 5;
        double num2 = 2;

        System.out.println(operazione(num1,num2,Operator.MULTIPLY));
    }

}
