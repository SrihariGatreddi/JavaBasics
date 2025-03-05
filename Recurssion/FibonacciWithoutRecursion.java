package Recurssion;
import java.sql.SQLOutput;
import java.util.*;
public class FibonacciWithoutRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0, b = 1;
        System.out.println("Enter range to print fibonacci");
        int rang = sc.nextInt();
        int temp,res=0;
        if (rang > 0) {

            while (rang!=0){
               // System.out.println(a);
                temp = a;
                a = b;
                b = a + temp;
                rang--;
            }
        } else System.out.println("Invalid choice");
        System.out.println(a);
    }
}