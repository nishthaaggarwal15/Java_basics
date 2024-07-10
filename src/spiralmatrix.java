import java.util.Scanner;

public class spiralmatrix {
    public static void printspiral ( int arr [][]){

       //for rows
        int top =0;
        int bottom = arr.length-1;
        //for columns
        int left = 0;
        int right = arr[0].length-1;
        while (left<=right && top<=bottom){
            for ( int i =left; i<=right;i++ ){
                System.out.print(arr[top][i] + " ");
            }
            top++;
            for( int i=top ; i<=bottom;i++){
                System.out.print(arr[i][right] + " ");
            }
            right--;
            if(top<=bottom){
            for(int i = right; i>=left;i--){
                System.out.print(arr[bottom][i] + " ");
            }}
            bottom--;
            if(left<=right){
            for(int i = bottom; i>=top; i--){
                System.out.print(arr[i][left] + " ");
            }}
            left++;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of rows ");
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
        printspiral(arr);
    }
}
