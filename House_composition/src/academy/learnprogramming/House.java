package academy.learnprogramming;

public class House {
    private Room theRoom;
    private Toilet theToilet;
    private Reception theReception;

    public House(Room theRoom, Toilet theToilet, Reception theReception) {
        this.theRoom = theRoom;
        this.theToilet = theToilet;
        this.theReception = theReception;
    }

    public void enterReception() {
        theReception.checkReception();
    }
}
