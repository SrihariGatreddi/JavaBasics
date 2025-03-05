package Recurssion;
import java.util.*;
public class StringPalindromeBest {
    static int mid;
    static boolean res;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        char[] charArr=new char[str.length()];
        charArr=str.toCharArray();
        if(recur(charArr,0,charArr.length-1))
            System.out.println("palindrome");
        else
            System.out.println("not palindrome");
    }
    static boolean recur(char[] charArr,int r,int l){
        mid=(r+l)/2;
        if(mid==(charArr.length-1)/2)
            return true;
        res=recur(charArr,r+1,l-1);
        if(res){
            if(charArr[r]==charArr[l])
                return true;
            else
                return false;
        }
        else
            return false;
    }
}
