package OOPS.InheritanceBasics;

public class ExampleINher {

    public static class Box{
        public int l;
        public int b;
        public int width;
        public Box(){
            this.l=2;
            this.b=4;
            this.width=5;
            System.out.println("defualt constructor");
        }
        public Box(int a,int b){
            this.l=a;this.b=b;
            System.out.println("Two Paramaterized constructor ");
        }
        public Box(Box old){
            this.l=old.l;
            this.b=old.b;
            this.width=old.width;
            System.out.println("Constructor taht accepts obj");
        }

    }
    public static void main(String[] args) {
       Box bb1=new Box();
       System.out.println(bb1.b);
       Box b2=new Box(2,2);
        System.out.println(b2.b);
        Box b3=new Box(b2);
        System.out.println(b3.l);
    }
}
