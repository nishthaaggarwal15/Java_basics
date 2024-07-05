/*
Problem statement
For a given a string(str) and a character X, write a function to remove all the occurrences of X from the given string.

The input string will remain unchanged if the given character(X) doesn't exist in the input string.
 */
import java.util.Scanner;

public class removealloccureceofchar {
    public static String removeAllOccurrencesOfChar(String str, char ch) {
        // Your code goes here
        int index = 0;
        char [] arr = str.toCharArray();
        for ( int i =0; i<arr.length; i++){
            if(arr[i] != ch){
                arr[index++]= arr[i];
            }
        }
        String ss = new String(arr,0,index);
        return ss;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String s = new String(line);
        char ch = 'a';
        System.out.println(removeAllOccurrencesOfChar(s,ch));
    }
}
