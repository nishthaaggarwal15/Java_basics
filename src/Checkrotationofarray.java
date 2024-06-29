public class Checkrotationofarray {
    public static int arrayRotateCheck(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return i + 1; // Return the rotation index
            }
        }
        return 0; // If no rotation is found, the array is not rotated
    }

    public static void main(String[] args) {
        int[] arr = {5, 6, 1, 2, 3, 4};
        System.out.println(arrayRotateCheck(arr)); // Output: 2
    }
}
