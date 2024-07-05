import java.util.Scanner;

public class allsubstrings {
//    public static  String Input (String str){
//        Scanner sc = new Scanner(System.in);
//        System.out.println(str);
//        String a = sc.nextLine();
//
//        return a ;
//
//    }
    public static void allsubstring ( char arr[]){
        for ( int i =0 ; i<arr.length;i++){
            for ( int j = i; j<arr.length; j++){
                for (  int k = i; k<= j; k++){
                System.out.print(arr[k]+ " ");
            }
               }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the cap fo char array");
        int n = sc.nextInt();
        char arr[] = new char[n];
        for ( int i = 0; i<arr.length; i++){
            arr[i] =  sc.next().charAt(0);
        }
        allsubstring(arr);
    }
}
