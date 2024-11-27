public class sumtwentyfive {
    public static void main(String[] args) {
        for(int i = 100;i<1000; i++){
            int y = i /100;
            int o = (i/10)%10;
            int b = i % 10;
            int sumtwentyfive = y+o+b;
            if(sumtwentyfive == 25){
                System.out.println(i);
            }

        }
    }
}
