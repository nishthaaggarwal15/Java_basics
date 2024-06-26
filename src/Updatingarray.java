import java.util.Scanner;

public class Updatingarray {
    public  static int Input (String str){
        Scanner sc = new Scanner(System.in);
        System.out.println(str);
        int n = sc.nextInt();
        return n;
    }
    public  static  void Update( int arr[],int key , int newKey ){
        for ( int i = 0; i<arr.length; i++){
            if (arr[i]== key){
                arr[i]= newKey;
                return ;
            } }
        System.out.println("no such key found");
    }
    public static void main(String[] args) {
int capacity = Input("enter the capacity");
int arr[] = new int [capacity];
for ( int i = 0; i<arr.length; i++){

   arr[i]= Input("enter the value of "+ i + "index");

}
        int key = Input("enter the key you want to replace");
        int newKey = Input("enter the new key");
       Update(arr,key,newKey);

        for (  int  i : arr){
            System.out.print(i+ " ");
        }
    }
}
