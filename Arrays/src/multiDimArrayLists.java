import java.util.*;
public class multiDimArrayLists {
    public static void main(String[] args) {
        int[] arr={2,4,5,1,8};
//        System.out.println(Arrays.toString(Arrays.sort(arr)));
        Arrays.sort(arr);
        
        Scanner sc=new Scanner(System.in);
        ArrayList<ArrayList> list=new ArrayList(10);
        for (int i = 0; i < 4; i++)
            list.add(new ArrayList());
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++)
                list.get(i).add(sc.nextInt());
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(list.get(i).get(j));
            }
        }
        for (int i = 0; i < 4; i++) {
            System.out.println(list.get(i));
        }
        }
    }

