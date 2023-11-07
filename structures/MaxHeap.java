package structures;

public class MaxHeap {
    private int[] heap;
    private int size;
    private int maxsize;

    public MaxHeap(int maxsize) {
        this.maxsize = maxsize;
        this.size = 0;

        this.heap = new int[this.maxsize + 1];
        this.heap[0] = Integer.MAX_VALUE;
    }

    public boolean empty() { return size == 0; }

    public int length() { return size; }

    private int parent(int pos) { return pos / 2; }

    private int left(int pos) { return 2 * pos; }

    private int right(int pos) { return 2 * pos + 1; }

    // Mismo swap de toda la vida pero lo pasamos a una función para ordenar el código.
    private void swap(int i, int j) {
        int tmp = heap[i];
        heap[i] = heap[j];
        heap[j] = tmp;
    }
    
    private void maxHeapify(int i) {
        int l = left(i);
        int r = right(i);
        int largest = i;

        // Revisamos si se cumple la condición de un max-heap
        if (l <= size && heap[l] > heap[i])
            largest = l;

        if (r <= size && heap[r] > heap[largest])
            largest = r;

        // Si no se cumple la condición, volvemos a llamar la función
        if (largest != i) { 
            swap(i, largest);
            maxHeapify(largest);
        }
    }

    public void BuildMaxHeap(int A[]) {
        // pasamos los numeros de A al heap
        size = A.length;
        for (int i=0;i<A.length;i++) {
            heap[i+1] = A[i];
        }

        // Ordenamos el heap
        for (int i = A.length/2; i > 0; i--) {
            maxHeapify(i);
        }
    }

    // Metodos de una Priority Queue 
    public int maximum() throws Exception {
        if (size < 1)
            throw new Exception("error: heap underflow");

        return heap[1];
    }

    public int extractMax() {
        int max = Integer.MIN_VALUE;

        try {
            max = maximum();
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Borramos la raiz y ordenamos el heap
        heap[1] = heap[size];
        size--;
        maxHeapify(1);

        return max;
    }

    private void increaseKey(int i) {
        int temp = heap[i];

        // Si el padre es menor cambiamos, hasta encontrar el lugar correcto.
        while (i > 1 && temp > heap[parent(i)]) {
            heap[i] = heap[parent(i)];
            i = parent(i);
        }
        heap[i] = temp;
    }

    public void insert(int k) {
        size++;
        heap[size] = k;
        increaseKey(size);
    }
}
