import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 5};

        int n = ar25.remdupinarray.javar.length;

        // Sort the array to group duplicate elements together
        Arrays.sort(arr);

        int newSize = 0;

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                arr[newSize] = arr[i];
                newSize++;
            }
        }

        arr[newSize] = arr[n - 1];
        newSize++;

        // Create a new array with unique elements
        int[] result = Arrays.copyOf(arr, newSize);

        System.out.println(Arrays.toString(result));
    }
}
