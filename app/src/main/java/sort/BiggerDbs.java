package sort;

public class BiggerDbs {
    public static void mergeSort(int[] normalArray) {
        if (normalArray.length < 2) {
            return;
        }
        int mid = normalArray.length / 2;
        int[] left = new int[mid];
        int[] right = new int[normalArray.length - mid];
        for (int i = 0; i < left.length; i++) {
            left[i] = normalArray[i];
        }
        for (int i = 0; i < right.length; i++) {
            right[i] = normalArray[mid + i];
        }
        mergeSort(left);
        mergeSort(right);
        sumArrays(left, right, normalArray, mid, normalArray.length - mid);
    }

    public static void sumArrays(int[] left, int[] right, int[] normal_array, int mid, int rest) {
        int i = 0, j = 0, z = 0;
        while (i < mid && j < rest) {
            if (left[i] < right[j]) {
                normal_array[z++] = left[i++];
            } else {
                normal_array[z++] = right[j++];
            }
        }
        while (i < mid) {
            normal_array[z++] = left[i++];
        }
        while (j < rest) {
            normal_array[z++] = right[j++];
        }
    }
}
