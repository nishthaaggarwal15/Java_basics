import java.util.Scanner;

public class methods {
    public  static  void printDetails(String name, long number, int rollno){
        Scanner sc = new Scanner(System.in);
        System.out.println("Name:"+ name);
        System.out.println("Number:"+ number);
        System.out.println("roll no: "+ rollno);
        System.out.println("enter your current balance");
        double currentBalance = sc.nextDouble();;
        System.out.println("enter the credit amount");
        double credit = sc.nextDouble();
        System.out.println("enter the debit amount");
        double debit = sc.nextDouble();
        double Balance =   CalcBalance(currentBalance,credit,debit);
        System.out.println("Balance"+Balance );

    }
public  static double CalcBalance (double currentBalance, double credit , double debit){
        return currentBalance+credit-debit;
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for ( int i = 1; i<=5; i++){
            System.out.println(" Student NO:" + i);
            System.out.println("Enter your details");
            System.out.println("Enter your name");
            String name = sc.next();
            System.out.println("Enter your phone no");
            long number = sc.nextLong();
            System.out.println("Enter your roll no");
            int rollno= sc.nextInt();



            printDetails(name,number, rollno);
        }
        //Area of circle
//        public static double calculateCircleArea(double radius)
//        {
//            // write your logic here !!
//            double area = 3.14159 *radius*radius;
//            return area;
//
//
//
//        }
//        public static void main (String [] args){
//            Scanner sc = new Scanner(System.in);
//            double radius = sc.nextDouble();
//            double ar1= calculateCircleArea(radius);
//            System.out.println(ar1);
//        }


        /*Given two numbers, x, and y, calculate and Return their GCD.

GCD stands for "Greatest Common Divisor." It refers to the largest positive integer that divides two or more numbers without leaving a remainder.
 public static int findGCD(int a, int b) {
        // write the logic

        while (b != 0) {
            int temp = b; // Store current y value in a temporary variable
            b= a % b;    // Update y to be the remainder of x divided by y
            a = temp;     // Update x to be the old value of y
        }
        return a;


    }public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println(Solution.findGCD(num1, num2));
    }


    Check whether a given number ’n’ is a palindrome number.

Note :
Palindrome numbers are the numbers that don't change when reversed.
You don’t need to print anything. Just implement the given function.
Example:
Input: 'n' = 51415
Output: true
Explanation: On reversing, 51415 gives 51415.
public static boolean palindromeNumber(int n){
        // Write your code here.
        int original = n;
        int reversed = 0;

        // Reverse the number
        while (n != 0) {
            int digit = n % 10; // Get the last digit
            reversed = reversed * 10 + digit; // Build the reversed number
            n /= 10; // Remove the last digit
        }
        if (reversed!=original){
            return false;
        }
        return true;
    }
         */
}}