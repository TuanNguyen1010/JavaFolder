package academy.learnprogramming;

public class Printer {
    private int tonerLevel;
    private int pagePrinted;
    private boolean isDuplex;

    public Printer(int tonerLevel, boolean isDuplex) {
        if( tonerLevel >= 0 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        }
        this.isDuplex = isDuplex;
    }

    public int fillPrinter(int amount) {
        if(amount >= 0 && amount <= 100 && (amount + tonerLevel) < 100) {
            this.tonerLevel += amount;
            System.out.println("Printer has been filled up to " + tonerLevel);
            return this.tonerLevel;
        } else {
            System.out.println("Unable to fill Printer, it will overflow");
            return -1;
        }
    }

    public int printPage(int pages) {
        if (isDuplex) {
            System.out.println("Printer is printing on Duplex");
            return pagePrinted += (pages/2 + pages % 2);
        } else {
            System.out.println("Printer is printing single page");
            return pagePrinted += pages;
        }
    }

    public void checkCount() {
        System.out.println("Printer has printed " + pagePrinted + " pages");
    }
}
