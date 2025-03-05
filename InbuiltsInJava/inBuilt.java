    import java.util.*;
import java.util.stream.Collectors;
class inBuilt{
    public static void main(String args[]){
        //array to list
         //int[] arr={1,2,3};
        // Integer[] integerArray = Arrays.stream(intArray)
        //                                .boxed()
        //                                .toArray(Integer[]::new);
       // List<Integer> li=Arrays.stream(arr).boxed().collect(Collectors.toList());
        // Integer[] Intarr=Arrays.stream(arr).boxed().toArray(Integer[]::new);       
        // List<Integer> li=Arrays.asList(Intarr);
        // li.forEach(e->System.out.print(e+" "));
        // li.forEach(e->System.out.print(li.indexOf(e)+" "));
        // System.out.println(li);
        
//list to int array
        // List<Integer> li=Arrays.asList(1,2,3);
        // int[] arr=li.stream().mapToInt(Integer::intValue).toArray();
        // li.forEach(e-> System.out.print(e+" "));
        // for(int i:arr)
        // System.out.print(i+" ");
//set to int array
Set<Integer> se=new HashSet<>(Arrays.asList(1,2,3));
int[] arr=se.stream().mapToInt(Integer::intValue).toArray();




    }
}