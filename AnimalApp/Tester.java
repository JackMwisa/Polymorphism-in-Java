package AnimalApp;

public class Tester {
    public static void main(String[] args) {
        // Create an Animal object
        Animal genericAnimal = new Animal("Generic Animal");
        
        // Create a Lion object
        Lion lion = new Lion("Simba");
        
        // Create a Cow object
        Cow cow = new Cow("Daisy");

        // Execute the animalSound method on all the objects
        System.out.println("Animal sound:");
        genericAnimal.animalSound();  // Prints default animal sound
        
        System.out.println("\nLion sound:");
        lion.animalSound();  // Prints lion's sound
        
        System.out.println("\nCow sound:");
        cow.animalSound();  // Prints cow's sound
    }
}

