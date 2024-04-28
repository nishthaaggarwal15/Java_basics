import java.util.Scanner;

public class Cbseboard {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter you name");
        String name= sc.nextLine();
        System.out.println(" enter you marks in maths");
        int maths = sc.nextInt();
        System.out.println("enter you marks in english");
        int english = sc.nextInt();
        System.out.println(" enter your marks in social science");
        int sst = sc.nextInt();
        System.out.println(" enter you marks in hindi");
        int hindi = sc.nextInt();
        System.out.println("enter you marks in science");
        int science = sc.nextInt();;
//        int percentage= ( maths + english+ sst+ hindi+ science)/500*100;
        float sum = (maths+ english+ sst+ hindi+ science);
        float per = (sum/500)*100;
        System.out.println( name + " you percentage is " + per);





    }
}
