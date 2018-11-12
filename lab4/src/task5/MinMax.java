package task5;

public class MinMax {
    int minimum, maximum;
    int maxi = -12;
    int mini = 1000;


//    public MinMax(int minimum, int maximum){
//        this.minimum = minimum;
//        this.maximum = maximum;
//    }

    static class Pair{
        int minimum;
        int maximum;
    }

    static Pair minmax(int values[]){
        Pair res = new Pair();
        int mi = values[0] , ma = values[0];

        for(int i = 0; i < values.length; i++){
            if(values[i] < mi){
                mi = values[i];
            }
            else if(values[i] > ma){
                ma = values[i];
            }
        }
        return res;
    }
}
