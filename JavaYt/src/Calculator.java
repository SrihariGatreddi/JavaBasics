import java.sql.SQLOutput;
import java.util.*;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b;
        boolean val=true;
        while(val){
            System.out.println("Enter operator:");
            char ch=sc.next().trim().charAt(0);
            if(ch=='+'||ch=='-'||ch=='/'||ch=='%') {
                a = sc.nextInt();
                b = sc.nextInt();
                if (ch == '+') System.out.println(a+b);
                else if (ch == '-') System.out.println(a-b);
                else if (ch == '/') System.out.println(a/b);
                else if (ch == '%') System.out.println(a%b);
                else if(ch=='x'||ch=='X') val=false;
                else System.out.println("invalid input");
            }
        }
    }
}
