package AnimalApp;

public class Lion extends Animal {

    // Constructor to initialize the animal name
    public Lion(String animalName) {
        super(animalName);
    }

    // Overriding the animalSound method to print the lion sound
    @Override
    public void animalSound() {
        System.out.println(animalName + " roars: Roarrr!");
    }
}
