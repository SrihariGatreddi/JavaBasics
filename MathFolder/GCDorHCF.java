import java.util.*;
public class GCDorHCF {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        //method1
//        int gcd=0;
//        for (int i = 1; i<=Math.min(n1,n2) ; i++) {
//         if (n1%i==0&&n2%i==0)
//             gcd=i;
//        }
//        System.out.println(gcd);
        //method2
//        for (int i =Math.min(n1,n2); i>=1 ; i--) {
//            if (n1%i==0&&n2%i==0) {
//                System.out.println(i);
//                break;
//            }
//        }
        //method3
        while(n1 != 0&&n2 != 0){
            if (n1>n2){ n1=n1%n2;
                System.out.println("initial");}
            else {n2=n2%n1;
                System.out.println("last");};
        }
        if (n1==0) System.out.println(n2);
        else System.out.println(n1);
    }
}
