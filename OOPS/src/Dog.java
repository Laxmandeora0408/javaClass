


class Dog{
    String bread; //instance variable
    int age;
    String color;

    public void setBreed(String bread){ //method
        this.bread = bread;

    }

    public void setAge(int age){
        //local variable
        this.age = age;

    }

    public void setColor(String color){
        this.color = color;

    }

    public void printDetails(){
        System.out.println("Dogs details:");
        System.out.println("Breed: " + this.bread);
        System.out.println("Age: " + this.age);
        System.out.println("Color: " + this.color);
    }

    public static void main(String[] args) {
        Dog obj = new Dog();
        obj.setBreed("Labrador");
        obj.setAge(5);
        obj.setColor("blue");


        obj.printDetails();
        
    }

    
}

