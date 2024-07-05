/*
Problem statement
For a given string(str), remove all the consecutive duplicate characters.

Example:
Input String: "aaaa"
Expected Output: "a"

Input String: "aabbbcc"
Expected Output: "abc"
 Input Format:
The first and only line of input contains a string without any leading and trailing spaces. All the characters in the string would be in lower case.
Output Format:
The only line of output prints the updated string.
 */
import java.util.Scanner;

public class removeduplicatesfromstring {
    public static String removeduplicate(String str){
        char [] arr = str.toCharArray();
        int index = 1;
        for (int i = 1; i<arr.length; i++){
            if(arr[i] != arr[index-1]){
                arr[index++]= arr[i];
            }
        }
        return new String(arr,0,index);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String s = new String(line);
        System.out.println(removeduplicate(s));
    }
}
