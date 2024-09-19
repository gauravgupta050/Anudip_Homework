class Animal {
    public void makeSound() {
        System.out.println("The animal makes a sound");
    }
}

class Dog extends Animal {

    @Override
    public void makeSound() {
        System.out.println("The dog barks");
    }
}

class Cat extends Animal {

    @Override
    public void makeSound() {
        System.out.println("The cat meows");
    }
}

public class AnimalDefinition {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        myDog.makeSound(); 
        myCat.makeSound(); 
    }
}
