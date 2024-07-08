import java.util.Scanner;

public class jaggedarrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no of rows");
        int rows = sc.nextInt();
        int [][] arr = new int[rows][];
        for(int i =0; i<rows;i++){
            System.out.println("enter no of columns or elements in " + i + " row ");
            int cols = sc.nextInt();//no of columns for ith row
            arr[i] = new int[cols]; //intializing inner array
            for(int j =0; j<cols; j++){
                System.out.println("Enter element [" + i + "][" + j + "]");
                arr[i][j]= sc.nextInt();

            }}

            System.out.println("The entered 2D array is:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }

        }

    }

