package Sorting;

public class QuickSort {
    public static void sort(GeneratedData arrayNumbers){ // method who sorting our array using  quick sort
        int startArray = 0;
        int endArray = arrayNumbers.getSize()-1;
        quickSort(arrayNumbers, startArray, endArray);

    }
    private static void quickSort(GeneratedData arrayNumbers, int start, int end){ //
        int timeVale = 0;
        int i = start;
        int j = end;
        int randVal = arrayNumbers.getElement(start+(end -start)/2);
        do {
            while (arrayNumbers.getElement(i) < randVal) ++i;
            while (arrayNumbers.getElement(j) > randVal) --j;
            if ( i <= j){
                timeVale = arrayNumbers.getElement(i);
                arrayNumbers.setElement(i, arrayNumbers.getElement(j));
                arrayNumbers.setElement(j,timeVale);
                i++;
                j--;
            }
        }while( i <= j );
        if (start < j) quickSort(arrayNumbers, start, j);
        if (i < end) quickSort(arrayNumbers, i,end);

    }
}
