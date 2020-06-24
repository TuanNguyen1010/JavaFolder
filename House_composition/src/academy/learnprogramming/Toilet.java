package academy.learnprogramming;

public class Toilet {
    private int bathtub;
    private int sink;
    private int tap;

    public Toilet(int bathtub, int sink, int tap) {
        this.bathtub = bathtub;
        this.sink = sink;
        this.tap = tap;
    }

    public int getBathtub() {
        return bathtub;
    }

    public int getSink() {
        return sink;
    }

    public int getTap() {
        return tap;
    }
}
