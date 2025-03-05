import java.util.*;
public class TwoDArrays {
    public static void main(String[] args) {
//        int[][] arr={
//                {1,2,3,},
//                {4,5,6},
//                {7,8,9,10}
//        };
        Scanner sc=new Scanner(System.in);
        int[][] arr=new int[2][3];
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j]=sc.nextInt();
            }
        }
        for (int i = 0; i < arr.length; i++)
            System.out.println(Arrays.toString(arr[i]));


//        for (int i = 0; i < arr.length; i++){
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.print(arr[i][j]+" ");
//            }
//            System.out.println();
//        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(Arrays.toString(arr[i]));
//        }
        for(int[] SubArr:arr)
            System.out.println(Arrays.toString(SubArr));
    }
}
