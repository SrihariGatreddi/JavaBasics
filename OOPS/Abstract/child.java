package OOPS.Abstract;

public class child extends parent{
    public child(String name) {
        super(name);
    }
    @Override
    public void carrer() {
        System.out.println("I want to become Enginnerr!!");
    }
    @Override
    public void partner(){
        System.out.println("I like KeerthySuresh");
        System.out.println(this.name);
    }
   @Override
    public void intro(){
        super.intro();
   }
}
