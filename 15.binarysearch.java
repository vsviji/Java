public class BinarySearch {

    public static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1; // Return -1 if the target is not found in the array
    }

    public static void main(String[] args) {
        int[] myArray = {1, 3, 5, 7, 9, 11, 13};
        int targetValue = 7;
        int result = binarySearch(myArray, targetValue);

        if (result != -1) {
            System.out.println("Found " + targetValue + " at index " + result);
        } else {
            System.out.println(targetValue + " not found in the array");
        }
    }
}
