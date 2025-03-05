package OOPS.ExceptionalHandling;

public class throwsKeyword{
    public static void main(String[] args) throws Exception{
        try {
            int[] arr=new int[5];
            arr[6]=7;
            int res=5/0;
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

}
