import java.util.*;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int a=0;
        int b=1;
        int count=0;
        while(count<n){
            //System.out.print(a+" ");
            int temp=a;
            a=b;
            b=temp+b;
            count++;
        }
        System.out.print(a+" ");
    }
}

