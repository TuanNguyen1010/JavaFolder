package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What year were you born");
        int yearOfBirth = scanner.nextInt();
        scanner.nextLine(); // handle next line enter key
        System.out.println("Enter your name");
        String name = scanner.nextLine();
        int age = 2020 - yearOfBirth;
        System.out.println("Your name is " + name);
        System.out.println("You are " + age + "years old");

        scanner.close();
    }
}