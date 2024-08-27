package variables;

public class StaticVariable {
    static String schoolName;
    int age;
    String name;

    void displayInfo(){
        System.out.println("name"+name);
          System.out.println("age"+age);
            System.out.println("School name"+schoolName);
    }

    public static void main(String[] args) {
        StaticVariable obj1 = new StaticVariable();
        StaticVariable obj2 = new StaticVariable();


        StaticVariable.schoolName = "SIES";
 

        obj1.displayInfo();
        obj2.displayInfo();
        
    }
    
}
