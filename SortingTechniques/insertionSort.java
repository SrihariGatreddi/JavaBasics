package SortingTechniques;

import java.util.Scanner;

public class insertionSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr=new int[size];
        for(int i = 0; i < size; i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<=size-1;i++) {
            int j = i;
            while(j > 0 && arr[j] < arr[j - 1]) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;
            }
        }
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
