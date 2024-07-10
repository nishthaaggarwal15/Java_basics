public class sort012 {
    public static void sort(int[] arr){
        //Your code goes here
        int low =0;
        int mid =0;
        int hight = arr.length-1;
        while(mid<=hight){
            if(arr[mid]==0){
                int temp = arr[low];
                arr[low]= arr[mid];
                arr[mid]= temp;
                low++;
                mid++;
            }
            else if(arr[mid]==1){
                mid++;
            }
            else{
                int temp = arr[hight];
                arr[hight]= arr[mid];
                arr[mid]= temp;
                hight--;

            }
        }
    }
    public static void main(String[] args) {
        int arr []= {1,2,0,0,0,2,1,2,0};

        sort(arr);

    }
}
