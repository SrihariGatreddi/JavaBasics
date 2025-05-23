import java.util.*;

class subSequenceSumk {
    public static void main(String[] args) {
    int[] arr={1,2,1};
    ArrayList<Integer> li=new ArrayList<>();
    generateSubsequence(0,arr,3,li,0,2);
    }

static void generateSubsequence(int index,int[] arr,int n,ArrayList<Integer> li,int sum,int k){
    if(index>=n)
    {
       if(sum==k)
       System.out.println(li.toString());
       return;
    }
    li.add(arr[index]);
    sum=sum+arr[index];
    generateSubsequence(index+1, arr, n, li,sum, k);
    
    li.remove(li.size()-1);
    sum=sum-arr[index];
    generateSubsequence(index+1, arr, n, li,sum, k);
}
}
