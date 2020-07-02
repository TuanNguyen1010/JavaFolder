package academy.learnprogramming;

public class Basic_burger {

    private String bunType;
    private String meat;
    private String addition_1;
    private String addition_2;
    private String addition_3;
    private String addition_4;

    public Basic_burger(String bunType, String meat, String addition_1) {
        this(bunType, meat, addition_1, null, null, null);
    }

    public Basic_burger(String bunType, String meat, String addition_1, String addition_2) {
        this(bunType, meat, addition_1, addition_2, null, null);
    }

    public Basic_burger(String bunType, String meat, String addition_1, String addition_2, String addition_3) {
        this( bunType, meat, addition_1, addition_2, addition_3, null);
    }

    public Basic_burger(String bunType, String meat, String addition_1, String addition_2, String addition_3, String addition_4) {
        this.bunType = bunType;
        this.meat = meat;
        this.addition_1 = addition_1;
        this.addition_2 = addition_2;
        this.addition_3 = addition_3;
        this.addition_4 = addition_4;
    }
}
