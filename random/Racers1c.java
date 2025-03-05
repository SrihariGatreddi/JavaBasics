import java.io.*;
import java.util.*;
public class Racers1c {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int speed[]=new int[5];
        for(int i=0;i<5;i++){
            System.out.println("\n Enter the speed of racer "+i+":");
            speed[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<5;i++)
            sum+=speed[i];
        double avg=sum/5;
        System.out.print("\n The speed of qualifying racers is:");
        for(int i=0;i<5;i++)
        {
            if(speed[i]>=avg)
                System.out.print("\n Racer-"+i+": "+speed[i]);
        }
    }
}
