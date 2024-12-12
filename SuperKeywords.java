class Vehicle{

    String fuelType;
    int maxSpeed;

    public Vehicle(String fuelType, int maxSpeed) {
        this.fuelType = fuelType;
        this.maxSpeed = maxSpeed;
    }

    public void displayInfo() {
        System.out.println("Fuel Type: " + fuelType + ", Max Speed: " + maxSpeed + " km/h");
    }
}

class Car extends Vehicle{

    boolean isElectric;
    public Car(String fuelType, int maxSpeed, boolean isElectric) {
        super(fuelType, maxSpeed);
        this.isElectric = isElectric;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Is Electric: " + (isElectric ? "Yes" : "No"));
    }

}

class Bike extends Vehicle{

    String bikeType;

    public Bike(String fuelType, int maxSpeed, String bikeType) {
        super(fuelType, maxSpeed);
        this.bikeType = bikeType;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Bike Type: " + bikeType);
    }
    
}
public class SuperKeywords {
    
public static void main(String[] args) {
    

    Car car = new Car("Electric", 250, true);
        Bike bike = new Bike("Petrol", 180, "Sport");

        System.out.println("Car Info:");
        car.displayInfo();

        System.out.println("\nBike Info:");
        bike.displayInfo();

  }
}

//super is used to call methods or constructors from the parent class within non-static methods.
