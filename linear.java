public class LinearSearch {

    // Method to perform linear search
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            // Check if the current element is the target
            if (arr[i] == target) {
                return i; // Target found
            }
        }
        return -1; // Target not found
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 7, 1, 9}; // Unsorted array
        int target = 7;

        int result = linearSearch(arr, target);

        if (result == -1) {
            System.out.println("Element not found in the array.");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }
}
