package ordenacao.algoritms;

import ordenacao.Sorter;

public class InsertionSort implements Sorter {

    @Override
    public int[] sort(int[] elements) {
        for (int i = 0; i < elements.length; i++) {
            int order = elements[i];
            int u = i - 1;

            while (u >= 0 && elements[u] > order) {
                elements[u + 1] = elements[u];
                u--;
            }

            elements[u + 1] = order;
        }
        int[] sorted = elements.clone();
        return sorted;
    }

    @Override
    public String getName() {
        return "InsertionSort";
    }
}