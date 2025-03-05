package OOPS.ExceptionalHandling;

class multipleThrow {
    static void demoProc() throws INtruptedException {
        try {
            throw new INtruptedException("exception meassage from DemoProc method caught in catch");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            throw e;
        }
    }

    public static void main(String[] args) {
        try {
            demoProc();
        }
        catch (Exception e){
            //System.out.println("Exception thrown by demoProc to try block handled in cath block in main");
            System.out.println(e.getMessage());
        }

    }
}
class INtruptedException extends Exception{
    INtruptedException(String message){
        super(message);
    }
}