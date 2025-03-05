package Recurssion;

import java.util.Scanner;

public class StringPalindromeRecurssion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        StringBuilder str=new StringBuilder(str1);
        int i=0; char temp;
        int j=str.length()-1;
        StringBuilder res=stringPalindrome(str,i,j);
      System.out.println(res);
//        StringBuilder answ=res.equals(str);
//        System.out.println(answ);
//        if(answ)
//            System.out.println("Palindrome");
//        else
//            System.out.println("Not Palindrome");
        if ((str.toString().equals(res.toString())))
            System.out.println("Palindrome");
        else System.out.println("Not palindrome");
    }
  static StringBuilder stringPalindrome(StringBuilder str,int i,int j){
        char temp;
        if (j<=i)
            return str;
        temp=str.charAt(i);
        str.setCharAt(i,str.charAt(j));
        str.setCharAt(j,temp);
        stringPalindrome(str,i+1,j-1);
        return str;
    }
}
