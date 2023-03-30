package javaadvanced._3;

import java.util.*;

public class Exercises {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }


     /**
     * 1: Complete the function that removes any duplicates by using a set
     *    then recreates a new list of unique items
      *
      *   You can reset a list by using list = new ArrayList<>();
     */
    private static void exercise1() {
        List<String> list = new ArrayList<>(Arrays.asList("a", "b", "c", "a", "b", "c", "a", "b", "c"));
        Set<String>setList= new HashSet<>();
        setList.addAll(list);
        list = new ArrayList<>();
        list.addAll(setList);
        //senza questo metodo, potevamo fare un "for each" che andava a cambiare ogni elemento del nostro array

        // Your code here

        if (list.size() == 3) {
            System.out.println("Exercise 1: Success");
        } else {
            System.out.println("Exercise 1: Failed");
        }
    }

    /**
     * 2: Write a method that takes a List of Strings or a Set of Strings and returns a Set of Strings.
     *    the method should take a collection as a parameter
     */
    private static void exercise2() {
        System.out.println("Exercise 2:");
        // Your code here
        List<String> list = Arrays.asList("apple", "banana", "apple", "orange", "kiwi", "banana");
        Set<String> set = Set.of("apple", "banana");
        System.out.println(toSet(set));
        System.out.println(toSet(list));
    }

    // Write your method for exercise 2 here
        private static Set<String> toSet(Collection<String> collection){
            Set<String> sette = new HashSet<>();
            sette.addAll(collection);
            return sette;
        }


    /**
     * 3: Follow the instructions in the comments
     */
    private static void exercise3() {
        System.out.println("Exercise 3:");
        String str = "the fox and the lazy dog saw another fox with another not lazy dog";
        List<String> words = Arrays.stream(str.split(" ")).toList();
        Map<String, Integer> wordCount = new HashMap<>();
        for(String word : words){
            wordCount.put(word,0);
        }
        for (String word:words) {
            for (Map.Entry<String, Integer> entry : wordCount.entrySet()){
                if(entry.getKey().equals(word)){
                    entry.setValue((entry.getValue()+1));
                }
            }
        }
        System.out.println(wordCount);
        // Write code to count the number of occurrences of each word in the String `words`
        // and store the counts in the Map `wordCount`, note you will need to first get the previous value
        // from the Map and then increment it by 1, if no previous value exists, use 0 as the previous value.

        // Your code here
    }

    /**
     * 4: Answer the following questions
     *
     *    What is the best data structure to use in the following scenarios, chose either a List, Set or Map
     *    and explain why you chose that data structure.
     *
     *    1 - You want to store the students in order of their arrival
     *    Answer: list perche' e' una lista che aggiunge gli studenti in ordnine di arrivo.
     *
     *    2 - You want to store the students in a class and their grades
     *    Answer: list perche' ci possono essere studenti con lo stesso nome, la stessa classe e lo stesso voto
     *
     *    3 - You want to store the countries in the world in order of age
     *    Answer: map perché con map possiamo memorizzare la parola chiave come world e il valore come age.
     *
     *    4 - You want to store the products available for purchase in an online store, along with their corresponding prices.
     *    Answer: map perché con map possiamo memorizzare la parola chiave come products e il valore come price.
     *
     *    5 - You want to store the employees at a company in the order you added them
     *    Answer: list perche' e' una lista che aggiunge gli lavoratori in ordnine di arrivo.
     *
     *    6 - You want to store the cities in a particular state, along with their populations.
     *    Answer: map perché con map possiamo memorizzare la parola chiave come state e il valore come populations.
     *
     *    7 - You want to store the books in a library, along with their authors and publication dates.
     *    Answer: set perche' non possono esserci gli stessi dati uguali.
     *
     *    8 - You want to store the courses offered at a university, along with the professors teaching each course.
     *    Answer: map perché con map possiamo memorizzare la parola chiave come courses e il valore come professors.
     *
     *    9 - You want to store the movies in a movie rental store, along with their ratings and release dates.
     *    Answer: set perche' non possono esserci gli stessi dati uguali.
     *
     *    10 - You want to store the flights available for booking on an airline, along with their destinations and departure times.
     *    Answer: set perche' non possono esserci gli stessi dati uguali.
     *
     *    11 - You want to store the articles on a news website, along with their titles and publication dates.
     *    Answer: set perche' non possono esserci gli stessi dati uguali.
     *
     *    12 - You want to store the songs in a music streaming service, along with their artists and album names.
     *    Answer: set perche' non possono esserci gli stessi dati uguali.
     */

}
