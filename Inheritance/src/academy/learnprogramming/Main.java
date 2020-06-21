package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal("chicken", 1, 1, 10, 5);
        System.out.println(animal.getName() + " has " + animal.getBrain() + " brain and " + animal.getBody() + " body");

        Dog dog = new Dog("Yorkie", 20, 100, 2, 4, 1, 26, "Long fur");
        System.out.println(dog.getName() + " has " + dog.getBody() + " body and weights " + dog.getWeight() + " KG");
        dog.eat();
        dog.walk();
        dog.run();

        Fish fish = new Fish("goldfish", 5, 2, 1, 2, 2, 2);
        System.out.println(fish.getName() + " weights " + fish.getWeight() + " KG");
    }
}
