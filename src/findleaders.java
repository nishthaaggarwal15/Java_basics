public class findleaders {
    public static void leaders(int[] input) {
        /* Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Print output and don't return it.
         * Taking input is handled automatically.
         */
        int n = input.length;
        int [] leader = new int [n];
        int lc =0;
        int max = input[n-1];
        leader[lc++]= max;
        for(int i =n-2; i>=2; i--){
            if(input[i]>= max){
                max = input[i];
                leader[lc++]=max;
            }
        }
        for(int i = 0; i<lc;i++){
            System.out.print(leader[i]+" ");
        }

    }
    public static void main(String[] args) {
        int arr[]= {1,3,5,6,7,3};

     leaders(arr);
    }
}
