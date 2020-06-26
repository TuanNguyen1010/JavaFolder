package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	Printer dell = new Printer(40, true);

	dell.fillPrinter(50);
	dell.printPage();
	dell.fillPrinter(100);
    }
}
