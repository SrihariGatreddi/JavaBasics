import java.util.*;
public class OccuranceOfNumber {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int num=555555555;
        int n=sc.nextInt();
        int rem,count=0;
        while(num!=0){
            if(n==(rem=num%10))
                count+=1;
            num/=10;
        }
        System.out.println(count);
    }
}
