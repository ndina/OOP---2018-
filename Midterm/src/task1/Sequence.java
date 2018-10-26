package task1;


public class Sequence {
    private String ss;
    public Sequence(){

    }
    public Sequence(String s){
        ss=s;
    }
    public boolean isPalindrom(){
        int cnt=0;
        for(int i=0;i<ss.length()/2;i++){
            if(ss.charAt(i)==ss.charAt(ss.length()-i-1)){
                cnt++;
            }
        }
        if(cnt==ss.length()/2){
            return true;
        }
        return false;
    }

    public boolean isSubString(Sequence s){
        if(ss.contains(s.ss)){
            return true;
        }
        else return false;
    }

}