package designPatterns.Behavioral;

public class Strategy {
    interface SortStrategy {
        void sort(int[] array);
    }

    class BubbleSortStrategy implements SortStrategy {

        @Override
        public void sort(int[] array) {
            System.out.println("Sort with bubble");
        }

    }

    class MergeSortStrategy implements SortStrategy {
        @Override
        public void sort(int[] array) {
            System.out.println("Sort with merge");
        }
    }

    class Sorter {
        private SortStrategy strategy;

        public void SetStrategy(SortStrategy strategy) {
            this.strategy = strategy;
        }

        public void performSort(int[] array) {
            strategy.sort(array);
        }
    }
}
