import java.util.Random;
import java.util.Scanner;


public class rockpaperscisoorgame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        var i = 0;
        while (i <5) {

            System.out.println(" Choose One: \n1 Scissor \n2 Rock \n3 Paper ");
            int player = sc.nextInt();
            switch (player) {
                case 1 -> System.out.println("You chose Scissor");
                case 2 -> System.out.println(" You chose Rock");
                case 3 -> System.out.println("You chose Paper");


            }
            Random rc = new Random();
            int computer = rc.nextInt(1, 4);
            switch (computer) {
                case 1 -> System.out.println("Computer chose Scissor");
                case 2 -> System.out.println("Computer chose Rock");
                case 3 -> System.out.println(" Computer chose Paper");
            }

            if (player == computer) {
                System.out.println("It's a draw");
            } else if (player == 1 && computer == 2) {
                System.out.println("Computer has won");

            } else if (player == 1 && computer == 3) {
                System.out.println("You Won");
            } else if (player == 2 && computer == 1) {
                System.out.println("You won");
            } else if (player == 2 && computer == 3) {
                System.out.println("Computer has won");
            } else if (player == 3 && computer == 1) {
                System.out.println("Computer has won");
            } else if (player == 3 && computer == 2) {
                System.out.println("You Won");
            }


     i++;   }
        System.out.println("Thanks for Playing");
    }
}