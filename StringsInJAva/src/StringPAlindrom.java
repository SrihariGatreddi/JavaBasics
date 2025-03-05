package StringsInJAva.src;

import java.util.*;
public class StringPAlindrom {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

      StringBuilder str1=new StringBuilder("");
      StringBuilder str2=new StringBuilder("");
      String name="Srihari";
      String name2="srihari";
        System.out.println(name.equalsIgnoreCase(name2));
      str1.append(sc.nextLine());
        for (int i = 0; i < str1.length(); i++) {
            str2.append(str1.charAt(i));
        }
        if(!(str1.equals(str2)))
            System.out.println("Palindrome");
    }
}
