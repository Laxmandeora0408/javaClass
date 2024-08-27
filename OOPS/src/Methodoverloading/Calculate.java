public class Calculate {

    public int add(int a, int b){
        return a + b;
    }
    public int add(int a, int b, int c){
        return a + b + c;
    }

    public static void main(String[] args) {
        Calculate calc = new Calculate();
        System.out.println("sum of two number"+ calc.add(3,6)) ;
           System.out.println("sum of two number"+ calc.add(3,6,7)) ;
    }
    
}
