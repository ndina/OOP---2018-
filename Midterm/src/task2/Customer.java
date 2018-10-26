package task2;

public class Customer {
    String name;
    boolean member;
    String memberType;

    public Customer(){}

    public Customer(String name){
        this.name = name;
    }

    String getName(String n){
        return n;
    }

    boolean isMember(){
        if(memberType == "Premium" || memberType == "Gold" || memberType == "Silver"){
            return true;
        }
        return false;
    }

    public void setMember(Boolean member){
        member = member;
    }

    public String getMemberType(){
        return memberType;
    }

    public void setMemberType(String s){
        memberType = s;
    }

    public String toString(String s){
        return "Customer's name is " + name;
    }
}
