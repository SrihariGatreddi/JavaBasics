
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Pattern22 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int spaces=num/2;
        int nums=1;
        int temp=0;
        for(int i=0;i<num+1;i++){
            for(int j=0;j<spaces;j++)
                System.out.print(" ");
            for(int k=0;k<nums;k++){
                if(k>nums/2) temp--;
                if(k<=nums/2) temp++;
                System.out.print(temp);
            }
            if(i+1<=num/2){spaces--; nums+=2; }
            else {spaces++; nums-=2; temp-=2;}
            System.out.println();
        }
    }
}
