package javaoop.exercises._2;

public class Student {
    String name;
    int age;

    Student(String name, int age) {//il nostro costruttore che verra' richiamato nell'Exercises
        System.out.println("Constructing name and age!");
        this.name = name;
        this.age = age;
        System.out.println("Constructed name and age! "+name+" "+age);
    }
//dichiariamo tutti i possibili costruttori con i loro output
    Student() {
        System.out.println("Constructing!");
        System.out.println("Constructed!");
    }

    Student(String name) {
        System.out.println("Constructing only name!");
        this.name = name;

        System.out.println("Constructed only name! "+name);
    }

    Student(int age) {
        System.out.println("Constructing only age!");
        this.age = age;
        System.out.println("Constructed only age! "+age);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
