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

        Bank Alex = new Bank(666978, 60, "Alex","Alex@email.com", 885726368);
        System.out.println(Alex.getAccountNumber() + " name " + Alex.getCustomerName());

        VipCustomer Default = new VipCustomer();
        System.out.println(Default.getName() + " has credit limit of £" + Default.getCreditLimit() + ", with registered email " + Default.getEmail());

        VipCustomer Luke = new VipCustomer("Luke", " Luke@email.com");
        System.out.println(Luke.getName() + " has credit limit of £" + Luke.getCreditLimit() + ", with registered email " + Luke.getEmail());

        VipCustomer Sandy = new VipCustomer("Sandy", 1000, "Sandy@email.com");
        System.out.println(Sandy.getName() + " has credit limit of £" + Sandy.getCreditLimit() + ", with registered email " + Sandy.getEmail());
    }
}
