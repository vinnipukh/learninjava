public class sumofdigits {
    public static int getSum(int n){
        int sum = 0;
        while(n != 0){
            sum += n %10;
            n /= 10;
        }
        return sum;

    }

    public static void main(String[] args) {
        int n = 438587758   ;
        System.out.println(getSum(n));

    }


}
