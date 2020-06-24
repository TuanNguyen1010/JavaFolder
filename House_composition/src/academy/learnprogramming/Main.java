package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	Sofa theSofa = new Sofa("DFS", new Dimension(40, 60, 40), "Leather");
	Bed theBed = new Bed("Sweet Nights", "cotton", new Dimension(60, 60, 40));
	Reception theReception = new Reception(theSofa, 4, 2);
	Toilet theToilet = new Toilet(1, 1, 3);
	Room firstRoom = new Room(4, 1, theBed, 1, 3);

	House singleBedroomHouse = new House(firstRoom, theToilet, theReception);

	singleBedroomHouse.enterReception();
    }
}
