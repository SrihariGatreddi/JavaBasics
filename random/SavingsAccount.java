import SBI.Account;
import java.util.Scanner;
public class SavingsAccount extends Account {
    String SAccNumber;
    String accHolder1 = super.accHolder;
    int accNumber1 = super.accNumber;
    double balance1 = super.balance;
    double Balance2;
    SavingsAccount(int SAccNumber , String accHolder1 , int accNumber1 , double
            balance1)
    {
        this.accHolder1 = accHolder1;
        this.accNumber1 = accNumber1;
        this.balance1 = balance1;
        this.SAccNumber = String.valueOf(SAccNumber);
    }
    void readData1()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Savings Account number: ");
        SAccNumber = sc.next();
        System.out.println("Enter the balance in the Savings account: ");
        Balance2 = sc.nextDouble();
    }
    void printData1() {
        System.out.println("The number of Savings account is: " + SAccNumber);
        System.out.println("The Balance in the Savings account is: " + Balance2);
    }}