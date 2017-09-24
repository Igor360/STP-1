package Sorting;


/**
 *  it is class who realize odd even sorting
 */
public class OddEvenSort {

    /**
     * The method which sorts by comparing all the pair / odd pairs of items in the list
     * @param array
     */
    public static void sort(int [] array) {
        int arraySize = array.length;
        boolean sorted = false;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < arraySize - 1; i += 2) {
                if (array[i] > array[i+1]) {
                    int temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    sorted = false;
                }
            }
            for (int i = 1; i < arraySize - 1; i += 2) {
                if (array[i] > array[i+1]) {
                    int temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    sorted = false;
                }
            }
        }

    }
}
