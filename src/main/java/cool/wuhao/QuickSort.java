package cool.wuhao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuickSort {

    private static List<Integer> quickSort(List<Integer> list) {
        List<Integer> result = new ArrayList<>();
        if (list.size() < 2) {
            return list;
        } else {
            int pivotIndex = choosePivot(list);
            Integer pivot = list.get(pivotIndex);
            List<Integer> left = new ArrayList<>();
            List<Integer> right = new ArrayList<>();
            for (int i = 0; i < list.size(); i++) {
                if (i == pivotIndex) {
                    continue;
                }
                Integer current = list.get(i);
                if (current < pivot) {
                    left.add(current);
                } else {
                    right.add(current);
                }
            }
            result.addAll(quickSort(left));
            result.add(pivot);
            result.addAll(quickSort(right));
            return result;
        }
    }

    private static int choosePivot(List<Integer> list) {
        // 在这里你可以选择不同的策略来选择基准元素的索引
        // 这里简单地选择列表中的中间元素作为基准
        return list.size() / 2;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 4, 6, 6, 6, 3, 2, 5));

        List<Integer> integers = quickSort(list);
        System.out.println(integers);
    }
}
