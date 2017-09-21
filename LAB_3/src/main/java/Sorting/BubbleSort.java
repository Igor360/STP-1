package Sorting;

public class BubbleSort {

    public static void sort(GeneratedData arrayNumbers){ // method who sorting our array using bubblesort
        int size = arrayNumbers.getSize();
        int timeValue = 0;
        for (int i = 0; i < size; i++)
        {
            for (int j = 1; j < size - i; j++ ){
                if (arrayNumbers.comparisonTwoNumbers(j-1,j,">"))
                {
                    timeValue = arrayNumbers.getElement(j-1); // get element from array
                    arrayNumbers.setElement(j-1,arrayNumbers.getElement(j)); //change next element
                    arrayNumbers.setElement(j, timeValue);
                }

            }
        }
    }



}
