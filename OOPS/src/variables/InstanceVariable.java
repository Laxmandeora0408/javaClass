

public class InstanceVariable {
    String name;
    int age;

    public void  displayInfo(){
        System.out.println("name is"+ name);
        System.out.println("your age is : " + age);
    }

    public static void main(String[] args) {
        InstanceVariable obj = new InstanceVariable();
        obj.name = "John";
        obj.age = 25;

        obj.displayInfo();
    }
    
}
