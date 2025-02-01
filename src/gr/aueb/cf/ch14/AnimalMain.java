package gr.aueb.cf.ch14;

public class AnimalMain {

    public static void main(String[] args) {
        Dog dog = new Dog("Tommy", 5, "Golden Retriever");
        dog.makeSound();
        dog.searchForFood();

        doMakeSound(dog); //at runtime in order to get "Woof" and not "make sound"
    }

    public static void doMakeSound (Animal animal) {
        animal.makeSound();
    }
}
