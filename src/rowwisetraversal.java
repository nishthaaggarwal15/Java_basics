import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class rowwisetraversal {
    public static int [] traversal( int [][] arr){
        int N = arr.length;
        int M = arr[0].length;
        int a[] = new int[N*M];
        int index = 0;
        for ( int i= 0; i<N; i++){
            for (int j =0; j<M; j++){
              a[index++]= arr[i][j];
            }
        }
        return  a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no of rows");
        int rows= sc.nextInt();
        System.out.println("enter no of coloumns");
        int column = sc.nextInt();
        int [][] arr = new int [rows][column];
        for ( int i =0; i< arr.length; i++){
            for ( int j =0; j<arr[0].length; j++){
                System.out.println("Enter the value of element (" + i + ", " + j + "):");
                arr[i][j]= sc.nextInt();
            }
        }
        int [] result = traversal(arr);
        System.out.println("new array would be " + Arrays.toString(result));
    }
}
