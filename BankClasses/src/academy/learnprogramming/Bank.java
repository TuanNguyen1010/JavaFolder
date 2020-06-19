package academy.learnprogramming;

public class Bank {

    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private int phoneNumber;

    public Bank() {
        this(1234, 0, "default name", "default@default.com", 10101010 );
        System.out.println("Empty Constructor has been called");
    }

    public Bank( int accountNumber, double balance, String customerName, String email, int phoneNumber) {
        System.out.println( "Bank constructor with parameters called");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public Bank(double balance, String customerName, String email, int phoneNumber) {
        this(9999999, balance, customerName, email, phoneNumber);
        System.out.println("Bank constructor without account number called");
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setCustomerName( String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public void setEmail( String email) {
        this.email = email;
    }

    public String getEmail() {
        return this.email;
    }

    public void setPhoneNumber( int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getPhoneNumber() {
        return this.phoneNumber;
    }

    public void deposit( double amount) {
        this.balance += amount;
        System.out.println("Deposit of £" + amount + " has been deposited. New balance is £" + this.balance);
    }

    public void withdraw( double amount) {
        if (this.balance > amount) {
            this.balance -= amount;
            System.out.println("£" + amount + " has been withdrawn. New balance is + £" + this.balance);
        } else {
            System.out.println("£" + amount + " is not available, withdraw failed");
        }
    }

}
