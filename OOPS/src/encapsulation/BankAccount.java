public class BankAccount {
     private int balance = 300;  
    
    public void deposit(int amount) {  
        balance += amount;
    }
    
    public int getBalance() {  
        return balance;
    }

}

