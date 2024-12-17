public class acdef {
    public static long getSum(long n){
        long sum = 0;
        while(n != 0){
            sum += n %10;
            n /= 10;
        }
        return sum;

    }
    public static void main(String[] args) {
        long mincount = 0,mind = Long.MAX_VALUE,maxd = Long.MIN_VALUE;
        long[] sums = new long[10000];
     for(long i = 1; i<=10000;i++){
         long value = 3*i*i+i+1;
         long sum = getSum(value);
         sums[(int) (i-1)] = sum;
         if(sum < mind){
             mind = sum;
             mincount = 1;
         }
         else if(sum == mind){
             mincount++;
         }
         if(sum>maxd){
             maxd= sum;

         }
     }
        System.out.println("Minimum value: "+mind);
        System.out.println("Maximum value: "+maxd);
        System.out.println("How many times did minumum occur: "+mincount);



    }
}
