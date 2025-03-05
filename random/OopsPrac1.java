/*import java.util.*;
class CellPhone{
    void ring(){
        System.out.println("ringing");
    }
    void vibrate(){
        System.out.println("vibrating");
    }
    void callFriend(){
        System.out.println("calling Mr.Rahul");
    }
}
public class OopsPrac1 {
    public static void main(String[] args) {
        CellPhone cell1=new CellPhone();
        cell1.callFriend();
        cell1.ring();
        cell1.vibrate();
    }
}*/
import java.util.*;
class square{
    int side;
    public int area(){
        return side*side;
    }
    public int perimenter(){
        return 4*side;
    }
}
public class OopsPrac1{

public static void main(String[] args) {
   square sq=new square();
   sq.side=4;
    System.out.println(sq.area());
    System.out.println(sq.perimenter());
}
}