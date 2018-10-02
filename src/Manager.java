import java.util.Vector;

class Manager extends Employee {
   public Vector<Employee> team;
   public int bonus;

   public Manager(){
       super();
       team = new Vector<Employee>();
   }
   public Manager(double salary, int year, String insurance){
       super(salary, year, insurance);
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

   public String toString(){
       return "insurance number " + super.getInsurance();
   }
}
