package academy.learnprogramming;

public class Fish extends Animal {

    private int tail;
    private int gills;
    private int eyes;
    private int fins;

    public Fish(String name, int size, int weight, int tail, int gills, int eyes, int fins) {
        super(name, 1, 1, size, weight);
        this.tail = tail;
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }

    private void rest() {

    }

    private void moveMuscles() {

    }

    private void moveBackFins() {

    }

    private void swim(int speed) {
        moveMuscles();
        moveBackFins();
        System.out.println("fish.swim() has been called");
        move(speed);
    }
}
