package sorting;

import java.util.Random;

class Main {
    static int[] random_arr(int N, int max_num) {
        Random rand = new Random();
        int[]  arr  = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = rand.nextInt(max_num);
        }

        return arr;
    }

    static void print_arr(int[] arr) {
        for (int i: arr)
            System.out.printf("%d ",i);
        System.out.print("\n");
    }

    public static void main(String[] args) {
        int[] A = random_arr(10, 30);

        print_arr(A);
        InsertionSort.recursive_sort(A, A.length);
        print_arr(A);
    }
}
