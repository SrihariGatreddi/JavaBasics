package OOPS.ExceptionalHandling;

 class throwKeyword extends Exception{
     throwKeyword(String message){
         super(message);
     }
}
class Myexception {
    public static void main(String[] args) {
        try {
            int a=4;
            int z=a/0;
            throw new throwKeyword("Zero Division Accurred");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
