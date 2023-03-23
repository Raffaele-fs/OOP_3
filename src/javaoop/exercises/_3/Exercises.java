package javaoop.exercises._3;

public class Exercises {
    public static void main(String[] args) {
        exercise1();
        exercise2();
    }

    /**
     * 1: Copy over the student class
     * <p>
     * Make sure there are 5 fields inside, if they are not simply create some more.
     * make every field private first.
     * <p>
     * Then create getters and setters for each of these 5 fields.
     * <p>
     * Once ready use all 5 below
     */
    private static void exercise1() {
        System.out.println("Exercise 1:");
        String name = "raffaele";
        Integer age = 20;

        String scuola = "java";

        String surname = "peperino";

        Integer valuation = 10;
        Student student = new Student(name, age, scuola, surname, valuation);

        System.out.println(student.getName());
        System.out.println(student.getAge());
        System.out.println(student.getScuola());
        System.out.println(student.getSurname());
        System.out.println(student.getValuation());

        // Write and use your 5 getters and setters!
    }

    /**
     * 2: Create 3 setter constraints for the student class
     * <p>
     * Think about what reasonably constraints are?
     * <p>
     * Should a student be able to be a negative age?
     * <p>
     * Create a counter for one of the getters, try to think about
     * what other code could be inside a getter? Why not write it?
     */
    private static void exercise2() {
        System.out.println("\nExercise 2:");

        String name = null;

        Integer age = -1;

        String scuola = null;

        String surname = null;

        Integer valuation =-2;

        Student student = new Student(name, age, scuola, surname, valuation);

        student.setName(name);

        student.setAge(age);
        student.getAge();
        student.getAge();
        student.getAge();

        student.setScuola(scuola);

        student.setScuola(scuola);

        student.setValuation(valuation);

        Student.getCounter();


        //Write your code here
    }

}
