package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        Dimension dimension = new Dimension(20, 20, 5);
        Case theCase = new Case("220B", "Dell", "240", dimension);
        Resolution resolution = new Resolution(40, 40);
        Monitor theMonitor = new Monitor("27 curved screen", "Dell", 27, resolution );

        Motherboard theMotherboard = new Motherboard("Water cooled", "ASUS", 4, 2, "v2.44");

        PC thePC = new PC(theCase, theMonitor, theMotherboard);

        thePC.getTheCase().powerButtonPress();
        thePC.getMotherboard().loadProgram("Window 10");
    }
}
