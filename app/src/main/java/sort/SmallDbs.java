package sort;

public class SmallDbs {

    public static void MyOwnSorting(int[] mapToSort) {
        for (int i = 0; i < mapToSort.length; i++) {
            for (int j = 0; j < mapToSort.length; j++) {
                int a = mapToSort[i];
                int b = mapToSort[j];
                if (b > a) {
                    mapToSort[i] = b;
                    mapToSort[j] = a;
                }
            }
        }
    }

    public static void BubbleSort(int[] mapToSort) {
        int length = mapToSort.length;
        boolean sorted = true;
        while (sorted == true) {
            sorted = false;
            for (int i = 0; i < length - 1; i++) {
                int a = mapToSort[i];
                int b = mapToSort[i + 1];
                if (a > b) {
                    mapToSort[i] = b;
                    mapToSort[i + 1] = a;
                    sorted = true;
                }
            }
        }
    }

}
