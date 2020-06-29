package academy.learnprogramming;

class Car {
    public String name;
    private int cylinder;
    private boolean isEngine;
    private int wheels;

    public Car(String name, int cylinder) {
        this.name = name;
        this.cylinder = cylinder;
        this.isEngine = true;
        this.wheels = 4;
    }

    public void startEngine() {
        System.out.println("engine has started");
    }

    public void accelerate() {
        System.out.println("Car is accelerating");
    }

    public void brake() {
        System.out.println("Car is braking");
    }
}

class Guilia extends Car{
    public Guilia() {
        super("Gulia",  6);
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
    public Beamer() {
        super("3-Series", 4);
    }

    @Override
    public void startEngine() {
        System.out.println("3-Series is starting");
    }

    @Override
    public void accelerate() {
        System.out.println("3-Series is accelerating");
    }

    @Override
    public void brake() {
        System.out.println("3-Series is braking");
    }
}

class Lexus extends Car{
    public Lexus() {
        super("RX450", 4);
    }

    @Override
    public void startEngine() {
        System.out.println("RX450 is starting");
    }

    @Override
    public void accelerate() {
        System.out.println("RX450 is accelerating");
    }

    @Override
    public void brake() {
        System.out.println("RX450 is braking");
    }
}

public class Main {

    public static void main(String[] args) {
        for(int i = 1; i < 5; i ++ ) {
            Car myCar = randomCar();
            System.out.println("You have chosen " + myCar.name +
                    ". You turn on the ignition and ");
            myCar.startEngine();
        }
    }

    public static Car randomCar() {
        int randomNumber = ((int)(Math.random()*3)+1);
        System.out.println("Random number  = " + randomNumber);
        switch(randomNumber) {
            case 1:
                return new Guilia();
            case 2:
                return new Beamer();
            case 3:
                return new Lexus();
        }
        return null;
    }
}
