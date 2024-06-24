import java.util.Scanner;

public class arrays2 {
    public  static  double CalcBalance(int n){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of applicants");
        int numberOfapplicants = n;
        double [] arr = new double[numberOfapplicants];

        for (int i = 1; i< numberOfapplicants; i++){
            System.out.println("details of" + i + "applicant");
            System.out.println("enter your Current Balance");
            double currBalance = sc.nextDouble();
            System.out.println("enter your credit amount");
            double credit= sc.nextDouble();
            System.out.println("enter your debit amount");
            double debit = sc.nextDouble();
            double Balance = currBalance+credit-debit;
            System.out.println(Balance);
            arr[i]= Balance;

        }
        sc.close();
        double minValue = arr[0];
        for (double i:arr){
            System.out.println(i);
            minValue=  Math.min(minValue, i);
        }
        System.out.println("the minimum balance is " +minValue);
        return n;

    }
    public static void main(String[] args) {
CalcBalance(5);
    }
    /*Given an array/list(ARR) of length N, you need to find and return the sum of all the elements in the array/list.
    import java.util.Scanner;

public class Solution {

    public static int sum(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the size of the array
        int N = sc.nextInt();

        // Initialize the array with the given size
        int[] arr = new int[N];

        // Read the array elements
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        // Call the sum function and print the result
        System.out.println(sum(arr));
    }
}
public static int sum(int[] arr) {
    // Initialize the sum variable
    int sum = 0;

    // Iterate through each element in the array and add it to the sum
    for (int i : arr) {
        sum += i;
    }

    // Return the total sum
    return sum;
}

     */
}
