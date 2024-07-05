import java.util.Scanner;

public class highestoccuringcharacter {
    public static char checkfrequency(String str){
        // Array to keep track of character frequencies
        int[] frequency = new int[26];

        // Step 1: Count the frequency of each character in the string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i); // Get the current character
            frequency[ch - 'a']++; // Increment the frequency for this character
        }

        // Step 2: Find the character with the highest frequency
        int maxFrequency = 0; // Variable to store the maximum frequency found
        char result = ' '; // Variable to store the character with the highest frequency
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i); // Get the current character
            // Check if the frequency of this character is higher than maxFrequency
            if (frequency[ch - 'a'] > maxFrequency) {
                maxFrequency = frequency[ch - 'a']; // Update maxFrequency
                result = ch; // Update the result to the current character
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("highest occuring string is :" + checkfrequency(str));
    }
}
