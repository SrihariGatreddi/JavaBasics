package OOPS.ExceptionalHandling;

public class ZeroDivisionError1 {
//    public int div(int a,int b){
//        int res=a/b;
//        return res;
//    }
    public static void div(int a,int b){
        try {
            int res=a/b;
        }
        catch (ArithmeticException e ){
            System.out.println("Zero cant be an argument");
        }
    }
    public static void main(String[] args) {
          ZeroDivisionError1.div(2,0);
    }
}
