package Recurssion;

import java.util.Scanner;

public class StringPalindromeRecursion2 {
    public static StringBuilder str=new StringBuilder();

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        str.append(sc.nextLine());
         int len=str.length();
        boolean res=strRec(0,len);
        System.out.println(len);
        System.out.println(res);
        if (res)
            System.out.println("Palindrome");
        else System.out.println("Not palidrome");

    }
    static boolean strRec(int i,int len){
        if (i>=len/2)
            return true;
        if (str.charAt(i)!=str.charAt(len-i-1))
            return false;
        return strRec(i+1,len);
    }
}
