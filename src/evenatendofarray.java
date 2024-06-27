import java.util.Scanner;

public class evenatendofarray {
    public  static int Input ( String str){
        Scanner sc = new Scanner(System.in);
        System.out.println(str);
        int n = sc.nextInt();
        return n;
    }
    public static void swap(int arr[], int odd, int even){
        int temp = arr[even];
        arr[even]= arr[odd];
        arr[odd]= temp;
    }
    public static  void evenatheend(int arr[]){
        int odd = 0;
        int even = 0;
        while (even<arr.length){
            if (arr[even]%2!=0){
                swap(arr, odd, even);
                odd++;
            }
            even++;
        }

    }

    public static void main(String[] args) {
        int capacity = Input("enter the capacity of array");
        int arr[] = new int[capacity];
        for ( int i = 0; i<arr.length; i++){
            arr[i]= Input("enter vale of "+ i + "indeex");
        }
        evenatheend(arr);
        for ( int i : arr){
            System.out.print(i+ " ");
        }
    }
}
