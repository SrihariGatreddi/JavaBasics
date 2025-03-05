import SBI.Account;

import java.util.Scanner;
public class LoanAccount extends Account {
    double balanceAmount;
    double accLoan;
    LoanAccount(double balanceAmount , double accLoan)
    {
        this.balanceAmount = balanceAmount;
        this.accLoan = accLoan;
    }
    public void readData2()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the actual loan take in rupees : ");
        accLoan = sc.nextDouble();
        System.out.println("Enter the Loan Balance: ");
        balanceAmount = sc.nextDouble();
    }
    public void printData2()
    {
        System.out.println("The Actual loan in Rupees: "+accLoan+"Rs");
        double totrem = accLoan - balanceAmount;
        System.out.println("The balance amount to refill: "+totrem);
    }
    public static void main(String[] args) {
        LoanAccount l1 = new LoanAccount(23000.0, 25000.0);
        l1.readData();
        l1.printData();
        SavingsAccount s1 = new SavingsAccount(2345, "Rohan", 12345, 2345.00);
        s1.readData1();
        s1.printData1();
        l1.readData2();
        l1.printData2();
    }}