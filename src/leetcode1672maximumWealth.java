public class leetcode1672maximumWealth {
    public static int maximumWealth(int[][] accounts) {
        int sum = 0;

        for (int[] account : accounts) {
            int temp = 0;

            for (int i : account) {
                temp += i;

            }
            sum = Math.max(sum, temp);

        }

        return sum;

    }

    public static void main(String[] args) {
        int[][] accounts= {
                {1,2,3,4},
                {9,8,7,6}
        };


        System.out.println(maximumWealth(accounts));
    }
}
