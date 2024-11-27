public class countdivisor {

    public static void main(String[] args) {

        int count = 0;
        int boluneceksayi = 12;
        for (int i = 1; i <= boluneceksayi; i++) {
            if (boluneceksayi % i == 0) {
                System.out.println(i);
                count++;
            }
        }
        System.out.println(count);
    }
}

