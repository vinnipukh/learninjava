public class mock13 {
    public static void main(String[] args) {
        for(int j =1000; j<10000;j++){
            int count = 0;
            for (int i = 1; i <= j; i++) {
                if (j % i == 0) {
                    count++;
                }
            }
            if(count == 22){
                System.out.println(j);
            }


        }

    }

}
