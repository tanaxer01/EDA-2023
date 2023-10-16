package sorting;

public class BubbleSort {
    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i   - 1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void improved_sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            boolean flag = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = true;
                }
            }

            // Si no se hicieron cambios, el arreglo ya esta ordenado.
            if (flag == false)
                break;
        }
    }

    public static void recursive_sort(int[] arr, int n) {
        // Caso base
        if (n == 1)
            return;

        boolean flag = false;
        // En una iteración dejamos el maximo en el ultimo puesto.
        for (int j = 0; j < n - 1; j++) {
            if (arr[j] > arr[j+1]) {
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
                flag = true;
            }
        }

        // Al igual que en el caso pasado, si no hay cambios,
        // el arreglo esta ordenado.
        if (flag == false)
            return;

        recursive_sort(arr, n-1);
    }
}
