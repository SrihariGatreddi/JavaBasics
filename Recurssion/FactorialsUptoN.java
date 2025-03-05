// Online Java Compiler
// Use this editor to write, compile and run your Java code online
package Recurssion;
import java.util.*;

class FactorialsUptoN {
    public static int[] arr=new int[10];
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int temp=num;
        int i=0;
        factR(arr,num,temp,i);
        System.out.println(Arrays.toString(arr));
    }
    static void  factR(int[] arr,int num,int temp,int i){
        if(num<1){
            return;}
        int fact=1;
        for(int j=1;j<=num;j++){
            fact=fact*j;
        }
        factR(arr,num-1,temp,i=i+1);
        arr[i-1]=fact;
        System.out.println(Arrays.toString(arr));
    }
}