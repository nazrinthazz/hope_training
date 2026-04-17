class Bank{
    int balance=1000;
    synchronized void withdraw(int amt){//Synchronized method
        if(amt<=balance){
            System.out.println("Amout withdraw successful");
            balance-=amt;
            System.out.println("Remaining balance: "+balance);
        }else{
            System.out.println("Balance insufficient");
        }
    }
}
class BankThread extends Thread{
    Bank b;
    BankThread(Bank b){
        this.b=b;
    }
    public void run(){
        b.withdraw(800);
    }
}

public class SynchronizationExample {
    public static void main(String[] args) {
        Bank b=new Bank();
        BankThread b1=new BankThread(b);
        BankThread b2=new BankThread(b);
        b1.start();
        b2.start();
    }
}
