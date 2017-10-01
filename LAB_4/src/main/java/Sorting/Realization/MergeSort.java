package Sorting.Realization;

import Interface.UserInterface;
import array.Array;

/**
 *  it is class who realize merge sorting
 */
public class MergeSort {
    private static int[] array;  // our array
    private static int[] tempMergArr; // time array
    private static int length; // size array

    /**
     * method who sort our array using merge sort
     * @param inputArr the array who will be sorting
     */
    public static void sort(int inputArr[]) {
        array = inputArr;
        length = inputArr.length;
        tempMergArr = new int[length];
        doMergeSort(0, length - 1);
    }

    /**
     * method who separate our array on parts then sorting data and merge two sorted arrays
     * @param lowerIndex
     * @param higherIndex
     */
    private static void doMergeSort(int lowerIndex, int higherIndex) {

        if (lowerIndex < higherIndex) {
            int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
            // Below step sorts the left side of the array
            doMergeSort(lowerIndex, middle);
            // Below step sorts the right side of the array
            doMergeSort(middle + 1, higherIndex);
            // Now merge both sides
            mergeParts(lowerIndex, middle, higherIndex);
        }
    }

    /**
     * method who merge parts
     * @param lowerIndex
     * @param middle
     * @param higherIndex
     */
    private static void mergeParts(int lowerIndex, int middle, int higherIndex) {

        for (int i = lowerIndex; i <= higherIndex; i++) {
            tempMergArr[i] = array[i];
        }
        int i = lowerIndex;
        int j = middle + 1;
        int k = lowerIndex;
        while (i <= middle && j <= higherIndex) {
            if (tempMergArr[i] <= tempMergArr[j]) {
                array[k] = tempMergArr[i];
                i++;
            } else {
                array[k] = tempMergArr[j];
                j++;
            }
            k++;
        }
        while (i <= middle) {
            array[k] = tempMergArr[i];
            k++;
            i++;
        }

    }

    public static void showTimeSorting(Array array){
        long start = 0, end = 0;
        start = System.nanoTime();
        sort(array.getArray());
        end = System.nanoTime();
        System.out.printf("Merge sort time : %s \n\r", UserInterface.changeTimeFormat(end - start));
    }

}
