package sorting;

public class missingCoinSum {
    public static int solution1(int[] arr) {
        // 1. Ordenamos el arreglo
        BubbleSort.sort(arr);

        int smallestSum = 1;
        // 2. Revisamos el arreglo ordenado.
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > smallestSum)  
                // En este caso, no podriamos armar smallestSum. 
                break;

            // En cualquier otro caso.
            smallestSum += arr[i];
        }

        return smallestSum;
    }

    public static int solution2(int[] arr) {
        // 1. Ordenamos el arreglo
        SelectionSort.sort(arr);
        
        int smallestSum = 1;
        // 2. Es lo mismo que en el caso anterior, pero
        // revisamos todo en la condición del for loop.
        for (int i = 0; i < arr.length && arr[i] <= smallestSum; i++) {
            smallestSum += arr[i];
        }

        return smallestSum;
    }

    public static void main(String[] args) {
        int[] arr = {2, 9, 1, 2, 7};
        System.out.println(solution1(arr));
        System.out.println(solution2(arr));
    } 

}
