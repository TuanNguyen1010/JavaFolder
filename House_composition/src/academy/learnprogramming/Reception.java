package academy.learnprogramming;

public class Reception {
    private Sofa theSofa;
    private int window;
    private int door;

    public Reception(Sofa theSofa, int window, int door) {
        this.theSofa = theSofa;
        this.window = window;
        this.door = door;
    }

    public void checkReception() {
        System.out.println("In Reception and has " + window + " windows");
    }
}
