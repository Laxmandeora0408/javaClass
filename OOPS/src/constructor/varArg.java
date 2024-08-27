

public class varArg {
    public static void printNumbers(int... numbers) {
        for (int number : numbers) {
            System.out.println(number);
        }
    }

    public static void main(String[] args) {
      
        printNumbers(1, 2, 3);     
        printNumbers(4, 5, 6, 7, 8); 
        printNumbers();              
    }
    
}
