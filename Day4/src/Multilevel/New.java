

     class Animal {

        public void makeSound() {
            System.out.println("animal makes sound");
        }
    }

     class Dog extends Animal {

        public void barks() {
            System.out.println("dog barks");
        }
    }

     class Cat extends Animal {

        public void meows() {
            System.out.println("cat meows");
        }
    }

public class New{
     public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        dog.makeSound();
        dog.barks();
        cat.makeSound();
        cat.meows();

    }

}



   