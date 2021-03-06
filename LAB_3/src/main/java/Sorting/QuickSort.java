package Sorting;

/**
 * it is class who realize quick sorting
 */
public class QuickSort {

    /**
     * method who sorting our array using  quick sort
     * @param arrayNumbers
     */
    public static void sort(int[] arrayNumbers){
        int startArray = 0;
        int endArray = arrayNumbers.length-1;
        quickSort(arrayNumbers, startArray, endArray);

    }

    /**
     * a method which sorts the recursive parts of the array
     * @param arrayNumbers
     * @param start
     * @param end
     */
    private static void quickSort(int[] arrayNumbers, int start, int end){ //
        int timeVale = 0;
        int i = start;
        int j = end;
        int randVal = arrayNumbers[start+(end -start)/2];
        do {
            while (arrayNumbers[i] < randVal) ++i;
            while (arrayNumbers[j] > randVal) --j;
            if ( i <= j){
                timeVale = arrayNumbers[i];
                arrayNumbers[i] =  arrayNumbers[j];
                arrayNumbers[j] = timeVale;
                i++;
                j--;
            }
        }while( i <= j );
        if (start < j) quickSort(arrayNumbers, start, j);
        if (i < end) quickSort(arrayNumbers, i,end);
    }
}
