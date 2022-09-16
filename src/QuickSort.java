import java.util.Arrays;

public class QuickSort {
        public static void quickSort(int[] array, int left, int right) {

        if (left >= right) {
            return;
        }

        int middleIndex = left + (right - left) / 2;
        int x = array[middleIndex];

        int i = left;
        int j = right;

        while (i <= j) {
            while (array[i] < x) {
                i++;
            }

            while (array[j] > x) {
                j--;
            }

            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;

                i++;
                j--;
            }
        }

        if (j > left) {
            quickSort(array, left, j);
        }

        if (i < right) {
            quickSort(array, i, right);
        }
    }

    public static void main(String[] args) {
        int[] array = {4, 0, 9, 10, 58, -1, -89};
        quickSort(array, 0, array.length - 1);
        System.out.println("Массив " + Arrays.toString(array) + " отсортирован с помощью \"быстрой сорировки\"");
    }
}