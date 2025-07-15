public class Sum {
    public static void main(String[] args) {
        int n = 121;
        int sum = 0;
        int temp = n;
        while (n != 0) {
            int rem = n % 10;
            int fact = 1;
            for (int i = 1; i <= n ; i++) {
                fact *= i;
            }
            sum = sum + fact;
            n = n / 10;
        }
        System.out.println(sum == temp ? "Strong" : "Weak");


    }
}
