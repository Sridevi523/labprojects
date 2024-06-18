package Protected;

public class Passenger {
    protected String name;
    protected int age;

    public Passenger(String name, int age) {
        this.name = name;
        this.age = age;
    }

    protected void displayDetails() {
        System.out.println("Passenger: " + name + ", Age: " + age);
    }
}