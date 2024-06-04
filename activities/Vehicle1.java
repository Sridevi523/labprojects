 class Vehicle {
    String brand;
    String model;
    int year;
    
    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public void drive() {
        System.out.println(brand + " " + model + " " + year + " is launched today");
    }
}

class Car extends Vehicle {
    String color;
    
    Car(String brand, String model, int year, String color) {
        super(brand, model, year);
        this.color = color;
    }
    
    void honk() {
        System.out.println("The " + color + " " + brand + " " + model + " " + year + " is driving");
    }
}

public class Vehicle1 {  
    public static void main(String[] args) {
        Car c1 = new Car("benz", "super", 2023, "red");
        Car c2 = new Car("maruthi", "super", 2024, "blue");

        c1.drive();
        c1.honk();
    }
}