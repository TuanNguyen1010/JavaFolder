package academy.learnprogramming;

class Car {
    private String name;
    private int cylinder;
    private boolean isEngine;
    private int wheels;

    public Car(String name, int cylinder) {
        this.name = name;
        this.cylinder = cylinder;
        this.isEngine = true;
        this.wheels = 4;
    }

    public String getName() {
        return name;
    }

    public void startEngine() {
        System.out.println("Car engine has started");
    }

    public void accelerate() {
        System.out.println("Car is accelerating");
    }

    public void brake() {
        System.out.println("Car is braking");
    }
}

class Alfa extends Car{

    public Alfa(String name, int cylinder) {
        super(name, cylinder);
    }

    @Override
    public void startEngine() {
        System.out.println("Gulia is starting");
    }

    @Override
    public void accelerate() {
        System.out.println("Gulia is accelerating");
    }

    @Override
    public void brake() {
        System.out.println("Gulia is braking");
    }
}

class Beamer extends Car{
    public Beamer(String name, int cylinder) {
        super(name, cylinder);
    }

    @Override
    public void startEngine() {
        System.out.println("Beamer is starting");
    }

    @Override
    public void accelerate() {
        System.out.println("Beamer is accelerating");
    }

    @Override
    public void brake() {
        System.out.println("Beamer is braking");
    }
}

class Lexus extends Car{
    public Lexus(String name, int cylinder) {
        super(name, cylinder);
    }

    @Override
    public void startEngine() {
        System.out.println("Lexus is starting");
    }

    @Override
    public void accelerate() {
        System.out.println("Lexus is accelerating");
    }

    @Override
    public void brake() {
        System.out.println("Lexus is braking");
    }
}

public class Main {

    public static void main(String[] args) {

        Car newCar = new Car("Basic car", 2);
        System.out.println(newCar.getName());
        newCar.startEngine();

        System.out.println("Loop over random cars : ");
        for(int i = 1; i < 5; i ++ ) {
            Car myCar = randomCar();
            System.out.println("You have chosen " + myCar.getName() +
                    ". You turn on the ignition and ");
            myCar.startEngine();
        }
    }

    public static Car randomCar() {
        int randomNumber = ((int)(Math.random()*3)+1);
        System.out.println("Random number  = " + randomNumber);
        switch(randomNumber) {
            case 1:
                return new Alfa("Gulia", 6);
            case 2:
                return new Beamer("3-Series", 4);
            case 3:
                return new Lexus("LX450", 4);
        }
        return null;
    }
}
