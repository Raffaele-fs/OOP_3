package javaoopadvanced._1;

public class Exercises {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }

    /**
     * 1:
     *
     *
     * Create a class called "Dog" that extends the Animal class.
     *
     * Add a new field called "breed" to the Dog class.
     *
     * Write a constructor for the Dog class that takes in a breed, height, and weight as parameters, and passes the height and weight to the superclass constructor.
     *
     * Write getters and setters for the breed field.
     */
    private static void exercise1() {
        System.out.println("\nExercise 1: ");
        Dog dog=new Dog(1,20,"pinscher");
        System.out.println("breed= "+dog.getBreed()+", height= "+dog.getHeight()+", weight= "+dog.getWeight());
        // Your code here
    }

    /**
     * 2:
     *
     *
     * Create new classes called "Fish" and "Bird" that extends the Animal class.
     *
     * Add a new field called "species" to the Fish class and "wingSpan" to the Bird class.
     *
     * Also create constructors, getters and setters
     *
     */
    private static void exercise2() {
        System.out.println("\nExercise 2: ");
        Fish fish=new Fish(0.5,0.3,"pagliaccio");
        Bird bird=new Bird(0.4,0.3,0.7);
        System.out.println("species= "+ fish.getSpecies()+", height= "+fish.getHeight()+", weight= "+fish.getWeight());
        System.out.println("wingspan= "+bird.getWingSpan()+", height= "+bird.getHeight()+", weight= "+bird.getWeight());
        // Your code here
    }


    /**
     * 3:
     *
     * In the dog class create a method called runSpeedMetersPerSecond() that returns the Dog's Height * 2
     * In the fish class create a method called swimSpeedMetersPerSecond() that returns the Fish's Weight * 2
     * In the bird class create a method called flySpeedMetersPerSecond() that returns the Bird's Wingspan * 4
     *
     * Create instances of each Animal: Dog, Fish and Bird. Fill the constructors with values of your choice
     * and print out which of the animals has the fastest movement speed in MetersPerSecond
     */
    private static void exercise3() {
        System.out.println("\nExercise 3: ");
        Animal animal=new Animal();
        Fish fish=new Fish(0.5,0.3,"pagliaccio");
        Bird bird=new Bird(0.4,0.3,0.7);
        Dog dog=new Dog(1,20,"pinscher");

        double dogSpeed=dog.runSpeedMetersPerSecond();
        double birdSpeed=bird.flySpeedMetersPerSecond();
        double fishSpeed=fish.swimSpeedMetersPerSecond();

        double fastestAnimal=animal.fastestAnimal(dogSpeed, animal.fastestAnimal(birdSpeed,fishSpeed));

        if (fastestAnimal==dogSpeed){
            System.out.println("the dog is the fastest animal with="+ fastestAnimal);
        } else if (fastestAnimal==birdSpeed) {
            System.out.println("the bird is the fastest animal with="+ fastestAnimal);
        }else {
            System.out.println("the fish is the fastest animal with="+ fastestAnimal);
        }
        // Your code here

    }
}
