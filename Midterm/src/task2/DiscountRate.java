package task2;

public class DiscountRate {
    Visit v;
    double serviceDiscountPremium = 0.2;
    double serviceDiscountGold= 0.15;
    double serviceDiscountSilver = 0.1;

    double productDiscountPremium = 0.1;
    double productDiscountGold = 0.1;
    double productDiscountSilver = 0.1;

    public double getServiceDiscountRate(String s){
        if(s == "Premium"){
            return  v.getServiceExpense();
        }
        if(s == "Gold"){
            return  v.getServiceExpense();
        }
        if(s == "Silver"){
            return  v.getServiceExpense();
        }
        return 0;
    }



    public double getProductDiscountRate(String s){
        if(s == "Premium"){
            return  v.getProductExpence();
        }
        if(s == "Gold"){
            return  v.getProductExpence();
        }
        if(s == "Silver"){
            return  v.getProductExpence();
        }
        return 0;

    }
}
