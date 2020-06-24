package academy.learnprogramming;

public class Room {
    private int window;
    private int door;
    private Bed bed;
    private int desk;
    private int wardrobe;

    public Room(int window, int door, Bed bed, int desk, int wardrobe) {
        this.window = window;
        this.door = door;
        this.bed = bed;
        this.desk = desk;
        this.wardrobe = wardrobe;
    }

    public int getWindow() {
        return window;
    }

    public int getDoor() {
        return door;
    }

    public Bed getBed() {
        return bed;
    }

    public int getDesk() {
        return desk;
    }

    public int getWardrobe() {
        return wardrobe;
    }
}
