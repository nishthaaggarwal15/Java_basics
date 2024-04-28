import java.util.Scanner;

public class userInputtt {
    public static void main(String[] args) {
//
        System.out.println("input-");
        Scanner sc = new Scanner(System.in);
//        System.out.println("enter number 1");
////        int a = sc.nextInt();
//        float a = sc.nextFloat();
//        System.out.println("enter  number 2");
////        int b = sc.nextInt();
//        float b = sc.nextFloat();
//        System.out.println("enter number 3");
////        int c = sc.nextInt();
//        float c = sc.nextFloat();
//        System.out.println(" the sum of 3 numbers is");
//        float sum= a+b+c;
//        System.out.println(sum);
//        boolean b1= sc.hasNextInt();
//        System.out.println(b1);
//String src= sc.nextLine();
//        System.out.println(src);

        System.out.println("enter your name.");
        String name= sc.nextLine();
        System.out.println(" enter the marks in maths ");
        float maths = sc.nextInt();
        System.out.println("enter the marks in science");
       float science= sc.nextInt();
        System.out.println("enter the marks in english");
        float english = sc.nextInt();
        System.out.println("enter you marks in sst");
        float sst= sc.nextInt();
        System.out.println("enter your marks in hindi");
        int hindi = sc.nextInt();
        float sum=maths+ science+english+sst+hindi;
        float per= (sum/500) *100;
        if ( per<33){
            System.out.println("sorry"+ name+ "you are fail");
            System.out.println("your percentage is " + per);
        }
        else {
            System.out.println(" Congratulations" + name + "you are pass");
            System.out.println("your perecentage is" + per);
        }
    }
}
