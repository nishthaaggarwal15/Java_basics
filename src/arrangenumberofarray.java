/*
You have been given an empty array(ARR) and its size N. The only input taken from the user will be N and you need not worry about the array.

Your task is to populate the array using the integer values in the range 1 to N(both inclusive) in the order - 1,3,5,.......,6,4,2.

Note:
You need not print the array. You only need to populate it.
 */

import java.util.Scanner;
public class arrangenumberofarray {
    public static int Input(String str){
        Scanner sc = new Scanner(System.in);
        System.out.println(str);
        int input  = sc.nextInt();
        return input;
    }

    public static void arrange(int[] arr, int n) {

        int right = 0;
        int left = arr.length-1;
        for ( int i = 1; i<=n; i++){
            if (i%2 == 0){
                arr[left]=i;
                left--;
            }
            else{
                arr[right]=i;
                right++;
            }
        }
    }

    public static void main(String[] args) {
      int capacity = Input("enter the capacity of the array");
      int [] arr = new int[capacity];
      int n= Input("enter the range from 1 to n");
      for (int i = 0;i<arr.length;i++){
          arr[i]= Input("enter the value of " + i + "index");
      }
      arrange(arr,n);
      for ( int i : arr){
          System.out.print(i + " ");
      }
    }
}
