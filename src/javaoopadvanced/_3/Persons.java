package javaoopadvanced._3;

public class Persons {

    private String name;

    private int age;

    private String address;

    public Persons(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Persons" +
                "name='" + name + '\n' +
                ", age=" + age +'\n'+
                ", address='" + address + '\n';

    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
