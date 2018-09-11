public class Repeat {

    public static int[] arr(int[] a){
        int[] b = new int[a.length * 2];
        int index = 0;
        for(int i = 0; i < a.length; i++){
            b[index] = a[i];
            index++;
            b[index] = a[i];
            index++;
        }
        return b;
    }

    public static void main(String[] args){
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = arr(arr1);

        for(int i = 0; i < arr2.length; i++){
            System.out.print(arr2[i]);
        }
    }
}
