package academy.learnprogramming;

public class VipCustomer {

    private String name;
    private double creditLimit;
    private String email;

    public VipCustomer(){
        this("default name", 0, "defaultEmail@email.com");
    }

    public VipCustomer(String name, String email) {
        this(name, 0, email);
    }

    public VipCustomer(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
