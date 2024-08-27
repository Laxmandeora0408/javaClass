
interface  Addition {
    int add(int a, int b);
     default void bark(){
        System.out.println("this is default method");
     }
    
}
