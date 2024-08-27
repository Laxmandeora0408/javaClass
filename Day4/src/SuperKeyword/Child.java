

public class Child extends Parent {
    int num = 10;

    public void display(){
        System.out.println("Child class variable: " + num);
    }
     public void method(){
        this.display();
        super.display();
    }
    
}
