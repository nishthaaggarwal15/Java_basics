import java.util.Scanner;

public class reversechararray {
    public static String reversechararray (char[]arr){
        int left =0;
        int right = arr.length-1;
        while (left<right){
            char temp = arr[left];
            arr[left]= arr[right];
            arr[right] = temp;
            left++;
            right--;

        }
        return  new String(arr);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String input = sc.nextLine();

        // Convert the input string to a character array
        char[] arr = input.toCharArray();
        System.out.println(" reversed char array is :" + reversechararray(arr));

    }
}
