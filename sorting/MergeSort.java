package sorting;

public class MergeSort {
    public static void sort(int arr[], int l, int r) {
        // Caso base
        if (l >= r)
            return;

        // Punto medio entre l y r.
        int m = l + (r - l)/2;

        // Ordenamos ambas mitades.
        sort(arr,     l, m);
        sort(arr, m + 1, r);

        // Una vez ordenas, juntamos las mitades.
        merge(arr, l, m, r);
    }

    static void merge(int[] arr, int l, int m, int r) {
        // Calc tamaño de los subarreglos a juntar.
        int n1 = m - l + 1;
        int n2 = r - m;

        // Arreglos temporales
        int[] L = new int[n1]; // izq
        int[] R = new int[n2]; // der

        // Copiamos valores a los arreglos temporales
        for (int i = 0; i < n1; i++)
            L[i] = arr[l + i];

        for (int j = 0; j < n2; j++)
            R[j] = arr[m + 1 + j];

        // Ordenamos elementos de L y R hasta que alguno de
        // los arreglos se quede sin elementos.
        int i = 0, j = 0, k = l;
        while(i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        // Copiamos los elementos restantes de L si queda alguno.
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        // Copiamos los elementos restantes de R si queda alguno.
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
}
