class Main {

    public static double power(double x, int n) {

        double ans = 1;

        while (n > 0) {

            if (n % 2 == 1) {   // odd
                ans = ans * x;
                n = n - 1;
            } else {            // even
                x = x * x;
                n = n / 2;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        System.out.println(power(2, 10)); // 1024
    }
}