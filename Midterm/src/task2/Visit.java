package task2;

import org.omg.CORBA.portable.ValueInputStream;

import java.util.Date;

public class Visit {
    Customer customer = new Customer("Dina");
   // Customer customer;
    Date date;

    double serviceExpense;
    double productExpence;

    Visit(String name, Date date){
        name = name;
        date = date;
    }

    public String getName(String name){
        return name ;
    }

    double getServiceExpense(){
        if(customer.isMember() && customer.getMemberType() == "Premium"){
            return serviceExpense* 0.8;
        }

        if(customer.isMember() && customer.getMemberType() == "Gold"){
            return serviceExpense* 0.85;
        }
        if(customer.isMember() && customer.getMemberType() == "Silver"){
            return serviceExpense* 0.9;
        }

        return serviceExpense;

    }

     public void setServiceExpense(double d){
        serviceExpense = d;
     }

     public double getProductExpence(){
         if(customer.isMember()) {
             return productExpence * 0.9;
         }
        return productExpence * 0.9;
     }

     public void setProductExpence(double d){
        productExpence = d;
     }

     public  double getTotalExpence(){
        return getProductExpence() + getProductExpence();
     }

     public String toString(){
        return customer.name + " gets a " + getServiceExpense() + " service expence ";
     }
}
