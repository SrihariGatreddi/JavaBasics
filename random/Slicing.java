import java.util.*;
import java.lang.*;
import java.util.Collections.*;
import java.util.stream.Collectors;

public class Slicing {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,6,7,8,9};
        int[] sliArr=Arrays.copyOfRange(arr,0,5);
        System.out.println(Arrays.toString(sliArr));

        List<Integer> list1 = new ArrayList<>(List.of(10, 20, 30, 40, 50));
        List<Integer> li=list1.subList(2, 05);
        System.out.println(li);

        ArrayList<Integer> alist=new ArrayList<>(Arrays.asList(1,2,3,4));
        ArrayList<Integer> alistt=new ArrayList<>(alist.subList(2, 3));
        System.out.println(alist);
    }
    
}
