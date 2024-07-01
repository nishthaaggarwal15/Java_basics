/*
You have been given a random integer array/list(ARR) and a number X. Find and return the number of triplets in the array/list which sum to X.

Note :
Given array/list can contain duplicate elements.
 */
import java.util.Scanner;

public class tripletsum {
    public static int Input (String str){
        Scanner sc = new Scanner(System.in);
        System.out.println(str);
        int input = sc.nextInt();
        return input;
    }
    public static int tripletsum ( int arr[], int cap, int sum ){
        int count = 0;
        for ( int i = 0; i<= cap-3; i++){
            for ( int j = i+1; j<=cap-2; j++){
                for ( int k = j+1; k<= cap -1; k++){
                    if ( arr[i]+ arr[j]+ arr[k] ==sum){
                        count += 1;
                    }
                }
            }
        }
        return count;

    }

    public static void main(String[] args) {
        int cap = Input("enter the capacity of array");
        int arr [] = new int[cap];
        for ( int i = 0; i<arr.length; i++){
            arr[i]= Input("enter the value of index" + i);
        }
        int sum = Input("enter the value of sum");

        System.out.println("no of triplet sum =" + tripletsum(arr,cap,sum) );

    }
}
