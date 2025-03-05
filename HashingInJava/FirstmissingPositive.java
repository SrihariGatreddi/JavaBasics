package HashingInJava;

import java.util.TreeMap;
import java.util.*;
public class FirstmissingPositive {
    public static void main(String[] args) {
        TreeMap<Integer,Integer> map=new TreeMap<>();
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int[] arr=new int[s];
        for(int i=0;i<s;i++){
            arr[i]=sc.nextInt();
        }
        for (int i = 0; i < s; i++) {
            map.put(arr[i],0);
        }int prev=0;
//        for(Map.Entry<Integer,Integer> entry: Map.entrySet()){
//        }
        for (Integer key : map.keySet()) {
           if(key>=1){
               prev=key;        if(key==1||key==prev+1)
                                     continue;
                      }

}
System.out.println(prev-1);
}}