public class mock12 {
    public static void main(String[] args) {


        for (int n = 1000; n <= 9999; n++   ) {
            int numdivisors = 0;

            for (int i = 1; i <= n; i++) {
                if(n % i == 0){
                    numdivisors++;
                }

            }
            if (numdivisors == 22) {
                System.out.println(n);

            }

        }


    }
}