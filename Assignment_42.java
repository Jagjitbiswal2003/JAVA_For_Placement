

// Inheritance in Java

class Animal {
    String species;

    Animal(String species) {
        this.species = species;
    }

    void makeSound() {
        System.out.println("The " + species + " makes a sound.");
    }
}

class Dog extends Animal{
    String breed;

    Dog(String species, String breed) {
        super(species);   // Super keyword 
        this.breed = breed;
    }
      void show(){
          System.out.println("Species is:" + species + "Breed is:"+breed);
      }
    // Overriding the makeSound method
    @Override
    void makeSound() {
        System.out.println("The " + breed + " dog barks.");
    }
}



public class Assignment_42 {
    public static void main(String[] args) {
        Dog d = new Dog("Canine", "Labrador");

        d.makeSound();
        d.show();
    }
}
