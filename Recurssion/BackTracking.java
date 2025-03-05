package Recurssion;
import java.math.*;
import java.util.Scanner;

public class BackTracking {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        print1(1,num);
    }
    static void print1(int i,int num){
        if (i==num+1)
            return;
        print1(i+1,num);
        System.out.println(i);

    }
}
