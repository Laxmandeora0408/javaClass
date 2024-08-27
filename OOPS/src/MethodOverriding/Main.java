// File name: Main.java

public class Main {
    public static void main(String[] args) {
        Animal animal = new Dog();

        
        animal.sound();  // Child class ka method call hoga (polymorphism ke karan)
    }
}

// Non-public class Animal
class Animal {
    public void sound() {
        System.out.println("Animal awaz nikalta hai");
    }
}

// Non-public class Dog extending Animal
class Dog extends Animal {
   
    public void sound() {  // Method overriding
        System.out.println("Dog bhonkti hai");
    }
}
