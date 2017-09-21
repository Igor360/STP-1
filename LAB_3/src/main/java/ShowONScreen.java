import Sorting.*;

public class ShowONScreen {

    public static void main(String []args){
        GeneratedData array = new GeneratedData(10);
        array.showArray();
       // BubbleSort.sort(array);
       // SelectionSort.sort(array);
       // QuickSort.sort(array);
       // OddEvenSort.sort(array);
        MergeSort.sort(array.getArray());
        array.showArray();
    }

}
