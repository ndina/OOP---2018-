public class Sequence {

    private String s;

    public void setVal(String s){
        this.s = s;
    }
    boolean isPalindrome(){
        int cnt = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == s.charAt(s.length() - i - 1)){
                return true;
            }
        }
        return false;
    }

    public String isSubString(Sequence s2){
        return s.substring(0);
    }

    }
//
//
//}
