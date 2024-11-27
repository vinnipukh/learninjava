public class mock10 {
    public static void main(String[] args) {
        double ln2 = 0;
        for(int i=1; i <= 1000; i++){
            if(i % 2 == 0){
                ln2 -= 1.0/ i ;

            }
            else{
                ln2 += 1.0/i;
            }


        }
        System.out.println(ln2);
    }
}
