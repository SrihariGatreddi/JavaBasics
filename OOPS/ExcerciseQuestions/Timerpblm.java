package OOPS.ExcerciseQuestions;

public class Timerpblm {
    int hour;
    int min;
    int sec;
    public Timerpblm(int hour,int min,int sec){
        this.hour=hour;
        this.min=min;
        this.sec=sec;
    }

    public Timerpblm(){

    }
    public Timerpblm Addtion(Timerpblm obj1,Timerpblm obj2){
       Timerpblm tobj=new Timerpblm();
        this.hour=tobj.hour+ tobj.hour;
        this.min=tobj.min+tobj.min;
        this.sec=tobj.sec+tobj.sec;
        return tobj;
    }
    public Timerpblm Substract(Timerpblm obj1,Timerpblm obj2){
        Timerpblm tobj=new Timerpblm();
        this.hour=tobj.hour- tobj.hour;
        this.min=tobj.min-tobj.min;
        this.sec=tobj.sec- tobj.sec;
        return tobj;
    }
    public static void main(String[] args) {
        Timerpblm T1=new Timerpblm(11,30,25);
        Timerpblm T2=new Timerpblm(3,10,10);
        Timerpblm T3=T2.Substract(T1,T2);
    }
}
