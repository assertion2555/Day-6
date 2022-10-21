import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        int n, sum = 0;
        System.out.println("Enter any Number =");
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum = sum + i;
            }
        }
        if (n == sum) {
            System.out.println("Given No is perfect number");
        } else {
            System.out.println("Not perfect number");
        }

    }
}
