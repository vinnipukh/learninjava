
public class dordunculab {
    public static void main(String[] args) {

        int num = 26, tekbolenli;
        for (int i = 1; i <= num; i++) {
            if (i * i == num) {
                System.out.println(i);
                break;
            }
            else if(i*i >= num){
                System.out.println("This number has no square root");
                System.out.println(i);
                System.out.println(i-1);
                break;

            }
        }
    }

}
