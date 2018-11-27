public class Register {
    public Register(){

    }
    private boolean isRegOpen;

    public boolean openReg() {

        if(isRegOpen == true) {
            System.out.println("Open");
            return true;
        }
        else
            System.out.println("Closed");
        return false;

    }
}