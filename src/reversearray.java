import java.util.Scanner;

public class reversearray {
public static int Input (String str){
    Scanner sc = new Scanner(System.in);
    System.out.println(str);
    int n = sc.nextInt();
    return n;
}
public static void swap( int arr[], int Left, int Right){
    int temp = arr[Left];
    arr[Left]= arr[Right];
    arr[Right]= temp;
}
public static void reverse ( int arr[]){
    int Left =  0;
    int Right = arr.length -1;
    while ( Left<Right){
        swap(arr, Left,Right);
        Left++;
        Right--;
    }
}
    public static void main(String[] args) {
    int capacity = Input("enter the capacity of array");
        int arr [] = new int [capacity];
        for ( int i = 0; i<arr.length; i++ ){
            arr[i]= Input("enter the value of index" + i + ":");
        }
    reverse(arr);
     for ( int i : arr){
         System.out.print(i+ "  ");
     }
    }
}
