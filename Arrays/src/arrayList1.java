import java.util.Scanner;
import java.util.ArrayList;
public class arrayList1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
         ArrayList<Integer> list=new ArrayList<>(3);
        for (int i = 0; i < 10; i++)
            list.add(sc.nextInt());
        for (int i = 0; i < list.size(); i++)
            System.out.println(list.get(i));
        System.out.println(list);
    }
}
