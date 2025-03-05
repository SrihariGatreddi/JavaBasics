package Recurssion;

import java.util.Scanner;

public class PrintNNums {
    public static void main(String[] args) {
        int i=1;
        print1(i);
    }
    static void print1(int i){
        if (i==11)
            return;
        System.out.println(i);
        i++;
        print1(i);
    }
}
