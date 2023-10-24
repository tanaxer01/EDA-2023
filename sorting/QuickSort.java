package sorting;

public class QuickSort {
    public static void sort(int arr[], int l, int r) {
        // Caso base
        if (l >= r) 
            return;

        // Ordenamos la particion segun el pivote 
        int m = partition(arr, l, r);

        // Generamos las diviciones, sin incluir el pivote. 
        sort(arr, l, m-1);
        sort(arr, m+1, r);
    }

    static int partition(int arr[], int l, int r) {
        // En este caso el pivote es el primer elemento.
        int pivot = r;
        for (int i = l; i < r; i++) {
            // Si arr[i] es menor al pivote a la izquierda de donde va a estar el pivote.
            if (arr[pivot] >= arr[i]) {
                int temp = arr[i];
                arr[i] = arr[l];
                arr[l] = temp;

                l++;
            }
        }

        // Colocamos al pivot en su lugar 
        int temp = arr[pivot];
        arr[pivot] = arr[l];
        arr[l] = temp;

        return l;
    }


}