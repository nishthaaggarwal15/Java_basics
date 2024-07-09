import java.util.Scanner;
/*
For a given two-dimensional integer array/list of size (N x M), print the array/list in a sine wave order, i.e, print the first column top to bottom, next column bottom to top and so on.
 */

public class waveprint {


    public static void wavePrint(int mat[][]){
        //Your code goes here
        if (mat == null || mat.length == 0 || mat[0].length == 0) {
            return;
        }
        int n = mat.length;
        int m = mat[0].length;

        for (int col = 0; col < m; col++) {
            if (col % 2 == 0) {
                // Even indexed column: top to bottom
                for (int row = 0; row < n; row++) {
                    System.out.print(mat[row][col] + " ");
                }
            } else {
                // Odd indexed column: bottom to top
                for (int row = n - 1; row >= 0; row--) {
                    System.out.print(mat[row][col] + " ");
                }
            }
        }}
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter no of rows ");
            int rows = sc.nextInt();
            System.out.println("enter no of columns");
            int columns = sc.nextInt();
            int arr[][]= new int[rows][columns];
            for(int i =0 ; i<rows; i++){
                for(int j =0; j<columns; j++){
                    System.out.println("enter the value of (" + i + " " +j + ") element");
                    arr[i][j]=sc.nextInt();
                }
            }
            wavePrint(arr);

        }
    }
