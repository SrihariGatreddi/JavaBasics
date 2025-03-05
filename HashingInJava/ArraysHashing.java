package HashingInJava;
import java.util.*;
public class ArraysHashing {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int[] arr=new int[s];
        for (int i = 0; i < s; i++)
            arr[i]=sc.nextInt();
        int[] hashArray=new int[100];

        for (int i = 0; i < s; i++)
            hashArray[arr[i]]++;
        int noOfQuaries=sc.nextInt();
        for (int i = 0; i < noOfQuaries; i++){
            int num=sc.nextInt();
            System.out.println(num+" "+hashArray[num]);
        }

    }
}
