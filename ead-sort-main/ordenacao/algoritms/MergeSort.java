package ordenacao.algoritms;

import ordenacao.Sorter;

public class MergeSort implements Sorter {

    @Override
    public int[] sort(int[] elements) {
        if (elements.length < 2) {
            return elements;
        }
        int meio = elements.length / 2;
        int[] esquerda = new int[meio];
        int[] direita = new int[elements.length - meio];
        for (int i = 0; i < meio; i++) {
            esquerda[i] = elements[i];
        }
        for (int i = meio; i < elements.length; i++) {
            direita[i - meio] = elements[i];
        }
        sort(esquerda);
        sort(direita);
        merge(esquerda, direita, elements);
        return elements;
    }

    private void merge(int[] arrayEsq, int[] arrayDir, int[] array) {
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < arrayEsq.length && j < arrayDir.length) {
            if (arrayEsq[i] <= arrayDir[j]) {
                array[k] = arrayEsq[i];
                i++;
            } else {
                array[k] = arrayDir[j];
                j++;
            }
            k++;
        }
        while (i < arrayEsq.length) {
            array[k] = arrayEsq[i];
            i++;
            k++;
        }
        while (j < arrayDir.length) {
            array[k] = arrayDir[j];
            j++;
            k++;
        }
    }

    @Override
    public String getName() {
        return "MergeSort";
    }
}