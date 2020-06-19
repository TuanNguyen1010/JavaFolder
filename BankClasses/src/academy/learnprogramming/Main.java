package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        Bank Danny = new Bank();
        Danny.setAccountNumber(12345678);
        Danny.setBalance(5);
        Danny.setCustomerName("Danny");
        Danny.setEmail("Danny@Hotmail.com");
        Danny.setPhoneNumber(888888888);

        System.out.println("Name is " + Danny.getCustomerName());
        System.out.println("Account number is " + Danny.getAccountNumber());
        System.out.println("Current Balance is " + Danny.getBalance());
        System.out.println("Email address is " + Danny.getEmail());
        System.out.println("Phone Number is " + Danny.getPhoneNumber());

        Danny.deposit(100);
        Danny.withdraw(1000);
        Danny.withdraw(28);

        Bank John = new Bank( 80, "John", "John@email.com", 160800298);
        System.out.println(John.getAccountNumber() + " name " + John.getCustomerName());
    }
}
