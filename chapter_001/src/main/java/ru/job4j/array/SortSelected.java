package ru.job4j.array;

public class SortSelected {
    public static int[] sort(int[] data) {
        for (int step = 0; step < data.length; step++) {
            int min = MinDiapason.findMin(data, step, data.length - 1);
            int index = FindLoop.indexOf(data, min, step, data.length);
            if (data[step] > min) {
                int tmp = data[step];
                data[step] = data[index];
                data[index] = tmp;
            }
        }
        return data;
    }
}