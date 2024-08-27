

public class Dog {
     String breed;
    int age;

  
    public Dog() {
        breed = "Unknown";
        age = 0;
    }

   
    public Dog(String breed, int age) {
        this.breed = breed;
        this.age = age;
    }

   
    public void displayInfo() {
        System.out.println("Breed: " + breed);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        
        Dog dog1 = new Dog();
        dog1.displayInfo();  

       
        Dog dog2 = new Dog("Labrador", 5);
        dog2.displayInfo(); 
    }
    
}
