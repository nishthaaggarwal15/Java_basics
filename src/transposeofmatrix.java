import java.util.Scanner;

public class transposeofmatrix {
    public static int[][] transpose(int m, int n, int[][] mat) {
        // Write your code here
        int[][] transposed = new int[n][m];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                transposed[j][i] = mat[i][j];
            }
        }

        return transposed;}
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
        transpose(columns,rows,arr);
    }
}
