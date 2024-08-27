
public class low {
    
public class Parent{
     public void addition(int x, int y){
        int z = x+y;
        System.out.println("addition value of z is"+ z);
    }

     public void substraction(int x, int y){
        int z = x - y;
        System.out.println("substract value of z is"+ z);
    }

}


public class Child extends Parent {

    public void multiply(int x, int y){
        int z = x*y;
        System.out.println("multiply value"+z);
    }
    
}



    public static void main(String[] args) {
          Child obj = new Child();
        obj.addition(12, 25);
        obj.substraction(23, 13);
        obj.multiply(23, 10);
        
    }


    
}
