import java.util.Scanner;

public class stringss {
    public static void main (String[] args){
//        String name= new String("harry");
//        System.out.println(name);
//        int a= 5;
//        float b= 8.6f;
//        System.out.printf(" the value of  a is  %d and b is %nf ",a,b);
//        System.out.format("%d",a);
//        System.out.println("enter your name");
//        Scanner sv= new Scanner(System.in);
//        String name= sv.nextLine();
//        System.out.println(name.length());
//        System.out.println(name.trim());
//        System.out.println(name.toLowerCase());
//        System.out.println(name.toUpperCase());
//        System.out.println(name.concat("have a good day"));
//        System.out.println(name.substring(4));
//         try {
//             System.out.println(name.substring(3,5));
//         }
//         catch (Exception e ){
//             System.out.println("not enough characters");
//         }
//         try {
//             System.out.println(name.replace('r', 'a'));
//         }
//         catch (Exception e){
//             System.out.println("not contain these characters");
//         }
//String start= sv.nextLine();
//        System.out.println(name.startsWith(start));
//        try{
//            System.out.println(name.charAt(7));
//        }
//        catch ( Exception e){
//            System.out.println("not enough characters");
//        }
//        System.out.println(name.indexOf(name));
//        System.out.println(name.lastIndexOf(name));
//        System.out.println(name.equals("nish"));

//        String myname= "harry";
//        System.out.println(myname.equalsIgnoreCase("nishtha"));
        String str = "An apple a day keeps the doctor away";
        int count = 0;
        for ( int i = 0; i< str.length();i++){
            if( str.charAt(i)==' '){
            count++;
            }
        }
        System.out.println(count+1);
    }
}
