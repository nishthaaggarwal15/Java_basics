import java.util.Scanner;

public class totalsumonboundariesnddiagonals {
    public static void sum(int arr[][]){
        int n = arr.length;
        int sum =0;
        //for top and bottom
        for(int i =0; i<n; i++){
            sum+= arr[0][i];
            sum+= arr[n-1][i];
        }
        //for left and right
        for(int i =1; i<n-1;i++){
            sum+= arr[i][0];
            sum+= arr[i][n-1];
        }
        //diagonal elements
        for(int i =1; i<n-1; i++){
            sum+= arr[i][i];
            sum+= arr[i][n-1-i];
        }
        if(n%2!=){
            sum-= arr[n/2][n/2];
        }
        System.out.println(sum);
    }

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
        sum(arr);
    }
}
