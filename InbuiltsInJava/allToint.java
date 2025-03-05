import java.lang.*;
import java.util.Collections.*;
import java.util.*;
import java.util.stream.Collectors;

public class allToint {
    public static void main(String args[]){
        //Integer objects to integer premitives 
           //list to int
           List<Integer> li=Arrays.asList(1,2,3);
           int[] arr=li.stream().mapToInt(Integer::intValue).toArray();
           //ArrayList to int arr
          ArrayList<Integer> arrList = new ArrayList<>(Arrays.asList(1, 2, 3));
          int[] arr1=arrList.stream().mapToInt(Integer::intValue).toArray();
          //set to int arr
          Set<Integer> se=new HashSet<>(Arrays.asList(1,2,3,3));
          int[] arr2=se.stream().mapToInt(Integer::intValue).toArray();
          //LinkedHashSet to int
          LinkedHashSet<Integer> Lset=new LinkedHashSet<>(Arrays.asList(2,1,3,4));
          long[] arr3 = Lset.stream().mapToLong(Integer::longValue).toArray();//converting integer hashset to long int array
    }
}
