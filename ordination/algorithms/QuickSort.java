import ordenacao.Sorter;

public class QuickSort implements Sorter {

    @Override
    public int[] sort(int[] elements) {
        int[] sorted = elements.clone();
        quicksort(sorted, 0, sorted.length - 1);
        return sorted;
    }

    private void quicksort(int[] array, int esquerda, int direita) {
        if (esquerda < direita) {
            int pivo = particao(array, esquerda, direita);
            quicksort(array, esquerda, pivo - 1);
            quicksort(array, pivo + 1, direita);
        }
    }

    private int particao(int[] array, int esquerda, int direita) {
        int pivo = array[direita];
        int i = esquerda - 1;
        for (int j = esquerda; j < direita; j++) {
            if (array[j] <= pivo) {
                i++;
                int aux = array[i];
                array[i] = array[j];
                array[j] = aux;
            }
        }
        int aux = array[i + 1];
        array[i + 1] = array[direita];
        array[direita] = aux;
        return i + 1;
    }

    @Override
    public String getName() {
        return "QuickSort";
    }
}