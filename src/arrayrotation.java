import java.util.Scanner;

public class arrayrotation {
    public static int Input (String str){
        Scanner sc = new Scanner(System.in);
        System.out.println(str);
        int n = sc.nextInt();
        return n;
    }
    public static void clockwise( int arr[], int brr[], int num){
        for ( int  j = 0; j<arr.length; j++){
                brr[(j+num)% arr.length]= arr[j];
            }
    }
    public static void anticlockwise( int arr[], int brr[], int num){
        for ( int i = 0; i<arr.length; i++){
            brr[(i-num+ arr.length)% arr.length]= arr[i];
        }
    }

    public static void main(String[] args) {
        int capacity = Input("enter the capacity of the array");
        int arr[]= new int[capacity];
        int brr[]= new int [capacity];

    for ( int i = 0; i<arr.length; i++){
        arr[i]= Input("enter the value of " + i+ " index");
    }

    int num = Input("enter the number of rotattons");
    int type = Input("choose type of rotation , choose 1 for clockwise and 2 for anticlockwise");
        System.out.println("orignal array :");
    for ( int i : arr){
        System.out.print( i + " ");

    }

    if ( type == 1){
        clockwise(arr,brr,num);
    } else if (type==2){
        anticlockwise ( arr, brr, num);
    } else {
        System.out.println("Invalid Choice");
    }

        System.out.println( "Updated array :");
    for ( int i : brr){

        System.out.print( i + " ");
    }

    }
}
