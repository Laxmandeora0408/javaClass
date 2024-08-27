// File: Main.java
public class Main {
    public static void main(String[] args) {
        Logger obj = new Logger();
        
      
        obj.setFormat("Hello, World!"); 
        System.out.println(obj.getFormat()); 
        
 
        obj.setFormat("PinKI meri mami"); 
        System.out.println(obj.getFormat()); 
    }
}
