public class testerfor3 {
    public static void main(String[] args){
        Employee e1 = new Employee("Mark", 15000, 2000, "5th" );
        Employee e2 = new Employee("Kat", 20000, 2005, "12th" );
        Animal a = new Animal();
        System.out.println(e1.toString());

        System.out.println(e1.equals(a));

        e2.setName("Mark");
        System.out.println(e2.toString());

        if(e1.equals(e2)){
            System.out.println(0);
        }
        else{
            System.out.println(1);
        }
        Manager m = new Manager(150000, 2012, "20th");
        m.add(e1);
        m.add(e2);
        System.out.println(m.getBonus());
    }
}
