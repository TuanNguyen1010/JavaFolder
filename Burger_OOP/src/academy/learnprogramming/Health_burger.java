package academy.learnprogramming;

public class Health_burger extends Hamburger {

    private String addition_5;
    private String addition_6;

    public Health_burger(String meat, double basePrice) {
        super("Brown rye", meat, basePrice);
    }

    @Override
    public void addAddition(String extra) {
        super.addAddition(extra);
        if(addition_5 == null){
            addition_5 = extra;
            System.out.println(extra + " has been added");
        } else if (addition_6 == null) {
            addition_6 = extra;
            System.out.println(extra + " has been added");
        }
    }

    @Override
    public double additionalPriceOnBurger() {
        double total = super.additionalPriceOnBurger();
        if(addition_5 != null) {
            total += 0.50;
        }
        if(addition_6 != null) {
            total += 0.50;
        }

        return total;
    }
}
