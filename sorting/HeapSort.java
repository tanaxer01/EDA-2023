package sorting;

import structures.MaxHeap;

public class HeapSort {
    private MaxHeap heap;

    public static void sort(int arr[]) {
        // Ordenamos el arreglo como heap.
        for (int i = arr.length/2 - 1;i > 0;i--)
            heapify(arr, i);

        // Extraemos el maximo y reordenamos
        for (int i = arr.length - 1; i > 0; i--) {
            int tmp = arr[0];
            arr[0] = arr[i];
            arr[i] = tmp;

            heapify(arr, 0);
        }
    }

    public void sort2(int arr[]) {
        heap = new MaxHeap(arr.length);

        // Ingresamos los elementos al heap
        for (int i: arr)
            heap.insert(i);

        for (int i=0;i < arr.length; i++)
            arr[i] = heap.extractMax();
    }

    static void swap(int arr[], int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    static void heapify(int arr[], int i) {
        int l = 2 * i + 1;
        int r = 2 * i + 2;
        int largest = i;

        if (l < arr.length && arr[l] > arr[largest]) 
            largest = l;

        if (r < arr.length && arr[r] > arr[largest]) 
            largest = r;

        if (largest != i) {
            swap(arr, i, largest);
            heapify(arr, largest);
        }
    }
}
