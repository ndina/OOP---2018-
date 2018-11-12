package task3;

import java.util.Date;
import java.util.*;

public class Employee extends Person implements Comparable, Cloneable {
    public double salary;
    public Date hireDate;
    public String insurance;

    public Employee(){
        super();
        this.salary = salary;
        this.hireDate = null;
        this.insurance = insurance;
    }

    public Employee(String newName, double salary, Date hireDate, String insurance){
        super(newName);
        this.salary = salary;
        this.hireDate = hireDate;
        this.insurance = insurance;
    }
    public Employee( double salary, Date hireDate, String insuranceNumber) {
        super();
        this.salary = salary;
        this.hireDate = hireDate;
        this.insurance = insuranceNumber;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }
    public double getSalary(){
        return salary;
    }
    public void setYear(Date hireDate){
        this.hireDate= hireDate;
    }
    public Date getYear(){
        return hireDate;
    }
    public void setInsurance(String insurance){
        this.insurance = insurance;
    }
    public String getInsurance(){
        return insurance;
    }

    public boolean equals(Object obj) {
        Employee e = (Employee)obj;
        if(this.name == e.name)
            if(super.equals(obj)){
                return true;
            }
        return false;
        //return super.equals(obj);

        // return super.equals(e) && (this.salary == e.salary);
    }

    public int compareTo(Object otherObject){
        Employee other = (Employee)otherObject;
        if(salary < other.salary) return -1;
        if(salary > other.salary) return 1;

        return 0;
    }

    public Employee clone() throws CloneNotSupportedException{
        Employee e = (Employee)super.clone();
        e.hireDate = (Date) hireDate.clone();
        return e;
    }

    public String toString(){
        return super.toString() + " salary: " + salary + " year: " + hireDate + " insurance number: " + insurance;
    }

}