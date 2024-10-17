package AnimalApp;

public class Cow extends Animal {

    // Constructor to initialize the animal name
    public Cow(String animalName) {
        super(animalName);
    }

    // Overriding the animalSound method to print the cow sound
    @Override
    public void animalSound() {
        System.out.println(animalName + " moos: Moo!");
    }
}
