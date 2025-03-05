package Recurssion;

import java.util.Scanner;

public class SumOfFirstnNums {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        System.out.println(sum1(n,sum));
    }
    static int sum1(int i,int sum){
        if (i<1)
            return sum;
       return  sum1(i-1,sum+i);
    }
}
