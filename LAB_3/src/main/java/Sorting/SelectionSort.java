package Sorting;

public class SelectionSort {
    public static void sort(GeneratedData arrayNumbers){ // method who sorting our array using selection sort
        int size = arrayNumbers.getSize();
        int minValueIndex = 0;
        int timeValue = 0;
        for (int i = 0; i < size - 1; i++){
            minValueIndex = i;
            for (int j = i+1; j < size; j++){
                if(arrayNumbers.comparisonTwoNumbers(j,minValueIndex,"<"))
                    minValueIndex = j;
            }
            timeValue = arrayNumbers.getElement(i);
            arrayNumbers.setElement(i,arrayNumbers.getElement(minValueIndex));
            arrayNumbers.setElement(minValueIndex,timeValue);
        }
    }
}
