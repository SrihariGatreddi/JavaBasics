
import java.util.Scanner;

public class SPalindrome {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            StringBuilder str1=new StringBuilder("");
            StringBuilder str2=new StringBuilder("");
            str1.append(sc.nextLine());
            for (int i = str1.length()-1; i>=0; i--) {
                str2.append(str1.charAt(i));
            }
            for (int i = 0; i < str2.length(); i++) {
                System.out.println(str2.charAt(i));
            }
            System.out.println(str1.toString().equals(str2.toString()));
            if(str1.toString().equals(str2.toString()))
                System.out.println(" palindrome");
            else
                System.out.println("Not palindrome");
        }
    }


