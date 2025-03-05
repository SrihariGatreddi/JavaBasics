package OOPS.Inheritance;

import OOPS.InheritanceBasics.ExampleINher;

public class extendsKeyword {
    static class boox extends ExampleINher.Box{
        float height;
        public boox(int a,int b,float height){
            super(a,b);
            this.height=height;
            System.out.println("In constructor");
        }
        public boox(boox B1){
            super(B1);
            System.out.println("obj constuctor");
            this.l=B1.l;
            this.b=B1.b;
        }
    }

    public static void main(String[] args) {
        boox b1=new boox(2,3,3.67f);
        System.out.println(b1.l);
        //System.out.println(b1.width);
        boox b2=new boox(b1);
        System.out.println(b2.width);
    }
}
