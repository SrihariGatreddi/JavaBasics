package HashingInJava;
import java.util.*;
import java.util.HashMap;
public class HashMapHashing {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[25];
        System.out.println("enter size of the array");
        int size=sc.nextInt();
        for (int i = 0; i < size; i++)
            arr[i]=sc.nextInt();
        HashMap<Integer,Integer> hashMap=new HashMap<Integer,Integer>();
        for (int i = 0; i < size; i++) {
            hashMap.put(arr[i],0);   }
        for (int i = 0; i < size; i++) {
          int count=hashMap.containsKey(arr[i])?hashMap.get(arr[i]):0;
          count++;
          hashMap.put(arr[i],count);
        }
        System.out.println("Enter no.of Queiers");
        int noOfQueries=sc.nextInt();
        for (int i = 0; i < noOfQueries; i++) {
        int num=sc.nextInt();
            System.out.println(num+" "+hashMap.get(num));
        }
        for(Map.Entry<Integer,Integer> e: hashMap.entrySet()){
            System.out.println("key "+e.getKey()+" value "+e.getValue());
        }
    }
}
