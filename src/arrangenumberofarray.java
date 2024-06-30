import java.util.Scanner;
public class arrangenumberofarray {
    public static void arrange(int[] arr, int n) {
        int start = 0;
        int end = n - 1;

        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {  // if the number is odd
                arr[start] = i;
                start++;
            } else {  // if the number is even
                arr[end] = i;
                end--;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] ARR = new int[N];

        arrange(ARR, N);

        // Output the array to verify (for testing purposes only)
        for (int num : ARR) {
            System.out.print(num + " ");
        }
    }
}
