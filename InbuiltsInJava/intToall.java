import java.lang.*;
import java.util.Collections.*;
import java.util.*;
import java.util.stream.Collectors;




public class intToall {
    public static void main(String args[]){
        //int array to IntegerList
        int[] arr={1,2,3};
         List<Integer> li=Arrays.stream(arr).boxed().collect(Collectors.toList());
        // li.forEach(e->System.out.print(e+" "));

        //int array to IntegerSet
        ArrayList<Integer> arrlist=Arrays.stream(arr).boxed().collect(Collectors.toCollection(ArrayList::new));
        arrlist.forEach(e->System.out.print(e+" "));

        //int array to Set
        Set<Integer> seet=Arrays.stream(arr).boxed().collect(Collectors.toSet());
        //int array to HashSet
        HashSet<Integer> Hset=Arrays.stream(arr).boxed().collect(Collectors.toCollection(HashSet::new));
        //int array to TreeSet
        TreeSet<Integer> Tset=Arrays.stream(arr).boxed().collect(Collectors.toCollection(TreeSet::new));

    }
}
