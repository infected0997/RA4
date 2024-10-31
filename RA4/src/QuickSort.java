public class QuickSort {

    public long sort(int[] array) {
        return quickSort(array, 0, array.length - 1);
    }

    private long quickSort(int[] array, int low, int high) {
        long swaps = 0;
        if (low < high) {
            int pi = partition(array, low, high);
            swaps += quickSort(array, low, pi - 1);
            swaps += quickSort(array, pi + 1, high);
        }
        return swaps;
    }

    private int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = low - 1;
        int swaps = 0;
        for (int j = low; j < high; j++) {
            if (array[j] < pivot) {
                i++;
                swap(array, i, j);
                swaps++;
            }
        }
        swap(array, i + 1, high);
        swaps++;
        return i + 1;
    }

    private void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
