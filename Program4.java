public class Program4 {
    public static void main(String[] args) {

        int[] arr = {1,2,8,9,12,46,76,82,15,20,30};

        // Loop 1 to 9
        for (int i = 1; i <= 9; i++) {
            int count = 0;

            // Check every number in array
            for (int num : arr) {
                if (num % i == 0) {   // divisible
                    count++;
                }
            }

            System.out.println(i + " : " + count);
        }
    }
}
