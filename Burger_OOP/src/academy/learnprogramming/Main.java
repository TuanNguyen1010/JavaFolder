package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
//	    Hamburger basic = new Hamburger("Brioche", "Beef", 4.50);
//	    System.out.println("Base Burger");
//        basic.addAddition("Lettuce");
//        basic.addAddition("Lettuce");
//        basic.addAddition("Lettuce");
//        basic.addAddition("Lettuce");
//        basic.addAddition("Lettuce");
//        System.out.println(basic.additionalPriceOnBurger());
//        System.out.println(basic.totalPrice());

        Health_burger customer = new Health_burger("Chicken", 6.50);
        System.out.println("Custom Health Burger");
        customer.addAddition("Lettuce");
        customer.addAddition("Lettuce");
        customer.addAddition("Lettuce");
        customer.addAddition("Lettuce");
        customer.addAddition("Lettuce");
        System.out.println(customer.totalPrice());


    }
}
