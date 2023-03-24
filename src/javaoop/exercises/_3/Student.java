package javaoop.exercises._3;

public class Student {
    private String name;
    private Integer age;

    private String scuola;

    private String surname;

    private Integer valuation;

    private static double counter=0;
    Student(){

    }
    Student(String name, int age, String scuola, String surname, Integer valuation) {//il nostro costruttore che verra' richiamato nell'Exercises
        System.out.println("Constructing name and age!");
        this.name = name;
        this.age = age;
        this.surname=surname;
        this.valuation=valuation;
        this.scuola=scuola;

        System.out.println("Constructed name and age! ");
    }
    void setName(String name){
        if(name==null){
            System.out.println("valore inserito non valido");
        }else {
            this.name=name;
        }
    }
    void setAge(Integer age){
        if(age<0){
            System.out.println("valore inserito non valido");
        }else {
            this.age=age;
        }
    }

    void setScuola(String scuola){
        if(scuola==null){
            System.out.println("valore inserito non valido");
        }else {
            this.scuola=scuola;
        }
    }

    void setSurname(String surname){
        if(surname==null){
            System.out.println("valore inserito non valido");
        }else {
            this.surname=surname;
        }
    }
    void setValuation(Integer valuation){
        if(valuation<0){
            System.out.println("valore inserito non valido");
        }else {
            this.valuation=valuation;
        }
    }

    String getName(){
       return this.name;
    }

    String getScuola(){
        return this.scuola;
    }

    String getSurname(){
        return this.surname;
    }

    Integer getAge(){
        counter=counter+1;
        return this.age;
    }

    Integer getValuation(){
        return this.valuation;
    }

    public static void getCounter(){
        System.out.println(counter);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
