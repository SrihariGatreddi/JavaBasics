import java.util.*;
public class PassingArrayToFun {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size:");
        int size=sc.nextInt();
        int[] arr=new int[size];
        for (int i = 0; i <arr.length; i++) {
            arr[i]= sc.nextInt();
        }
        Sortfun(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");

        }

    }
    public static int[] Sortfun(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]>arr[j]){
                    int temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }
        return arr;
    }
}
