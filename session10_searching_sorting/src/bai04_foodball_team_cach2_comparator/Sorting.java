package bai04_foodball_team_cach2_comparator;

import java.util.Comparator;
import java.util.List;

public class Sorting {

    public static class BubbleSort<T> implements ISortAlgorithm_comparator<T> {
        @Override
        public void sort(List<T> list, Comparator<T> comparator) {
            int n = list.size();
            boolean check = true;

            for (int i = 0; i < n - 1 && check; i++) {
                check = false;

                for (int j = 0; j < n - 1; j++) {
                    if (comparator.compare(list.get(j), list.get(j + 1)) > 0) {
                        T temp = list.get(j);
                        list.set(j, list.get(j + 1));
                        list.set(j + 1, temp);
                        check = true;
                    }
                }
            }
        }
    }

    public static class SelectionSort<T> implements ISortAlgorithm_comparator<T> {
        @Override
        public void sort(List<T> list, Comparator<T> comparator) {
            int n = list.size();

            for (int i = 0; i < n - 1; i++) {
                int minIndex = i;

                for (int j = i + 1; j < n; j++) {
                    if (comparator.compare(list.get(j), list.get(minIndex)) < 0) {
                        minIndex = j;
                    }
                }

                if (minIndex != i) {
                    T temp = list.get(minIndex);
                    list.set(minIndex, list.get(i));
                    list.set(i, temp);
                }
            }
        }
    }

    public static class InsertSort<T> implements ISortAlgorithm_comparator<T> {
        @Override
        public void sort(List<T> list, Comparator<T> comparator) {
            int n = list.size();

            for (int i = 1; i < n; ++i) {
                T key = list.get(i);
                int j = i - 1;

                while (j >= 0 && comparator.compare(list.get(j), key) < 0) {
                    list.set(j + 1, list.get(j));
                    j--;
                }

                list.set(j + 1, key);
            }
        }
    }
}
