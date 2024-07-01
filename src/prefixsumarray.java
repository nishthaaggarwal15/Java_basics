/*
For Array A of size n, the prefix sum of A is another array P of size n+1, where P[i] represents the sum of the first i elements of A. That is,

P[0] = A[0]
P[1] = A[0] + A[1]
P[2] = A[0] + A[1] + A[2]
...
P[n-1] = A[0] + A[1] + ... + A[n-1]
You will given an array arr of length n along with an output array of the same length. Your objective is to populate the output array as required, without the need to print or return anything.
 */

import java.util.Scanner;

public class prefixsumarray {
    public static int Input( String str){
        System.out.println(str);
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        return input;
    }
    public static void prefixsum ( int A[], int P []){
        if (A.length == 0) return;
        P[0] = A[0];
        for (int i = 1; i < A.length; i++) {
            P[i] = P[i - 1] + A[i];
        }
    }


    public static void main(String[] args) {
        int cap = Input("enter the capacity of the array");
        int A[]= new int[cap];
        int P[] = new int[cap];
        for ( int i = 0; i<A.length; i++){
            A[i] =Input("enter the value of " + i + "index");

        }
       prefixsum(A, P);
       for ( int i : P){
           System.out.print(i + " ");
       }

    }
}
