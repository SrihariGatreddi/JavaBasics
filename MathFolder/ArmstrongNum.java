import java.util.*;
import java.math.*;
public class ArmstrongNum {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int num=sc.nextInt();
        if(Armstrong(num))
            System.out.println("Armstrong");
        else System.out.println("Not Armstrong");
    }
    static boolean Armstrong(int num){
        int sum=0,rem=0,dup=num;
        double count=DigitCount(num);
        while(num>0){
            rem=num%10;
            System.out.println(rem);
            sum=sum+(int)(Math.pow(rem,count));
            System.out.println(sum);
            num/=10;
            System.out.println(num);
        }
        if(dup==sum) return true; else return false;
    }
    static double DigitCount(int num){
        double count=0;
        while (num>0) {
            num /= 10;
            count++;
        }
        System.out.println(count);
        return count;
    }
}
