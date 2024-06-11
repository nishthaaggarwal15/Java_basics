import java.util.Scanner;

public class practiceset3 {
    public static void main (String [] args){
//        float a= 7/4.0f * 9/2.0f ;
//
//        System.out.println(a);
//        char grade = 'B';
//        grade = (char)(grade+8);
//        System.out.println(grade);
//        grade= (char)(grade-8);
//        System.out.println(grade);
        Scanner sc= new Scanner(System.in);
//        int a = sc.nextInt();
//        System.out.println(a>8);
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
        int  salary= sc.nextInt();
        char grade = sc.next().charAt(0);

        double HRA = 0.20*salary;
        double DA = 0.50*salary;
        double PF = 0.11*salary;

        int Allow;
        if (grade=='A'){
            Allow= 1700;
        }
        else if (grade=='B'){
            Allow=1500;
        }
        else {
            Allow= 1300;
        }

        double Total_Salary = salary+HRA+DA+Allow-PF;
        int roundedSalary = (int)Math.round(Total_Salary);
        System.out.println(roundedSalary);



            }
        }

