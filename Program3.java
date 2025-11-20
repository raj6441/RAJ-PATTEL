import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of a: ");
        int a = sc.nextInt();

        int terms = (a + 1) / 2;  

        for (int i = 1; i <= terms; i++) {
            int term = 2 * i - 1;   
            System.out.print(term);
            if (i < terms) {
                System.out.print(", ");
            }
        }

        sc.close();
    }
}
