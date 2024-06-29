import java.util.Scanner;

public class optimisedarrayrotation {
    public static int Input (String str) {
        Scanner sc = new Scanner(System.in);
        System.out.println(str);
        int n = sc.nextInt();
        return n;
    }
    public static void swap ( int left , int right, int arr[]){
        int temp = arr[left];
        arr[left]= arr[right];
        arr[right]= temp;
    }
    public static void reverse ( int arr[],  int left, int right){

       while (left<right){
            swap ( left , right, arr);
           left++;
            right--;
        }
    }

//    public static void reversesubarray ( int arr[], int rotations,int left , int right){
//
//        while (left<right){
//            swap(left, right, arr);
//            left++;
//            right--;
//        }
//    }
  public static void main(String[] args) {
        int cap = Input("enter the capacity of the array");
        int arr [] = new int[cap];
        for ( int i = 0; i<arr.length; i++){
            arr[i]= Input("enter thw value of"+ i + "index");
        }

      int rotations = Input("enter the number of rotations");
      rotations = rotations % arr.length; // handle cases when number of rotations are greater than length of array
        int input = Input("choose type of rotation, 1 for clockwise and 2 for anticlockwise");
        if ( input== 1){
            reverse(arr, 0, cap-1);
            reverse(arr,0, rotations-1);
            reverse( arr, rotations, cap-1);
        } else if ( input ==2){
            reverse(arr, 0, cap-1);
            reverse(arr, 0, cap-rotations-1);
            reverse(arr, cap-rotations ,cap-1);
        }


       for ( int i : arr ){
           System.out.print(i+ " ");
       }



    }
}





























