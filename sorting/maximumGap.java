package sorting;

public class maximumGap {
    public static int solution1(int[] arr) {
        // 1. Ordenamos el arreglo 
        InsertionSort.sort(arr);

        int max_gap = 0;
        // 2. Revisamos los gaps en el arreglo.
        for (int i = 0; i < arr.length - 1; i++) {
            int curr_gap = arr[i+1] - arr[i];

            if (max_gap < curr_gap) {
                max_gap = curr_gap;
            }
        }

        return max_gap;
    }

    public static void main(String[] args) {
        int[] arr = {3, 6, 9, 1};
        int max_gap = solution1(arr);

        System.out.println(max_gap);
    }

}
