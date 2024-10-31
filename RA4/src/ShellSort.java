public class ShellSort {

    public long sort(int[] array) {
        int n = array.length;
        long swaps = 0;
        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                int temp = array[i];
                int j;
                for (j = i; j >= gap && array[j - gap] > temp; j -= gap) {
                    array[j] = array[j - gap];
                    swaps++;
                }
                array[j] = temp;
            }
        }
        return swaps;
    }
}
