package OOPS.comparingObjects;

import java.sql.Struct;

public class Student implements Comparable<Student>{//to understand this refer GenericInterface and Main in same package
    int rollno;
    float marks;

    public Student(int rollno, float marks) {
        this.rollno = rollno;
        this.marks = marks;
    }

    public static void main(String[] args) {
        Student srihari=new Student(12,96.4f);
        Student abhi=new Student(34,89.0f);
        if(srihari.compareTo(abhi)>0){
            System.out.println("Srihari has more marls");
        } else if (srihari.compareTo(abhi)<0) {
            System.out.println("Abhi has more marks");
        }
        else
            System.out.println("both have same marks");
    }

    @Override
    public int compareTo(Student o) {
        int diff=(int)(this.marks - o.marks);
        return diff;
    }
}
