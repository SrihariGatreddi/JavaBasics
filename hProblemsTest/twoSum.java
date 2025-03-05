package hProblemsTest;
import java.util.*;
public class twoSum {
    public static void main(String[] args) {
        int[] arr={2,4,5,9};
        int target=6;
        int[] resulst=check(arr,target);
        for (int i = 0; i < resulst.length; i++) {
            System.out.print(resulst[i]+" ");
        }
    }
    static int[] check(int[] arr,int target){
        int[] temp=new int[2];
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<=arr.length-1;j++){
                if(arr[i]+arr[j]==target){
                    temp[0]=i;
                    temp[1]=j;
                    break;
                }
            }
        }
        return temp;
    }
    }

