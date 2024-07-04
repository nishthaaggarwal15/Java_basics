import java.util.Scanner;

public class reversewords {
    public static String reversestring(String s, int start, int end) {
        String reversed ="";
        for ( int i =end; i>= start; i--){
            reversed = reversed + s.charAt(i);
        }
        return  reversed;
    }
    public static String reversewords(String str){
      String  finalString ="";
      int start =0;
      for ( int i =0; i< str.length(); i++){
          if ( str.charAt(i) == ' ' || i ==str.length()-1){
              int end = (i== str.length()-1) ? i:i-1;
              String reverseword = reversestring(str,start,end);
              finalString += reverseword + " ";
              start = i+1;
          }
      }
      return finalString;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        String str = new String(string);
        System.out.println(reversewords(str));

    }
}
