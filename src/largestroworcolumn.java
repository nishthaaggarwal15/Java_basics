import java.util.Scanner;

public class largestroworcolumn {

    public static void largestcolumnrow(int arr [][]) {
    int rows = arr.length;
    int column = arr[0].length;
    int maxrowsum= Integer.MIN_VALUE;
    int maxrowindex= -1;
    int maxcolsum = Integer.MIN_VALUE;
    int maxcolindex =-1;
    //calculate row sum
    for(int i =0; i<rows; i++){
        int rowsum=0;
        for(int j =0; j<column;j++ ){
            rowsum += arr[i][j];}
            if(rowsum>maxrowsum){
                maxrowsum = rowsum;
                maxrowindex =i;
        }}
        //calculate column sum
        for(int j=0; j<column; j++){
          int colsum =0;
          for(int i =0; i<rows; i++){
              colsum += arr[j][i];}
              if(colsum>maxcolsum){
                  maxcolsum = colsum;
                  maxcolindex =j;
              }
          }
        if(maxrowsum> maxcolsum){
            System.out.println("row" + maxrowindex + maxrowsum);
        }
        else if ( maxcolsum > maxrowsum){
            System.out.println("column" + maxcolindex + maxcolsum);
        }
        else {
            System.out.println(" row and column have equal sum" + " row index -" +maxrowindex + "column index-"+ maxcolindex +"Row sum -"+ maxrowsum +"Column sum -"+ maxcolsum);
        }
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of rows");
        int rows = sc.nextInt();
        System.out.println("enter number of column");
        int column = sc.nextInt();
        int arr [][]= new int[rows][column];
        for ( int i = 0; i<rows;i++){
            for(int j =0; j<column;j++){
                System.out.println("enter the value of element ("+ i+ " "+ j + ")");
                arr[i][j]= sc.nextInt();
            }
        }
        largestcolumnrow(arr);
    }
}
