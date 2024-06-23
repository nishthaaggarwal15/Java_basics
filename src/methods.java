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

}}