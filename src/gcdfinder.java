public class gcdfinder {
    /*public static int gcd(int a, int b) {
        int sonuc = 0;

        for(int i = 1; i<a && i<b; i++){
            if(a % i == 0 && b % i == 0){
                sonuc = i;

            }

        }
        return sonuc;

    }*/
    /*public static int gcd(int a, int b){
        while(a != b){
            if (a > b){
                a /= a -b ;

            }
            else{
                b /= b - a;


            }
        }
        return a;
    }*/
    public static int gcd(int a, int b){
        int temp = 0;

       while(b!=0){
           temp = b;
           b = a % b;
           a = temp;


       }
       return a;


    }



    public static void main(String[] args) {
        System.out.println(gcd(2000000000,2050000000));
    }

}
