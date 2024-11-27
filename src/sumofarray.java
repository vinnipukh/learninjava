import java.util.Arrays;

public class sumofarray {

    public static void main(String[] args) {
        int[] x = {1,2,3,4,5};
        System.out.println(sumof(x));
    }

    public static int sumof(int[] a){
        int sum = 0;
        for(int i:a){
             sum += i;


        }
        return sum;
    }
}
