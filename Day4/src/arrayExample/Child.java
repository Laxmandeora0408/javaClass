

public class Child extends Parent {

    public void mulNumbers(int[] numbers){
        System.out.println("print Numbers");
        for (int i = 0; i < numbers.length; i++) {
            int result = numbers[i]*2;
            System.out.println(result);
        }
    }
    
}
