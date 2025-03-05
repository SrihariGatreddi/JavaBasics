package OOPS.Inheritance;

public class TopDownBtmUpAccessin {
    public static  class Box{
        int weight =3;
        int a;
        int b;
        public Box(int a,int b){
            this.a=a;
            this.b=b;
        }
    }
    public static class Boxwieght extends Box{
        int weight;
        public Boxwieght(int weight,int a,int b){
            super(a,b);
            this.weight=weight;
            System.out.println(super.weight);
        }

    }

    public static void main(String[] args) {
        Box b1=new Boxwieght(5,2,7);
        System.out.println(b1.a);
        //System.out.println(b1.wieght);//error
       // Boxwieght b2=new Box(2,3);//error cant refernce the child class to the patrent obj
    }
}
