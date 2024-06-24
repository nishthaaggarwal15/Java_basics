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
}
