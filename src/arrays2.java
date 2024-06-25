import java.util.Scanner;

public class arrays2 {
    public  static  double CalcBalance(int n){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of applicants");
        int numberOfapplicants = n;
        double [] arr = new double[numberOfapplicants];

        for (int i = 1; i< numberOfapplicants; i++){
            System.out.println("details of" + i + "applicant");
            System.out.println("enter your Current Balance");
            double currBalance = sc.nextDouble();
            System.out.println("enter your credit amount");
            double credit= sc.nextDouble();
            System.out.println("enter your debit amount");
            double debit = sc.nextDouble();
            double Balance = currBalance+credit-debit;
            System.out.println(Balance);
            arr[i]= Balance;

        }
        sc.close();
        double minValue = arr[0];
        for (double i:arr){
            System.out.println(i);
            minValue=  Math.min(minValue, i);
        }
        System.out.println("the minimum balance is " +minValue);
        return n;

    }
    public static void main(String[] args) {
CalcBalance(5);
    }
    /*Given an array/list(ARR) of length N, you need to find and return the sum of all the elements in the array/list.
    import java.util.Scanner;

public class Solution {

    public static int sum(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the size of the array
        int N = sc.nextInt();

        // Initialize the array with the given size
        int[] arr = new int[N];

        // Read the array elements
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        // Call the sum function and print the result
        System.out.println(sum(arr));
    }
}
public static int sum(int[] arr) {
    // Initialize the sum variable
    int sum = 0;

    // Iterate through each element in the array and add it to the sum
    for (int i : arr) {
        sum += i;
    }

    // Return the total sum
    return sum;
}
You have been given an array/list(ARR) of size N. You need to swap every pair of alternate elements in the array/list.

You don't need to print or return anything, just change in the input array itself
for ( int i = 0; i< arr.length-1; i+=2){
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1]= temp;
        }

        You have been given a random integer array/list(ARR) of size N. You are required to find and return the second largest element present in the array/list.

  public static int secondLargestElement(int[] arr, int n) {
    	//Your code goes here
        int max1 = arr[0];
        int max2 = max1;
        for ( int i = 1; i<arr.length; i++){
            if (arr[i]> max1){
                max2 = max1;
                max1 = arr[i];
            } else if (arr[i]> max2) {
                   max2 = arr[i];
            }
        }
        return max2;
    }
    Problem statement
You have been given an integer array/list(ARR) of size N which contains numbers from 0 to (N - 2). Each number is present at least once. That is, if N = 5, the array/list constitutes values ranging from 0 to 3 and among these, there is a single integer value that is present twice. You need to find and return that duplicate number present in the array.

Note :
Duplicate number is always present in the given array/list.

public class Solution{

    public static int duplicateNumber(int arr[]) {
        boolean flag = false;
         for ( int i =0; i< arr.length;i++){
             for ( int j = 0; j< arr.length;j++){
                 if ( i!=j && arr[i]== arr[j]){
               flag = true;
                 }
             }
             if ( flag){
                 return arr[i];
             }
         }
         return -1;
    	//Your code goes here
    }
}
You have been given two integer arrays/list(ARR1 and ARR2) of size N and M, respectively. You need to print their intersection; An intersection for this problem can be defined when both the arrays/lists contain a particular value or to put it in other words, when there is a common value that exists in both the arrays/lists.

Note :
Input arrays/lists can contain duplicate elements.

The intersection elements printed would be in the order they appear in the first array/list(ARR1)
public static void intersections(int arr1[], int arr2[]) {
    	//Your code goes here
     boolean[] visited = new boolean[arr2.length];

        for ( int i=0; i< arr1.length; i++){
            for ( int j = 0 ; j< arr2.length;j ++ ){
                if ( arr1[i]== arr2[j] && !visited[j]){
                   System.out.print(arr2[j] + " ");
                   visited[j] = true;
                    break;

                }
            }

        }

    }
    You have been given an integer array/list(ARR) of size N. Where N is equal to [2M + 1].

Now, in the given array/list, 'M' numbers are present twice and one number is present only once.

You need to find and return that number which is unique in the array/list.

 Note:
Unique element is always present in the array/list according to the given condition.
public static int findUnique(int[] arr){
		//Your code goes here
    for ( int i = 0; i< arr.length; i++){
       boolean isUnique = true;
      for ( int j =0 ; j<arr.length;j++){
        if (i!=j && arr[i]== arr[j]){
           isUnique = false;
          break;
        }


         }
if (isUnique){
  return arr[i];
}
    }
    return -1;


    }

     */
}
