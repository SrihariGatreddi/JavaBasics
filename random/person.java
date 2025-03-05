import java.util.*;
public class person {
    String fname;
    String lname;

    public person(String fname, String lname) {
        this.fname = fname;
        this.lname = lname;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }
    public void displayDetails(){
        System.out.printf("Firstname:%s \n Lastname:%s",this.fname,this.lname);
    }
    static class student extends person{
        int id;
        String course;
        String Tname;
        public student(int id,String course,String Tname,String fname,String lname) {
            super(fname,lname);
            this.id=id;
            this.course=course;
            this.Tname=Tname;
        }
        public void displayDetails(){
            super.displayDetails();
            System.out.printf("Student Id:%d \n Student Course:%s \n Teacher name:%s \n",this.id,this.course,this.Tname);
        }
    }
    static class Teacher extends person{
        String Subname;
        Double Salary;

        public Teacher(String fname, String lname, String subname, Double salary) {
            super(fname, lname);
            this.Subname = subname;
            this.Salary = salary;
        }
        public void displayDetails(){
            super.displayDetails();
        }
    }

    public static void main(String[] args) {
        student ob1=new student(4241,"btech","meena","sri","hari");
        Teacher ob2=new Teacher("meena ","bhagavathula","java",80000d);
        ob1.displayDetails();
        ob2.displayDetails();
    }

}
