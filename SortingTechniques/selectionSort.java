package SortingTechniques;
import java.util.*;
public class selectionSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr=new int[size];
        for (int i = 0; i < size; i++) {
            arr[i]=sc.nextInt();
        }
        for (int i = 0; i<=size-2; i++) {
            int mini=i;
            for (int j = i; j<=size-1; j++) {
                if (arr[j]<arr[mini]) mini=j;
            }
            int temp=arr[mini];
            arr[mini]=arr[i];
            arr[i]=temp;
        }
        for (int i = 0; i < size ; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
