// as it can be understood from to class name, i was tasked with reversing an array of integers at the problem link:(https://www.w3resource.com/java-exercises/array/java-array-exercise-11.php)
import java.util.Arrays;

public class reversearray {
    public static void main(String[] args) {
        int[] x = {1,2,3,4,5,6,7,8,9};

        for(int i= 0;i<x.length/2; i++){
            int temp= x[i];
            x[i] = x[x.length-i-1];
            x[x.length-i-1] = temp;

        }
        System.out.println(Arrays.toString(x) );

    }
}
