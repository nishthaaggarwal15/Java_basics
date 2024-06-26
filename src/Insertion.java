import java.util.Scanner;

public class Insertion {
    public static int Input ( String a){
        Scanner sc = new Scanner(System.in);
        System.out.print(a);
        int n = sc.nextInt();
        return n;
    }
    public  static  int insert ( int A[], int size, int position , int element ){
        for ( int i = size; i> position ; i--){
            A[i]= A[i-1];
        }
        A[position]= element;
        size++;
        return size;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for ( int j = 0 ; j<=5 ; j++){
    int capacity = Input("enter the capacity");
    int size = Input("enter the size of array");
    int A[]= new int [capacity];
    for ( int i = 0; i<size; i++){
        A[i]= Input("enter the element at " + i + "index");
    }
    int position = Input("enter the position at which you want to insert the array");
    int element = Input("enter the element you want to insert");
       insert(A, size, position,element);
       for ( int i : A){
           System.out.print(i+ " ");
       }
       boolean flag = true;
            System.out.println("Do you wish to continue, Choose 1 for yes and 2 for No");
            int n = sc.nextInt();

            switch (n){
                case 1 : flag = true;
                break;
                case 2 : flag = false; break;
                default:
                    System.out.println("Invalid choice. Exiting.");
                    flag = false;
                    break;

            }
            if (flag == false){
                break;
            }


    }
}}
