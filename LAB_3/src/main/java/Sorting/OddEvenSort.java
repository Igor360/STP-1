package Sorting;

public class OddEvenSort {
    public static void sort(GeneratedData array) {  // // method who sorting our array using odd even  sort
        int arraySize = array.getSize();
        boolean sorted = false;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < arraySize - 1; i += 2) {
                if (array.comparisonTwoNumbers(i,i+1,">")) {
                    int temp = array.getElement(i);
                    array.setElement(i,array.getElement(i+1));
                    array.setElement(i+1,temp);
                    sorted = false;
                }
            }
            for (int i = 1; i < arraySize - 1; i += 2) {
                if (array.comparisonTwoNumbers(i,i+1,">")) {
                    int temp = array.getElement(i);
                    array.setElement(i,array.getElement(i+1));
                    array.setElement(i+1,temp);
                    sorted = false;
                }
            }
        }

    }
}
