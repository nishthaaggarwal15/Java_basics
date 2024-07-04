import java.util.Scanner;

public class reversestring {
    public static String Input ( String str){
        Scanner sc = new Scanner(System.in);
        System.out.println(str);
        String Input = sc.nextLine();
        return Input;
    }


    public static void reversestring(String s){
        String reverseds ="";
//        for ( int i =s.length()-1; i>=0;i--){
//            reverseds = reverseds + s.charAt(i);
//        }
        for ( int i =0; i<s.length(); i++){
            reverseds = s.charAt(i) + reverseds;
        }
        System.out.println(reverseds);
    }

    public static void main(String[] args) {
        String line = Input("enter the string");
        String s = new String(line);
reversestring(s);

    }
}
