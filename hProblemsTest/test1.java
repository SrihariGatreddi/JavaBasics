package hProblemsTest;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class test1 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name of the movie");
        String movie=sc.next();
        System.out.println("Enter the name of the auditorium");
        String audi=sc.next();
        System.out.println("Enter the duration of the movie");
        double duration=sc.nextDouble();
        System.out.println("Enter the number of free tickets remaining");
        int tickets=sc.nextInt();
        System.out.println("Enter the public rating for the movie");
        char rate=sc.next().charAt(0);
        System.out.println("Weekend Screening !!!");
        System.out.println("Movie Name : "+movie);
        System.out.println("Auditorium Name : "+audi);
        System.out.format("Duration of the movie : %.3f hours\n",duration);
        System.out.println("No. of tickets remaining : "+tickets);
        System.out.println("Movie Rating : "+rate);

    }
}
