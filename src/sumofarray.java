public class sumofarray {

    public static void main(String[] args) {
        int[] x = {6,7,8,9};
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
