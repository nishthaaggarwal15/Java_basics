import java.util.Scanner;

public class practiceset6 {
    public static void main(String[]args){


        // create a array of 5 floats and calculate their sum
//        float [] marks = {2.3f, 5.6f,6.7f,8.9f,2.5f};
//        float sum = 0;
//        for( float elements:marks){
//            sum= sum+ elements;
//        }
//        System.out.println("the sum of 5 floats is" + sum);

        // WAP to find out wthether the given integer is presenet in array or not
        //Or GUESS THE NUMBER
         int [] numbers= { 2, 4,5, 6,7};

        Scanner sc= new Scanner(System.in);

        System.out.println("Guess the Number");
         int num= sc.nextInt();
         boolean isInArray= false;

         for(int element:numbers){
             if(num== element){
                 isInArray= true;
                 break;
             }

             }
        if(isInArray){
            System.out.println("You guessed it right");
        }
        else {
            System.out.println("You guessed it wrong");
         }
    }
}
