package javainproduction._2;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Exercises {

    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4();
    }

    private List<Integer> ourNumbers = IntStream.range(1, 11).boxed().toList();
    private static void evenNNumbers(List<Integer> ourNumbers){
        ourNumbers.stream().filter(ourNumber->{
            return ourNumber%2==0;
        }).forEach(ourNumber-> System.out.println(ourNumber));
    }

    private static void oddNNumbers(List<Integer> ourNumbers){
        ourNumbers.stream().filter(ourNumber->{
            return ourNumber%2!=0;
        }).forEach(ourNumber-> System.out.println(ourNumber));
    }

    private static void upperExercise(List<String> alice){
        alice.stream().map(ali->{return ali.toUpperCase();}).forEach(ali-> System.out.println(ali));
    }

    private static void evenNNumbersMultiply(List<Integer> ourNumbers){
        List<Integer>ourNumb= ourNumbers.stream().filter(ourNumber->
            ourNumber%2==0).map(ourNumber->ourNumber*2).collect(Collectors.toList());
        System.out.println(ourNumb);
    }
    /**
     * 1:
     *
     *
     * Use filter to select only even numbers from the list 'ourNumbers'
     *
     * Use forEach to print the selected even numbers
     *
     * %
     */
    private static void exercise1() {
        System.out.println("\nExercise 1: ");
        List<Integer> ourNumbers = IntStream.range(1, 11).boxed().toList();
        evenNNumbers(ourNumbers);
    }

    /**
     * 2:
     *
     *
     * Use filter to select only odd numbers from the list 'ourNumbers'
     *
     * Use the toSet() method to collect the selected odd numbers in a Set
     *
     * Print the resulting Set
     */
    private static void exercise2() {
        System.out.println("\nExercise 2: ");
        List<Integer> ourNumbers = IntStream.range(1, 10).boxed().toList();
        oddNNumbers(ourNumbers);
    }

    /**
     * 3:
     *
     *
     * Use map to convert the strings to uppercase
     *
     * Use the toSet() method to collect the resulting uppercase strings in a Set
     *
     * Print the resulting Set
     *
     * BONUS: do so without creating any variables!
     */
    private static void exercise3() {
        System.out.println("\nExercise 3: ");
        List<String> alice = List.of("Alice", "Bob", "Charlie");
        upperExercise(alice);
    }

    /**
     * 4:
     *
     *
     * Use filter to select only even numbers from the list 'ourNumbers'
     *
     * Use map to multiply the even numbers by 2
     *
     * Use the toSet() method to collect the resulting numbers in a Set
     *
     * Print the resulting Set
     */
    private static void exercise4() {
        System.out.println("\nExercise 4");
        List<Integer> ourNumbers = IntStream.range(1, 11).boxed().toList();

        evenNNumbersMultiply(ourNumbers);
    }
}
