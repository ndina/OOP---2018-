package task3;

import java.util.Vector;
import java.util.Date;

class Manager extends Employee implements Comparable, Cloneable {
    public Vector<Employee> team;
    public int bonus;

    public Manager(){
        super();
        team = new Vector<Employee>();
    }
    public Manager(double salary, Date hireDate, String insurance){
        super(salary, hireDate, insurance);
        team = new Vector<Employee>();
    }
    public void add(Employee e){
        team.addElement(e);
    }

    public double getBonus(){
        if(team.size() > 5){
            return super.getSalary() + 1000;
        }
        else if(team.size() > 3){
            return super.getSalary() + 1500;
        }
        return super.getSalary() + 800;
    }

    public int compareTo(Object otherObject){
        Manager other = (Manager)otherObject;

//        if(salary < other.salary) return 1;       вместо этого мы можем просто написать super
//        if(salary > other.salary) return -1;
          if(super.compareTo(otherObject) == 0){
               if(bonus < other.bonus) return -1;
               if(bonus > other.bonus) return 1;
               return 0;
          }
        return super.compareTo(otherObject);
    }

    public  Manager clone() throws
            CloneNotSupportedException{
        Manager m = (Manager)super.clone();
        m.team = (Vector<Employee>)team.clone();
        return m;

    }

    public String toString(){
        return "insurance number " + super.getInsurance();
    }
}