import java.util.Scanner;
import java.util.concurrent.LinkedBlockingDeque;

public class Zeroesatendofarray {
    public static int Input (String a){
        Scanner sc = new Scanner(System.in);
        System.out.println(a);
        int n = sc.nextInt();
        return n;
    }
    public static void swap ( int arr[], int z , int nz){
        int temp = arr[z];
        arr[z]= arr[nz];
        arr[nz]= temp;
    }

    public static void Push(int arr[]){
        int nz= 0;
        int z= 0;
        while (z<arr.length){
            if (arr[z]!=0){
            swap (arr,z,nz);
            nz++;
        }
            z++;}


    }
    public static void main(String[] args) {
        int capacity = Input("enter the capacity of array");
        int [] arr = new int[capacity];
        for ( int i = 0; i<arr.length; i++){
            arr[i]= Input("enter the value of " + i + "index");
        }
Push(arr);
        for ( int i : arr){
            System.out.print(i+ " ");
        }
        /*
        You are given an array 'ARR' consisting of 'N' integers. You need to rearrange the array elements such that all negative numbers appear before all positive numbers.

Note:
The order of elements in the resulting array is not important.
   public static void swap ( int a[], int p, int n){
        int temp = a[p];
        a[p]= a[n];
        a[n]= temp;
    }
    public static int[] separateNegativeAndPositive(int a[]) {
         int n = 0;
         int p = 0;
         while ( p < a.length ){
             if ( a[p]<0){
                 swap( a, p, n);
                 n++;
             }
             p++;
         }
         return a;
    }
         */
    }
}
