import java.util.*;

import static java.lang.Math.log10;

public class NoOfDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int count=0;
       // int as=(int)(log10(n)+1);
       // System.out.println(as);
        while(n!=0){
            //int rem=n%10;
            count++;
            n/=10;
        }
        System.out.println(count);

    }
}
