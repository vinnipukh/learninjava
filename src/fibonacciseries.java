public class fibonacciseries {
    public static void main(String[] args) {
        int n = 20;
        int a =0, sum = 1;
        for(int i = 2; i<=n; i++){
            int temp = a + sum;
            a = sum;
            sum = temp;
        }
        System.out.println(sum);
    }
}
