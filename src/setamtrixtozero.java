import java.util.Scanner;

public class setamtrixtozero {
    public static void settozero ( int arr [][]){
        int rows = arr.length;
        int column = arr[0].length;
         boolean firstrowiszero = false;
         boolean firstcolumniszero= false;
       for( int i = 0; i< rows; i++){
           if (arr[i][0]==0){
               firstcolumniszero = true;
               break;
           }}
           for ( int j =0; j< column; j++){
               if(arr[0][j]==0){
                   firstrowiszero = true;
                   break;
               }
           }
           for ( int i =0; i<rows; i++){ // if ith + jth element is zero then turn the first row and first column corresponding to that elemwnt will turn to 0
               for (int j =0; j<column; j++){
                   if(arr[i][j]==0){
                       arr[i][0]=0;
                       arr[0][j]=0;
                   }
               }
           }
           for( int i =1; i<rows; i++){ // we turned first row and column to zero now exclufing that if first column ore element of ith row is zero then turn the whole column to zero
               if(arr[i][0]==0){
                   for(int j =1; j<column; j++){
                       arr[i][j]=0;
                   }
               }
           }
           for(int j =1; j<rows;j++){ // we turned first row and column to zero now exclufing that if first row or element of jth column is zero then turn the whole row to zero
               if(arr[0][j]==0){
                   for( int i =1; i<rows; i++){
                       arr[i][j]=0;
                   }
               }
           }
           if(firstrowiszero){ // then all columns of that will turn to zero
               for(int j=0; j<column;j++){
                   arr[0][j]=0;
               }
           }
           if(firstcolumniszero){ // then all rows of that column will turn to zero
               for(int i =0;i<rows; i++){
                   arr[i][0]=0;
               }
           }
       }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no  of rows");
        int rows = sc.nextInt();
        System.out.println("enter no of columns");
        int columns = sc.nextInt();
        int [][] arr = new int[rows][columns];
        for ( int i =0; i<rows; i++){
            for ( int j =0; j<columns; j++){
                System.out.println("enter the value of (" + i + j +") element");
                arr[i][j] = sc.nextInt();
            }
        }
        settozero(arr);
       for(int i = 0; i<rows; i++){
           for (int j =0; j<columns; j++){
               System.out.print(arr[i][j]);
           }
           System.out.println();
       }

    }
}
