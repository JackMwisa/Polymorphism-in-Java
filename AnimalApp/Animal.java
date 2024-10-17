package AnimalApp;

public class Animal {
    protected String animalName;

    // Constructor to initialize the animal name
    public Animal(String animalName) {
        this.animalName = animalName;
    }

    // Default method to print animal sound
    public void animalSound() {
        System.out.println("The animal makes a sound.");
    }
}
