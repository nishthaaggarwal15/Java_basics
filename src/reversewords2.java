import java.util.Scanner;

public class reversewords2 {
    public static String reversestring (String currentword){
        String finalword = "";
        for ( int i = currentword.length()-1; i>=0; i--){
            finalword += currentword.charAt(i);
        }
        return finalword;
    }
    public static String reverseEachWord(String str) {
        //Your code goes here
        String finalString ="";
        String []arr = str.split(" ");
        for ( int i = 0; i<arr.length; i++){
            String currentword = arr[i];
            String reversedword = reversestring(currentword);
            finalString += reversedword + " ";
        }
        return finalString;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        String str = new String(string);
        System.out.println(reverseEachWord(str));

    }
}
