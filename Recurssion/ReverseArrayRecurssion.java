package Recurssion;

import java.util.Arrays;

public class ReverseArrayRecurssion {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int i=0,j=arr.length-1;
        reverseArray(i,j,arr);
        System.out.println(Arrays.toString(arr));

    }
    static int[] reverseArray(int i,int j,int[] arr){
        if (j<=i)
            return arr;
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        reverseArray(i+1,j-1,arr);
        return arr;
    }

}
