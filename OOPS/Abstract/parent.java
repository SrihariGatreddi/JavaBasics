package OOPS.Abstract;

abstract public class parent {
    String name;

    public parent(String name) {
        this.name = name;
    }

    abstract public  void carrer();
    abstract public void partner();
//abstract clas  can contain normal methods and as well as static classes
    void intro(){
        System.out.println("Im so and so....");
    }
    static void SelfIntro(){
        System.out.println("Im from vzm....");
    }
//    abstract static void fun(){//illigal combination of abstract and static
//
//    }
}
