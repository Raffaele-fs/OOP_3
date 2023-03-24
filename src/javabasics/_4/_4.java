package javabasics._4;

public class _4 {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }

    /**
     * 1: Store your age in an appropriate variable, print it out in
     *    one line using the "+" in your print statement. Only use 1 print statement
     */
    private static void exercise1() {
        System.out.println("Exercise 1:");
        //creiamo una variabile per l'eta'
        int age = 20;
        //output della nostra eta'
        System.out.println("my age is "+ age );
    }

    /**
     * 2: Store your first name initial (i.e. Jane -> J) in a variable, your age in another variable.
     *
     *    And then print them out on the same line using the following idea
     *
     *    System.out.println("My Age=" + myAge +", my initial=" + myInitial);
     */
    private static void exercise2() {
        System.out.println("\nExercise 2:");
//        creiamo una variabile char per l'iniziale del mio nomo
        char myInitial= 'R';
        //        creiamo una variabile int per l'eta'
        int myAge=20;
//        output della mia eta' e della mia iniziale
        System.out.println("My Age=" + myAge +", my initial=" + myInitial);    }

    /**
     * 3: Write comments above each line of code, describing what the line of code is doing
     */
    private static void exercise3() {
        System.out.println("\nExercise 3:");
//               creiamo una variabile boolean per confermare con "false" che non abbiamo mangiato
        boolean hasEatenLunch = false;
//     creiamo una variabile double per dare il valore al cibo
        double lunchCost = 5.99;
//     mettiamo in output il valore booleano e il valore double
        System.out.println("Lunch cost=" + lunchCost);
        System.out.println("Has Eaten lunch=" + hasEatenLunch);
    }
}
