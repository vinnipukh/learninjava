import java.util.Arrays;

public class w322 {
    public static void main(String[] args) {
        int[] x = {1,2,3,4,5,6,7,8,9};
        for(int i = 0; i < x.length/2; i++){
           int temp = x[i];
           x[i] = x[x.length-i-1];
           x[x.length-i-1] =temp;

        }
        System.out.println(Arrays.toString(x));
    }
}
