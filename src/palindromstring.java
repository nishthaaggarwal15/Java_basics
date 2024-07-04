import java.util.Scanner;

public class palindromstring {

    public static int Input1( String str){
        System.out.println(str);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        return n;
    }
    public static String Input ( String str){
        System.out.println(str);
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        return input;
    }
    public static boolean checkpalindrome(String s){
        int left = 0;
        int right = s.length()-1;

        while ( left < right){
            if ( s.charAt(left)!=s.charAt(right)){
                return false ;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
           String strr = Input("enter the string");
        String s = new String(strr);

        if (checkpalindrome(s)){
            System.out.println("Given string is palindrome");
        } else {
            System.out.println("Given string is not a palindrome");
        }

    }
}
