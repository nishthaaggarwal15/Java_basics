import java.util.Scanner;

public class ifelse {
    public static void main (String[] args){
//        if else statement
        System.out.println("enter your age");
        Scanner sc = new Scanner(System.in);
        int age= sc.nextInt();
//        if (age>18){
//            System.out.println("yes you can drive");
//        }
//        else{
//            System.out.println("you can't drive");
//        }

//        SWITCH CASE

        switch (age){
            case 17:
                System.out.println("you are not a adult");
                break;
            case 23:
                System.out.println(" you are eligible for a job");
                break;
            case 45:
                System.out.println("you are going to get retired");
                break;
            default:
                System.out.println("you can drive");
                break;
        }


    }
}
