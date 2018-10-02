class Employee extends Person{
    public double salary;
    public int year;
    public String insurance;

    public Employee(){
        super();
        this.salary = salary;
        this.year = year;
        this.insurance = insurance;
    }

    public Employee(String newName, double salary, int year, String insurance){
        super(newName);
        this.salary = salary;
        this.year = year;
        this.insurance = insurance;
    }
    public Employee( double salary, int year, String insuranceNumber) {
        super();
        this.salary = salary;
        this.year = year;
        this.insurance = insuranceNumber;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }
    public double getSalary(){
        return salary;
    }
    public void setYear(int year){
        this.year = year;
    }
    public int getYear(){
        return year;
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


    public String toString(){
        return super.toString() + " salary: " + salary + " year: " + year + " insurance number: " + insurance;
    }
}
