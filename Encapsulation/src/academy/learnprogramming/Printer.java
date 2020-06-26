package academy.learnprogramming;

public class Printer {
    private int tonerLevel;
    private int pagePrinted;
    private boolean isDuplex;

    public Printer(int tonerLevel, boolean isDuplex) {
        if( tonerLevel > 0 && tonerLevel < 100) {
            this.tonerLevel = tonerLevel;
        }
        this.isDuplex = isDuplex;
    }

    public void fillPrinter(int amount) {
        if( (amount + tonerLevel) < 100) {
            tonerLevel += amount;
            System.out.println("Printer has been filled up to " + tonerLevel);
        } else {
            System.out.println("Unable to fill Printer, it will overflow");
        }
    }

    public void printPage() {
        pagePrinted += 1;
        System.out.println("Printer has printed " + pagePrinted + " pages");
    }
}
