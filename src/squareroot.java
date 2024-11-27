public class squareroot {
    public static void main(String[] args) {
        int posint = 26;

        int a = 1;
        boolean durum = false;
        for(int i = 1;(i*i)<posint; i++){
            if(posint == i*i){
                System.out.println(i);
                durum = true;
                break;

            }
            a = i;

        }
        if(durum == false){
            System.out.println("The number you provided has a square root between "+(a)+" and "+(a+1));

        }
    }
}
