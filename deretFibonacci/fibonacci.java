import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Fibonacci Sequence Generator ===");
        System.out.print("Masukkan jumlah suku yang diinginkan: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Jumlah suku harus lebih besar dari 0.");
        } else {
            System.out.println("Deret Fibonacci:");
            long a = 0, b = 1;
            for (int i = 1; i <= n; i++) {
                System.out.print(a + (i < n ? ", " : "\n"));
                long next = a + b;
                a = b;
                b = next;
            }
        }

        scanner.close();
    }
}
