package Recurssion;

import java.util.Arrays;
import java.util.Scanner;

public class ReserveAnArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] array1={1,2,3,4,5};
        int j=array1.length-1;
        int temp;
        for (int i = 0; i<array1.length; i++) {
            if (j<i)
                break;
            else {
                temp = array1[i];
                array1[i] = array1[j];
                array1[j] = temp;
                j--;
            }
        }
        System.out.println(Arrays.toString(array1));
    }
}
