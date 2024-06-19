import java.util.Scanner;

public class methods {
    public  static  void printName(String name, long number, int rollno){
        System.out.println("Name:"+ name);
        System.out.println("Number:"+ number);
        System.out.println("roll no: "+ rollno);
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
            printName(name,number, rollno);
        }

}}