package academy.learnprogramming;

class Hamburger {

    private String bunType;
    private String meat;
    private String addition_1;
    private String addition_2;
    private String addition_3;
    private String addition_4;
    private double basePrice;


    public Hamburger(String bunType, String meat, double basePrice) {
        this.bunType = bunType;
        this.meat = meat;
        this.basePrice = basePrice;
    }

    private void setAddition_1(String item){
        this.addition_1 = item;
    }

    private void setAddition_2(String item){
        this.addition_2 = item;
    }

    private void setAddition_3(String item){
        this.addition_3 = item;
    }

    private void setAddition_4(String item){
        this.addition_4 = item;
    }
    public void addAddition(String extra) {
        if(addition_1 == null){
            setAddition_1(extra);
            System.out.println(extra + " has been added");
        } else if(addition_2 == null) {
            setAddition_2(extra);
            System.out.println(extra + " has been added");
        } else if(addition_3 == null){
            setAddition_3(extra);
            System.out.println(extra + " has been added");
        } else if(addition_4 == null) {
            setAddition_4(extra);
            System.out.println(extra + " has been added");
        }
    }

    public double additionalPriceOnBurger() {
        double additionsPrice = 0;
        if(addition_1 != null){
            additionsPrice += 0.5;
        }
        if(addition_2 != null){
            additionsPrice += 0.5;
        }
        if(addition_3 != null){
            additionsPrice += 0.5;
        }
        if(addition_4 != null){
            additionsPrice += 0.5;
        }
        return additionsPrice;
    }

    public double totalPrice() {
        return additionalPriceOnBurger() + basePrice;
    }
}

