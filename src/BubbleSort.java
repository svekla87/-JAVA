import java.util.Arrays;

public class BubbleSort {
    public static void bubbleSort(int[] array) {
        boolean isSorted = false;

        while (!isSorted) {
            isSorted = true;

            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    int temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                    isSorted = false;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {4, 0, 9, 10, 58, -1, -89};
        bubbleSort(array);
        System.out.println("Массив " + Arrays.toString(array) + " отсортирован \"пузырьком\"");
    }
}