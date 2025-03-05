package OOPS.ExcerciseQuestions;

class Employee {
    String firstname;
    String lastname;
    double salary;
    public Employee(String firstname, String lastname, double salary){
         this.firstname=firstname;
         this.lastname=lastname;
         this.salary=salary;
    }
    public String getFirstname() {
        return firstname;
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if(salary>0.0)
            this.salary = salary;
    }

}
public class EmployeeTest {
    public static void main(String[] args) {
        Employee Emp1 = new Employee("Srihari", "gatreddi", 45000D);
        Employee Emp2 = new Employee("Viveak", "gatreddi", 50000D);
        System.out.println(Emp1.salary);
        System.out.println(Emp2.salary);
        Emp1.setSalary(-1);
        System.out.println(Emp1.salary);
        Emp1.setSalary(Emp1.salary + 10000);
        System.out.println(Emp1.salary);
    }
}
