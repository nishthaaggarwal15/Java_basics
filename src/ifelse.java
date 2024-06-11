import java.util.Scanner;

public class ifelse {
    public static void main (String[] args){
//        if else statement
//        System.out.println("enter your age");
        Scanner sc = new Scanner(System.in);
//        int age= sc.nextInt();
//        if (age>18){
//            System.out.println("yes you can drive");
//        }
//        else{
//            System.out.println("you can't drive");
//        }

//        SWITCH CASE

//        switch (age){
//            case 17:
//                System.out.println("you are not a adult");
//                break;
//            case 23:
//                System.out.println(" you are eligible for a job");
//                break;
//            case 45:
//                System.out.println("you are going to get retired");
//                break;
//            default:
//                System.out.println("you can drive");
//                break;
//        }
//        System.out.println(" enter your gpa");
//        float GPA = sc.nextFloat();
//        System.out.println("enter your stars");
//        float stars = sc.nextFloat();
//        System.out.println("enter your marks");
//        int marks = sc.nextInt();
//        if ( marks>=65 &&(GPA>=3.5|| stars>=3)){
//            System.out.println("eliglible for scholarship");
//        }
//else {
//            System.out.println("not eligible");
//        }




        int score = sc.nextInt();
        if(score>=0&& score< 100){
            if  (score<= 100 && score>89){
                System.out.println("A");
            }
            else if (score<=89 && score>79){
                System.out.println("B");
            }
            else if (score<=79 && score>69){
                System.out.println("C");
            }
            else if (score <=69 && score>59){
                System.out.println("D");
            }
            else if(score<=59 && score>=0) {
                System.out.println("F");
            }}
        else {
            System.out.println("Invalid score");
        }


    }
}
