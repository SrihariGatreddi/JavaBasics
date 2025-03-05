package SortingTechniques;

import java.util.Scanner;

public class bubbleSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr=new int[size];
        for(int i = 0; i < size; i++){
            arr[i]=sc.nextInt();
        }
        for(int i=size-1;i>=1;i--){
            int swapDone=0;
            for (int j = 0; j <=i-1; j++) {
                if(arr[j]>arr[j+1]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                    swapDone++;
                    System.out.println("done");
                }
            }
            if(swapDone==0)
                break;
        }
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
