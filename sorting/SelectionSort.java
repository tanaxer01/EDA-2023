package sorting;

public class SelectionSort {
    public static void sort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {

            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min])
                    min = j;
            }

            int tmp  = arr[min];
            arr[min] = arr[i];
            arr[i]   = tmp;
        }
    }

    public static void recursive_sort(int arr[], int n) {
        // Caso base
        if (n == arr.length - 1)
            return;

        // Buscamos el minimo en esta iteración para dejarlo en el puesto n.
        int min = n;
        for (int j = n+1; j < arr.length; j++) {
            if (arr[j] < arr[min])
                min = j;
        }

        int tmp  = arr[min];
        arr[min] = arr[n];
        arr[n]   = tmp;

        // A diferencia de BubbleSort aqui es necesario realizar todas las
        // iteraciones, independiente del resultado de esta iteración.
        recursive_sort(arr, n+1);
    }
}
