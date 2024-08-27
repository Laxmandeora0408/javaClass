public class Puppy {
    int puppyAge;

    public Puppy(String name){ // construtor
     System.out.println("Puppy name chosen: " + name);
    }

    public void setAge(int age){
        puppyAge = age;
    }

    public int getAge(){
        System.out.println("puppy age is "+ puppyAge);
        return puppyAge;
    }

    public static void main(String[] args) {
        Puppy myDog = new Puppy("tommy");
        myDog.setAge(3);
        myDog.getAge();
        System.out.println("variable value:"+ myDog.puppyAge);
    }
    
}
