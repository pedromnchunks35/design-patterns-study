package paper;

public class Papper {
    public static void Sort(int[] normal_array) {
        if (normal_array.length < 2) {
            return;
        }
        int mid = normal_array.length / 2;
        int left[] = new int[mid];
        int right[] = new int[normal_array.length - mid];
        for (int i = 0; i < left.length; i++) {
            left[i] = normal_array[i];
        }
        for (int i = 0; i < right.length; i++) {
            right[i] = normal_array[mid + i];
        }
        Sort(left);
        Sort(right);
        SumArray(left, right, normal_array, mid, normal_array.length - mid);
    }

    public static void SumArray(int[] left, int[] right, int[] normal_array, int mid, int rest) {
        int i = 0, j = 0, z = 0;
        while (i < left.length && j < right.length) {
            if (right[j] < left[i]) {
                normal_array[z++] = right[j++];
            } else {
                normal_array[z++] = left[i++];
            }
        }
        while (i < left.length) {
            normal_array[z++] = left[i++];
        }
        while (j < right.length) {
            normal_array[z++] = right[j++];
        }
    }
}
