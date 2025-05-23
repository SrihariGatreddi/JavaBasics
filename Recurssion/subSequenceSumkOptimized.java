import java.util.*;

class subSequenceSumkOptimized {
    public static void main(String[] args) {
    int[] arr={1,2,1};
    ArrayList<Integer> li=new ArrayList<>();
    boolean found =generateSubsequence(0,arr,3,li,0,2);
    System.out.println(found);
    }

static boolean generateSubsequence(int index,int[] arr,int n,ArrayList<Integer> li,int sum,int k){
    if(index>=n)
    {
       if(sum==k){
       System.out.println(li.toString());
       return true;
       }
       return false;
    }
    li.add(arr[index]);
    sum=sum+arr[index];
    if(generateSubsequence(index+1, arr, n, li,sum, k)){
        return true;
    }
    
    li.remove(li.size()-1);
    sum=sum-arr[index];

    if(generateSubsequence(index+1, arr, n, li,sum, k)){
    return true;
    }
    return false;
}
}
