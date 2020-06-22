package academy.learnprogramming;

public class Vehicle {

    private String name;
    private int engine;
    private String colour;
    private int seats;
    private int currentDirection;
    private int currentVelocity;

    public Vehicle(String name, int engine, String colour, int seats) {
        this.name = name;
        this.engine = engine;
        this.colour = colour;
        this.seats = seats;
        this.currentDirection = 0;
        this.currentVelocity = 0;
    }

    public void handSteering  (int direction) {
        this.currentDirection += direction;
        System.out.println("Vehicle.handSteering() called");
    }

    public void moving(int speed, int direction) {
        this.currentDirection = direction;
        this.currentVelocity = speed;
        System.out.println("Vehicle.moving() called");
        System.out.println("Vehicle moving at " + currentVelocity + " MPH in " + currentDirection + " direction");
    }

    public void stop() {
        this.currentVelocity = 0;
    }

    public int getEngine() {
        return engine;
    }

    public String getColour() {
        return colour;
    }

    public int getSeats() {
        return seats;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }
}
