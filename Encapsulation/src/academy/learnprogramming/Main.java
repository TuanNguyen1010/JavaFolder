package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	Printer dell = new Printer(40, true);

	dell.fillPrinter(50);
	dell.printPage(7);
	dell.fillPrinter(100);
	dell.checkCount();
    }
}
