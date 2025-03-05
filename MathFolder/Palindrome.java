import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(palindrome(num))
            System.out.println("palindrome");
        else System.out.println("not a palindrome");
    }
    static boolean  palindrome(int num){
        int dup=num,rev=0,rem=0;
        while(num>0){
            rem=num%10;
            rev=rev*10+rem;
            num/=10;
        }
        System.out.println(rev);
        if (dup==rev) return true; else return false;
    }
}
