/*
Problem statement
Given 2 sorted arrays (in increasing order), find a path through the intersections that produces maximum sum and return the maximum sum.

That is, we can switch from one array to another array only at common elements.

If no intersection element is present, we need to take sum of all elements from the array with greater sum.
 */

import java.util.Scanner;

public class maximisethesum {

    public static long maximumSumPath(int[] input1, int[] input2) {
        /* Your class should be named Solution
         * Don't write main().
         * Don't read input, they are passed as function arguments.
         * Return output and don't print it.
         * Taking input and printing output is handled automatically.
         */
        int n1= input1.length;
        int n2= input2.length;
        int i=0; int j=0; long result =0; int sum1=0; int sum2=0;
        while(i<n1&&j<n2){
            if(input1[i]< input2[j]){
                sum1+= input1[i++];
            } else if(input1[i]>input2[j]){
                sum2+= input2[j++];
            }
            else{
                result+= Math.max(sum1, sum2);
                sum1=0; sum2=0;
                while(i<n1&& j<n2&& input1[i]== input2[j]){
                    result+= input1[i++];
                    j++;
                }
            }
        }
        while(i<n1){
            sum1+= input1[i++];
        }
        while(j<n2){
            sum2+= input2[j++];
        }
        result+= Math.max(sum1, sum2);
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no of rows 1");
        int rows1 = sc.nextInt();

        int arr1[]= new int[rows1];
        for(int i =0 ; i<rows1; i++){

                System.out.println("enter the value of (" + i + " "  + ") element");
                arr1[i]=sc.nextInt();


    }
        System.out.println("enter no of rows 2 ");
        int rows2 = sc.nextInt();
        int arr2[]= new int[rows2];
        for(int i =0 ; i<rows2; i++){

                System.out.println("enter the value of (" + i + " "  + ") element");
                arr1[i]=sc.nextInt();
            }



        System.out.println(maximumSumPath(arr1, arr2));
}}
