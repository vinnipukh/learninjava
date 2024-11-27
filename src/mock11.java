public class mock11 {
    public static void main(String[] args) {
        int n = 12;
        int numDivisors = 0;
        for(int i =1; i<=n;i++){
            if(n % i == 0){
                numDivisors++;
            }


        }

        System.out.println(numDivisors);
    }
}