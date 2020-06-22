package academy.learnprogramming;

public class Car extends Vehicle {

    private int doors;
    private String bodyType;
    private int wheels;
    private String fuelType;
    private int gears;
    private boolean isManual;
    private int currentGear;

    public Car(String name, int engine, String colour, int seats, int doors, String bodyType, int wheels, String fuelType, int gears, boolean isManual) {
        super(name, engine, colour, seats);
        this.doors = doors;
        this.bodyType = bodyType;
        this.wheels = wheels;
        this.fuelType = fuelType;
        this.gears = gears;
        this.isManual = isManual;
        this.currentGear = 0;
    }

    public void changeGear(int currentGear) {
        this.currentGear = currentGear;
        System.out.println("Car.setCurrentGear() called");
        System.out.println("Changed to " + this.currentGear + " gear");
    }

    public void changeVelocity(int speed, int direction) {
        moving(speed, direction);
        System.out.println("Car.changeVelocity() called");
    }

    public void changingGears() {
        System.out.println("Car.changingGears() called");
    }

}
