import java.util.*;

class SubsequenceGenrationBacktracting {
    public static void main(String[] args) {
    int[] arr={3,1,2};
    ArrayList<Integer> li=new ArrayList<>();
    generateSubsequence(0,arr,3,li);
    } 

static void generateSubsequence(int index,int[] arr,int n,ArrayList<Integer> li){
    if(index==n)
    {
        System.out.println(li.toString());
        return;
    }
    li.add(arr[index]);
    generateSubsequence(index+1, arr, n, li);
    li.remove(li.size()-1);
    generateSubsequence(index+1, arr, n, li);
}

}
