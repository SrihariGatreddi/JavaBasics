package OOPS.ExceptionalHandling;

public class userDefinedExeceptions extends Throwable{
    public static void main(String[] args) {
        checkAccount acc1=new checkAccount(4241);
        acc1.deposit(2000);
        try{
            acc1.withdraw(300);
            acc1.withdraw(1800);
        }
        catch (insufficientFundsException e){
            System.out.println("Insuffiecient balance ...still need $"+e.getAmount());
        }
    }
}
class checkAccount{
    private double balance;
    private int number;
    public checkAccount(int number){
        this.number=number;
    }
    public void deposit(double amount){
        balance+=amount;
        System.out.printf("Depositiong $ %f\n",amount);
    }
    public void withdraw(double amount) throws insufficientFundsException{
        if (amount<=balance) {
            balance -= amount;
            System.out.println("Withdrawing $"+amount);
        }
        else {
            double needs = amount - balance;
            throw new insufficientFundsException(needs);
        }
    }
    public double getBalance(){
        return balance;
    }
    public int getNumber(){
        return number;
    }
}
class insufficientFundsException extends Exception{
    private double amount;
    public insufficientFundsException(double amount){
        this.amount=amount;
    }
    public double getAmount(){
        return amount;
    }
}