package Recurssion;

public class ParameterizedCondition {
    public static void main(String[] args) {
        int n=3,i=0;
        print1(i,n);
    }
    static void print1(int i,int n){
        if (i>n)
            return;
        System.out.println(i);
        print1(i+1,n);
    }
}
