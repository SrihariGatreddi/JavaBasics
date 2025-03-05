import java.util.*;
public class StringPalindrome {
    public static void main(String[] args) {
        String st=new String("aba");
        String New="";
        for(int i=(st.length())-1;i>=0;i--){
            New=New+st.charAt(i);
            System.out.println(New);
        }
        if(st==New)
            System.out.println("String is  Palindrome");
        else
            System.out.println("String is not a palindrome");
    }
}
