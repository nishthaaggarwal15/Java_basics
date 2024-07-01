import java.util.Scanner;

public class pairsum {
    public static int Input (String str){
        Scanner sc = new Scanner(System.in);
        System.out.println(str);
        int input = sc.nextInt();
        return input;
    }
    public static int pairsum ( int arr[], int cap, int sum ){
        int count = 0;

            for ( int j = 0; j<=cap-2; j++){
                for ( int k = j+1; k<= cap -1; k++){
                    if ( arr[j]+ arr[k] ==sum){
                        count += 1;
                    }
                }

        }
        return count;

    }

    public static void main(String[] args) {
        int cap = Input("enter the capacity of array");
        int arr [] = new int[cap];
        for ( int i = 0; i<arr.length; i++){
            arr[i]= Input("enter the value of index" + i);
        }
        int sum = Input("enter the value of sum");

        System.out.println("no of pair sum =" + pairsum(arr,cap,sum) );

    }
}
