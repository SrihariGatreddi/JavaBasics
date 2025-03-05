import java.util.*;
public class StringBUilder {
    public static void main(String[] args) {
        StringBuilder str=new StringBuilder("Srihari");
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
        System.out.println(str.append(2));
        System.out.println(str.charAt(1));
        System.out.println(str.insert(1,1));
        System.out.println(str.insert(0,true));
        System.out.println(str.replace(1,4,"SRI"));
        System.out.println(str.capacity());
        System.out.println(str.length());

    }
}
