package javabasics._12;

import java.util.Locale;

public class _12 {
    public static void main(String[] args) {
        System.out.println("Exercise 1 - String score:");
        exercise1("Java runs on over 2 billion devices", 15);
        exercise1("+31 2 58765446", 48);
        exercise1("hello world", 42);

        System.out.println("\nExercise 2 - Meal score:");
        exercise2("sandwich", 2.5, 12.5);
        exercise2("soup", 10, 30);
        exercise2("soup", 1, 5);
    }

    /**
     * 1: We are going to 'score' strings, given a string you are to calculate its score based on the following factors.
     * <p>
     * Start with a base score of the string's length, this is the starting score. Use .length() on a string
     * <p>
     * The Maximum starting score is 20, if a score is over 20. Set it to 20.
     * <p>
     * If the string contains the letter a, -5 from the score
     * <p>
     * If the string is all lowercase, add 10 to the score.
     * <p>
     * If the score is now over 20, times it by 2
     */
    public static double exercise1(String text, double expectedScore) {
        double yourScore = 0;
        String controlString = text.toLowerCase();

        yourScore = text.length();
        if (yourScore > 20) {
            yourScore = 20;
        }
        if (text.contains("a")) {
            yourScore -= 5;
        }
        if (text.equals(controlString)) {
            yourScore += 10;
        }
        if (yourScore > 20) {
            yourScore *= 2;
        }
        
        System.out.print("Expected score=" + expectedScore + ", actual score=" + yourScore);
        if (expectedScore != yourScore) {
            System.out.println(" - Failed: Wrong score for '" + text + "'");
        } else {
            System.out.println(" - Success!");
        }


        return yourScore;
    }

    /**
     * 2: We are going to 'score' a meal, given a string of mealType you are to calculate its score based on the following factors.
     * <p>
     * For the meal type sandwich calculate score like the following: 5 * weight
     * <p>
     * For the meal type of soup calculate score like the following 3 * weight
     * <p>
     * The minimum score should be 5, if a score is lower than this increase it to 5
     */
    public static double exercise2(String mealType, double weight, double expectedScore) {
        double yourMealScore = 0;

        //(mealType"sandwich", weight=2.5, expected score 12.5);

        switch (mealType) {
            case "sandwich" -> yourMealScore = 5 * weight;
            case "soup" -> yourMealScore = 3 * weight;
            default -> System.out.println("wrong input");
        }

        // The minimum score should be 5, if a score is lower than this increase it to 5
        if (yourMealScore < 5) {
            yourMealScore = 5;
        }


        // End it here

        System.out.print("Expected score=" + expectedScore + ", actual score=" + yourMealScore);
        if (expectedScore != yourMealScore) {
            System.out.println(" - Failed: Wrong score for '" + mealType + "'");
        } else {
            System.out.println(" - Success!");
        }

        return yourMealScore;
    }
}
