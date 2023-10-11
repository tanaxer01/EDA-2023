package sorting;

public class InsertionSort {
    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int key = arr[i];
            
            int j = i - 1;
            while(j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j+ 1] = key;

            // Mismo proceso pero con un for loop.
            // for (int j = i-1; j >= 0 && arr[j] > key; j--) {
            //     arr[j + 1] = arr[j];
            // }
        }
    }
}
