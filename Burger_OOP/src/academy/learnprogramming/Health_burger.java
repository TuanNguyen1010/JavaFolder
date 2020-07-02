package academy.learnprogramming;

public class Health_burger extends Hamburger {

    private String addition_5;
    private String addition_6;

    public Health_burger(String meat, String addition_1, String addition_2, String addition_3,
                         String addition_4, String addition_5, String addition_6) {
        super("Brown rye", meat, addition_1, addition_2, addition_3, addition_4);
        this.addition_5 = addition_5;
        this.addition_6 = addition_6;
    }
}
