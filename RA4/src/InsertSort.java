public class InsertSort {

    public long sort(int[] array) {
        long swaps = 0;
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
                swaps++;
            }
            array[j + 1] = key;
        }
        return swaps;
    }
}
