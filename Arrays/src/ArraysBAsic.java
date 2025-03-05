import java.util.*;
public class ArraysBAsic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int[] arr;//array of premitives
//        arr=new int[5];
//        for(int i=0;i<arr.length;i++)
//            arr[i]=sc.nextInt();
//        for(int i=0;i<arr.length;i++)
//            System.out.print(arr[i]+" ");
//        for(int num:arr)
//            System.out.print(num+" ");
//        System.out.println(Arrays.toString(arr));
//        System.out.println("enter array size");
        int size = sc.nextInt();
        String[] arra = new String[size];
        for (int i = 0; i < arra.length; i++) {
            arra[i] = sc.next();
        }
        for (String str : arra)
            System.out.print(str + " ");//
        // String[] arra;
//        arra=new String[size];

//        System.out.println(Arrays.toString(arra));
        //passing array to function
//        int[] arr={2,3,4,5,6};
//        changeValue(arr);
//        System.out.println(Arrays.toString(arr));
//    }
//    static int[] changeValue(int arr1[]){
//        arr1[4]=10;
//        return  arr1;
//    }
    }
}
