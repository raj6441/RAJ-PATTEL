import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of a: ");
        int a = sc.nextInt();

        for (int i = 1; i <= a; i++) {
            int term = 2 * i - 1;  // 1,3,5,7...
            System.out.print(term);
            if (i < a) {
                System.out.print(", ");
            }
        }

        sc.close();
    }
}
