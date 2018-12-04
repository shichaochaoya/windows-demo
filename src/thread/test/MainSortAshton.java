package thread.test;

public class MainSortAshton {




}
class QuickSortB {

    private static int partition(Long[] numbers, int low, int high) {

        Long soldier = numbers[low];
        while (low < high) {
            while (low < high) {
                if (numbers[high] < soldier) {
                    numbers[low] = numbers[high];
                    break;
                }
                high--;
            }
            while (low < high) {
                if (numbers[low] > soldier) {
                    numbers[high] = numbers[low];
                    break;
                }
                low++;
            }
        }
        numbers[low] = soldier;
        return low;
    }

    public static void qsort(Long[] numbers, int low, int high) {
        if (low < high) {
            int soldier = partition(numbers, low, high);
            qsort(numbers, low, soldier - 1);
            qsort(numbers, soldier + 1, high);
        }
    }

}
