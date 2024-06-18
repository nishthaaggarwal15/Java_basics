import java.util.Scanner;
public class patterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        for( int i = 1; i<= n ;i++){
//         for(int j = i; j>=i; j--){
//             System.out.print(i);
//         }
//            System.out.println();
//        }
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(i);
//            }
//            System.out.println();
//
//            int count = 0;
//            for (int k = 1; k <= n; k++) {
//                for (int g = 1; g <= k; g++) {
//                    System.out.print(count + " ");
//                    count++;
//                }
//                System.out.println();
//
//
//            }
//
//            for (int k = 1; k <= n; k++) {
//                int f = k;
//                for (int g = 1; g <= k; g++) {
//
//                    System.out.print(f + " ");
//                    f++;
//                }
//                System.out.println();
//
//            }
//        for (int k = 1; k <= n; k++) {
//            int count = n;
//            for (int g = 1; g <= k; g++) {
//                System.out.print(count + " ");
//                count--;
//            }
//            System.out.println();
////

        // Pyramaid
//        for ( int i = 1; i<=n; i++){
//            for ( int j =1 ; j<=n-i; j++){
//                System.out.print(" ");
//            }
//            for ( int k = 1 ; k<=2*i-1; k++){
//                System.out.print(k);
//            }
//            System.out.println();
//        }

        /* Print the following pattern for the given N number of rows.

Note :
print spaces between the numbers.
Pattern for N = 3
1 2 3
2 3 1
3 1 2*/
//        for ( int i = 0; i<n;i++){
//
//            for ( int j =i+1; j<=n;j++){
//                System.out.print(j+ " ");
//
//            }
//            for (int k = 1 ; k<=i;k++){
//                System.out.print(k+" ");
//            }
//
//            System.out.println();
//        }

        /*Print the following pattern for the given N number of rows.

Pattern for N = 3
123
1  2
123*/
        // Loop through each row
//        for (int i = 1; i <= n; i++) {
//            // Loop through each column in the row
//            for (int j = 1; j <= n; j++) {
//                // Check conditions to print numbers or spaces
//                if (i == 1 || i == n || j == 1 || j == n) {
//                    // Print numbers for first row, last row, first column, and last column
//                    System.out.print(j);
//                } else {
//                    // Print space for middle columns in middle rows
//                    System.out.print(" ");
//                }
//            }
//            // Move to the next line after each row
//            System.out.println();

        /*Print the following pattern for the given N number of rows.

Pattern for N = 3
123
1  2
123*/
//        int num = 1;
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= n; j++) {
//                if (i == 1 || i == n) {
//                    // Print numbers for the first and last row
//                    System.out.print(num++);
//                } else {
//                    // Print numbers for the first and last columns of the middle rows
//                    if (j == 1 || j == n) {
//                        System.out.print(num++);
//                    } else {
//                        // Print spaces for the middle columns of the middle rows
//                        System.out.print(" ");
//                    }
//                }
//            }
//            // Move to the next line after each row
//            num=1;
//            System.out.println();
//        }
        //MIRROR IMAGE OF A TRIANGLE
//        for ( int i = 1; i<=n;i++){
            //for spaces
//            for (int j = 1; j<= n-i;j++){
//                System.out.print(" ");
//            }
//            // for stars
//            for ( int k = 1; k<=i; k++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        //Hour glass of triangle
//        for( int i = 1; i<=n;i++){
//            for( int j = 1; j<=i-1;j++){
//                System.out.print(" ");
//            }
//
//            for (int k= i; k<=n;k++) {
//                System.out.print(k + " ");
//            }
//            System.out.println();
//        }
//        for ( int i=n-1; i>=1; i--){
//            for( int j = 1; j<=i-1;j++){
//                System.out.print(" ");
//            }
//
//            for (int k= i; k<=n;k++) {
//                System.out.print(k + " ");
//            }
//            System.out.println();
//        }
// REVERSE CHAR PATTERNN
//        for (int i =1 ; i<=n; i++){
//            char alpha =  (char) ('A'+ n-1);
//            for ( int j= 1 ; j<=i; j++){
//                System.out.print(alpha);
//                alpha--;
//            }
//            System.out.println();
//        }


        //DIAMOND OF STARS
        /* Print the following pattern for the given number of rows.

Note: N is always odd.


Pattern for N = 5*/
//        int N  = sc.nextInt();
//        int n1= (N+1)/2;
//        int n2= n1-1;
//        for ( int i = 1; i<=n1;i++){
//            for( int j =1 ; j<=n1-i;j++){
//                System.out.print(" ");
//            }
//            for ( int k =1; k<=2*i-1;k++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        for ( int i =n2; i>=1; i--){
//            for ( int j =1;j<=n2-i+1;j++){
//                System.out.print(" ");
//            }
//            for ( int k=1 ; k <=2*i-1;k++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        //fILLED K SHAPE
//        for (int i =n; i>=1;i--){
//            int count =i;
//            for ( int j =1; j<=i;j++){
//                System.out.print (count+ " ");
//                count--;
//            }
//            System.out.println();
//        }
//        for ( int i= 2;i<=n;i++){
//            int count = i;
//            for ( int j =1; j<=i;j++){
//                System.out.print(count +" ");
//                count--;
//            }
//            System.out.println();
//
//        }
        // ISOSCLES TRIANGLE
//        for ( int i =1 ; i<=n; i++){
//            for ( int j =1; j<=n-i; j++){
//                System.out.print(" ");
//            }
//            int count = i;
//            for ( int k = 0; k<i;k++){
//                System.out.print(count);
//                count++;
//            }
//            count -=2;
//            for ( int g =1; g<i; g++){
//                System.out.print(count);
//                count--;
//            }
//            System.out.println();
//        }
    }}


