public class CountingSort {

    public void sort(int[] array) {
        int max = findMax(array);
        int[] count = new int[max + 1];
        for (int num : array) {
            count[num]++;
        }
        int index = 0;
        for (int i = 0; i <= max; i++) {
            while (count[i] > 0) {
                array[index++] = i;
                count[i]--;
            }
        }
        // Não conta trocas, então não há retorno
    }

    private int findMax(int[] array) {
        int max = array[0];
        for (int num : array) {
            if (num > max) max = num;
        }
        return max;
    }
}
