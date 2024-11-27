public class sumofcubes {
    public static void main(String[] args) {
        for(int i = 100;i<1000; i++){
            int y = i /100;
            int o = (i/10)%10;
            int b = i % 10;
            int sumofcubes = (y*y*y)+(o*o*o)+(b*b*b);
            if(sumofcubes == i){
                System.out.println(i);
            }

        }
    }
}

