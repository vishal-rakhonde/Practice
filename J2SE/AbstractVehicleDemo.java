abstract class Vehicle {
    abstract void startEngine(); // Must be implemented by subclasses

    void fuelType() {
        System.out.println("Default fuel: Petrol");
    }
}

class Car extends Vehicle {
    @Override
    void startEngine() {
        System.out.println("Car engine started");
    }
}

public class AbstractVehicleDemo {
    public static void main(String[] args) {
        Vehicle myCar = new Car();
        myCar.startEngine();
        myCar.fuelType();
    }
}