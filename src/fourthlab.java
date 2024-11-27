public class fourthlab {
    public static int bolmesayaci(int number) {
        int count = 0;
        for (int i = 1; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                count++;
                if (i != number / i) {
                    count++;
                }
            }
        }
        return count;
    }

    public static int tekbolenli() {
        int n = 1001;
        while (true) {
            if (bolmesayaci(n) % 2 != 0) {
                return n;
            }
            n++;
        }
    }
    public static void main(String[] args) {
        int tekbolenli = tekbolenli();
        System.out.println(tekbolenli);
    }
}