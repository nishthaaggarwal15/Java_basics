import java.util.Scanner;

public class practiceset4 {
    public static  void main (String [] args){
        Scanner sc= new Scanner(System.in);

//        System.out.println(" enter your name");
//          String name= sc.nextLine();
//
//        System.out.println(" enter your marks in maths");
//        float maths= sc.nextFloat();
//
//        System.out.println(" enter your marks in english");
//        float english = sc.nextFloat();
//
//        System.out.println("enter your marks in science");
//        float science= sc.nextInt();
//
//        float sum = maths+ english + science;
//        float percentage= (sum/300)*100;
//
//        if (percentage> 40){
//            System.out.println( name+ " your percentage is" + percentage);
//            System.out.println(name+ "you are pass");
//        }
//        else if ( percentage>=33 && percentage<=40 ){
//            System.out.println(name+ "your percantage is "+ percentage);
//            System.out.println(name+ "you are a average student");
//        }
//
//
//        else {
//            System.out.println(name+ " your percentage is" + percentage);
//            System.out.println(name+ "you are fail");
//        }
//
//        int day= sc.nextInt();
//        switch(day){
//            case 1 -> System.out.println("monday");
//            case 2-> System.out.println("tuesday");
//            case 3-> System.out.println(" wednesday");
//            case 4-> System.out.println(" thrusday");
//            case 5-> System.out.println(" firday");
//            case 6-> System.out.println("saturday");
//            case 7-> System.out.println("sunday");
//
//
//
//
//
//
//
//        }
//        System.out.println("enter the year");
//        int year= sc.nextInt();
//        if ( (year%4==0 && year%100 !=0) ||  year%400==0){
//            System.out.println("this is a leap year");
//        }
//else {
//            System.out.println("this is not a leap year");
//        }
//
//
//

        String website = sc.next();
        if( website.endsWith(".org")) {
            System.out.println(" this is an organisation website");
        }
        else if( website.endsWith(".com")) {
            System.out.println("this is an commercial website");
        }
        else if (website.endsWith(".in")){
            System.out.println("this is an indian website");
        }
else {
            System.out.println("this is not a website");
        }
    }







}
