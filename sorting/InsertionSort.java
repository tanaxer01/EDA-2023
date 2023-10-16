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
        }
    }

    public static void recursive_sort(int[] arr, int n) {
        // Caso base
        if (n <= 1)
            return;

        // Ordenamos los primeros n-1 elementos
        recursive_sort(arr, n-1);

        int key = arr[n-1];
        int j   = n - 2;
        // Por que n - 2?

        // En cada iteración mantenemos el arreglo ordenado hasta n.
        while(j >= 0 && arr[j] > key) {
            arr[j+1] = arr[j];
            j--;
        }
        arr[j+1] = key;
    }
}
