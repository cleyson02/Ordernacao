import ordenacao.Sorter;

public class SelectionSort implements Sorter {

    @Override
    public int[] sort(int[] elements) {
        for (int i = 0; i < elements.length - 1; i++) {
            int menor = i;
            for (int j = i + 1; j < elements.length; j++) {
                if (elements[j] < elements[menor]) {
                    menor = j;
                }
            }

            int aux = elements[menor];
            elements[menor] = elements[i];
            elements[i] = aux;
        }
        int[] sorted = elements.clone();
        return sorted;
    }

    @Override
    public String getName() {
        return "SelectionSort";
    }
}