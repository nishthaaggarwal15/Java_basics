import java.util.Scanner;

public class sumoftwoarrays {
    public static int Input( String str){
        System.out.println(str);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        return n;
    }
    public static void SumOfArrays (int A[], int B[], int sum[]){
        int i = A.length-1;
        int j = B.length-1;
        int k = sum.length-1;
        int carry =0;
        while (i>=0 && j>=0){
            int total = A[i]+ B[j]+ carry;
            sum[k]= total%10;
            carry = total/10;
            i--;
            j--;
            k--;
        }
        while (i>=0){
            int total = A[i]+carry;
            sum[k]= total%10;
            carry = total/10;
            i--;
            k--;
        }
        while (j>=0){
            int total = B[j]+ carry;
            sum[k]= total%10;
            carry = total/10;
            j--;
            k--;
        }
        if (carry != 0) {
            sum[k] = carry;
        }
    }
    public static void main(String[] args) {
     int sizeofA = Input("enter the size of array A");
     int A[] = new int[sizeofA];
     int sizeofB = Input("enter the size of array B");
     int B[]= new int[sizeofB];
     for ( int i = 0; i< A.length; i++){
         A[i]= Input("enter the value of " + i + " index of Array A");
     }
        for ( int i = 0; i< B.length; i++){
            A[i]= Input("enter the value of " + i + " index of Array B");
        }
int maxLengthOfArrays = Math.max(A.length, B.length) +1;
        int [] sum = new int[maxLengthOfArrays];
        SumOfArrays(A,B,sum);
    }
}
