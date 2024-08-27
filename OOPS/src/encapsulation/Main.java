

public class Main {

    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.deposit(1000);
        account.getBalance();  
        System.out.println(account.getBalance()); 
    }
    
}


