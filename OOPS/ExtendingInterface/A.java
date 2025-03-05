package OOPS.ExtendingInterface;

public interface A {
   public  void fun();
//static void greet();gives error
   static void greet(){//static methods must have the body where it is defined
      System.out.println("hello");
   }
}
