 class BankAccount {
    private double balance;

   //setter
    public void setBalance(double balance) {
        if(balance>0){
            this.balance = balance;
        } 
        else System.out.println("Input not valid");
    }
    //getter
    public double getBalance() {
        return balance;
    }
    public void withdraw(int amt){
        if(amt > 0 && balance >= amt){
            balance-=amt;
        }else{
            System.out.println("Invalid amount");
        }
    }
    public void deposit(int amt){
        if(amt>0){
            balance+=amt;
        }else {
            System.out.println("Invalid input amount");
        }
    }
}

public class Encapsulation{
    public static void main(String[] args) {
        BankAccount b=new BankAccount();
        b.setBalance(1000);
        System.out.println(b.getBalance());
        b.withdraw(900);
        System.out.println(b.getBalance());
        b.deposit(450);
        System.out.println(b.getBalance());
    }
}
