import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int[] sizes = {1000, 10000, 100000, 500000, 1000000};
        for (int size : sizes) {
            System.out.println("Tamanho: " + size);
            for (int run = 0; run < 5; run++) {
                int[] array = generateRandomArray(size, run);
                evaluateSort(array.clone(), new InsertSort(), "Insert Sort");
                evaluateSort(array.clone(), new QuickSort(), "Quick Sort");
                evaluateSort(array.clone(), new ShellSort(), "Shell Sort");
                evaluateSort(array.clone(), new CountingSort(), "Counting Sort");
            }
        }
    }

    static int[] generateRandomArray(int size, int seed) {
        Random random = new Random(seed);
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(1000000); // Limite de valores
        }
        return array;
    }

    static void evaluateSort(int[] array, InsertSort algorithm, String name) {
        long startTime = System.nanoTime();
        long swaps = algorithm.sort(array);
        long endTime = System.nanoTime();
        long duration = endTime - startTime;

        System.out.printf("%s - Tempo: %d ns, Trocas: %d%n", name, duration, swaps);
    }

    static void evaluateSort(int[] array, QuickSort algorithm, String name) {
        long startTime = System.nanoTime();
        long swaps = algorithm.sort(array);
        long endTime = System.nanoTime();
        long duration = endTime - startTime;

        System.out.printf("%s - Tempo: %d ns, Trocas: %d%n", name, duration, swaps);
    }

    static void evaluateSort(int[] array, ShellSort algorithm, String name) {
        long startTime = System.nanoTime();
        long swaps = algorithm.sort(array);
        long endTime = System.nanoTime();
        long duration = endTime - startTime;

        System.out.printf("%s - Tempo: %d ns, Trocas: %d%n", name, duration, swaps);
    }

    static void evaluateSort(int[] array, CountingSort algorithm, String name) {
        long startTime = System.nanoTime();
        algorithm.sort(array);
        long endTime = System.nanoTime();
        long duration = endTime - startTime;

        System.out.printf("%s - Tempo: %d ns, Trocas: 0%n", name, duration);
    }
}
