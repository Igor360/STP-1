package Sorting.Realization;

import Interface.UserInterface;
import array.Array;

/**
 * it is class who realize selection sorting
 */
public class SelectionSort {

    /**
     * a method which sorts by exchanging a min element with an element of the first non-sorted position
     * @param arrayNumbers
     */
    public static void sort(int[] arrayNumbers){
        int size = arrayNumbers.length;
        int minValueIndex = 0;
        int timeValue = 0;
        for (int i = 0; i < size - 1; i++){
            minValueIndex = i;
            for (int j = i+1; j < size; j++){
                if(arrayNumbers[j] < arrayNumbers[minValueIndex])
                    minValueIndex = j;
            }
            timeValue = arrayNumbers[i]; // get element from array
            arrayNumbers[i] = arrayNumbers[minValueIndex]; //change next element
            arrayNumbers[minValueIndex] = timeValue;
        }
    }

    public static void showTimeSorting(Array array){
        long start = 0, end = 0;
        start = System.nanoTime();
        sort(array.getArray());
        end = System.nanoTime();
        System.out.printf("Select sort time : %s \n\r", UserInterface.changeTimeFormat(end - start));
    }

}
