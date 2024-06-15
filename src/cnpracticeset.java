import java.util.Scanner;

public class cnpracticeset {

    public static void main(String[] args) {
        //FIBONACCI SERIES
//    int a = 0;
//    int b = 1;
//    System.out.println(a);
//    System.out.println(b);
//    int count = 8;
//while (count>0){
//    int c = a+b;
//    System.out.println(c);
//    a=b;
//    b=c;
//    count--;
//}
        //GUESS THE NUMBER\
//    Scanner sc = new Scanner(System.in);
//    Random rc= new Random();
//    int randomnum= rc.nextInt(10);
//    int guessednum;
//    do {
//        System.out.println("enter the number ");
//        guessednum= sc.nextInt();
//    }while (guessednum!=randomnum);
//    System.out.println("you guessed it right");
/*
Write a program that asks the user for a number N and a choice C. And then give them the possibility to choose between computing the sum and computing the product of all integers in the range 1 to N (both inclusive).



If C is equal to -
 1, then print the sum
 2, then print the product
 Any other number, then print '-1' (without the quotes)
 */
//        Scanner sc = new Scanner(System.in);
//        // System.out.println("Choose the number");
//        int n = sc.nextInt();
//        // System.out.println("Choose 1 for the sum and Choose 2 for the product");
//        int c = sc.nextInt();
//        int sum = 0;
//        int product = 1;
//        switch(c){
//            case 1:
//                for(int i =1; i<=n; i++){
//                    sum += i;
//                }
//                System.out.println(sum);
//                break;
//            case 2 :
//                for (int j = 1; j<=n;j++){
//                    product *= j;
//                }
//                System.out.println(product);
//                break;
//            default:
//                System.out.println("-1");
//                break;
//        }
//        sc.close();


        /*Given three positive integers as X, Y and Z representing three sides of a triangle, write a program that determines whether the triangle formed by the sides exist or not. If the triangle exists, classify it as isosceles, scalene or equilateral.

Condition for valid Triangle:
Sum of any two of its sides should be greater than the third side


Detailed explanation ( Input/output format, Notes, Images )
Input Format:
Line 1: X(First Side)
Line 2: Y(Second Side)
Line 3: Z(Third Side)
Output Format:
First line of output prints "Not a Triangle"(If triangle doesn't exist) or "Scalene/Isosceles/Equilateral Triangle" (If the triangle exists)*/

        // write your code logic here !!
//                Scanner sc = new Scanner(System.in);
//        int X = sc.nextInt();
//        int Y = sc.nextInt();
//        int Z = sc.nextInt();
//
//        // Correct Triangle Inequality Check
//        if (X + Y > Z && Y + Z > X && X + Z > Y) {
//            if (X == Y && Y == Z) {
//                System.out.println("Equilateral Triangle");
//            } else if (X == Y || Y == Z || Z == X) {
//                System.out.println("Isosceles Triangle");
//            } else {
//                System.out.println("Scalene Triangle");
//            }
//        } else {
//            System.out.println("Not a Triangle");
//        }





        /*Write a program to calculate the total salary of a person. The user has to enter the basic salary (an integer) and the grade (an uppercase character), depending upon which the total salary is calculated as:

    Total_salary = Basic + HRA + DA + Allow – PF
where :
HRA   = 20% of basic
DA    = 50% of basic
Allow = 1700 if grade = ‘A’
Allow = 1500 if grade = ‘B’
Allow = 1300 if grade = ‘C' or any other character
PF    = 11% of basic.
Round off the total salary and then print the integral part only.



Note for C++ users :

To round off the value, please include<cmath> library at the start of the program and round off the values in this way.
int ans = round(yourFinalValue);
Detailed explanation ( Input/output format, Notes, Images )
Input format :
Basic salary & Grade (separated by space)
Output Format :
Total Salary*/
//        int  salary= sc.nextInt();
//        char grade = sc.next().charAt(0);
//
//        double HRA = 0.20*salary;
//        double DA = 0.50*salary;
//        double PF = 0.11*salary;
//
//        int Allow;
//        if (grade=='A'){
//            Allow= 1700;
//        }
//        else if (grade=='B'){
//            Allow=1500;
//        }
//        else {
//            Allow= 1300;
//        }
//
//        double Total_Salary = salary+HRA+DA+Allow-PF;
//        int roundedSalary = (int)Math.round(Total_Salary);
//        System.out.println(roundedSalary);


       /* Given an integer N, print all the prime numbers that lie in the range 2 to N (both inclusive).

        Print the prime numbers in different lines.*/
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        for ( int i = 2; i<=n; i++){
//            boolean flag = true;
//            for (int j =2; j<i;j++){
//                if(i%j==0){
//                    flag = false;
//                    break;
//                }
//
//            }
//            if ( flag== true){
//                System.out.println(i);
//            }
//        }

        /*
        Write a program that takes a number as input and prints all its factors except 1 and the number itself..
         If the number has only two factors (1 and the number itself), then the program should print -1.
         */
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        boolean hasfactors = false;
//
//        for (int i = 2; i < n; i++) {
//            if (n % i == 0) {
//                if (hasfactors) {
//                    // Print a space before each factor except the first one
//                    System.out.print(" ");
//                }
//                System.out.print(i);
//                hasfactors = true;
//            }
//        }
//        if(!hasfactors){
//            System.out.println("-1");
//        }


    }
}
